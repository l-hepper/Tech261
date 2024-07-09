package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

public class SpartanRepositoryTests {

    SpartanRepository spartanRepository = new SpartanRepository();

    Spartan mock1 = Mockito.mock(Spartan.class);
    Spartan mock2 = Mockito.mock(Spartan.class);

    @BeforeEach
    public void setUp() {
        spartanRepository.addSpartan(mock1);
        spartanRepository.addSpartan(mock2);
    }

    @Test
    public void testAddSpartan() {
        assert(spartanRepository.getNumSpartans() == 2);
    }

    @Test
    public void testFindSpartan() {
        Mockito.when(mock2.getId()).thenReturn(27);
        Assertions.assertEquals(mock2, spartanRepository.findSpartan(27));
    }

    @Test
    public void testSpartansCreatedInLast24Hours() {
        Mockito.when(mock1.getStartDate()).thenReturn(java.time.LocalDate.now());
        Mockito.when(mock2.getStartDate()).thenReturn(java.time.LocalDate.now().minusDays(2));
        assert(spartanRepository.getSpartansCreatedLast24Hours().size() == 1);
    }

    @Test
    public void testSpartansCreatedInLast24Hours_multipleCall() {
        Mockito.when(mock1.getStartDate()).thenReturn(java.time.LocalDate.now());
        Mockito.when(mock2.getStartDate()).thenReturn(java.time.LocalDate.now().minusDays(2))
                .thenReturn(LocalDate.now());
        Assertions.assertEquals(1, spartanRepository.getSpartansCreatedLast24Hours().size());
        Assertions.assertEquals(2, spartanRepository.getSpartansCreatedLast24Hours().size());
    }

    @Test
    public void testChangeNameWhereNameIsNull() {
        Mockito.when(mock1.getId())
                .thenReturn(3);
        Mockito.doThrow(IllegalArgumentException.class)
                .when(mock1)
                .setName(Mockito.any(String.class));
        Assertions.assertFalse(spartanRepository.changeName(3, "Doris"));
    }

    // using a spy?
    @Test
    public void testCheckIdCalledOnce() {
        Spartan spartan = spartanRepository.findSpartan(20);
        Mockito.verify(mock1, Mockito.times(1)).getId();
        Mockito.verify(mock2, Mockito.times(1)).getId();
    }

    // there are so many things you can test for? how do you decide?
    // focus on what the most important things are to test for, essential functionality, security, etc, and focus on testing those.

    // testing that methods have been called in the correct order
    @Test
    public void testGetAllSpartansCallsGetIdThenGetName() {
        spartanRepository.getAllSpartans();
        InOrder inOrder = Mockito.inOrder(mock1);
        inOrder.verify(mock1).getId();
        inOrder.verify(mock1).getName();
    }

    @Test
    public void testCorrectParameter() {
        Mockito.when(mock1.getId()).thenReturn(3);
        spartanRepository.changeName(3, "Doris");
        Mockito.verify(mock1).setName("Doris");
    }
}
