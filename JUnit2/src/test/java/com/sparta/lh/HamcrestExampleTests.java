package com.sparta.lh;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.time.LocalDate;


import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class HamcrestExampleTests {
    private Spartan liam;

    @BeforeEach
    void setUp() {
        liam = new Spartan(1, "Liam", "Java", LocalDate.of(2000, 1, 1));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests {

        @Test
        @DisplayName("Check that Spartan is called Liam")
        void checkThatSpartanIsCalledLiam() {
            assertThat(liam.getName(), Matchers.equalTo("Liam"));
        }

        // hamcrests recommends that you statically import ''assert that'
        // and also static import on everything in 'Matchers'
        @Test
        @DisplayName("check that spartan has a field called name")
        void checkThatSpartanHasAFieldCalledName() {
            assertThat(liam, hasProperty("name"));
        }

        @Test
        @DisplayName("Check that id is not negative")
        void checkThatSpartanIdIsNotNegative() {
            assertThat(liam.getId(), greaterThanOrEqualTo(0));
        }

        @Test
        @DisplayName("Check that Spartan age is within valid range")
        void checkThatSpartanAgeIsWithinValidRange() {
            assertThat(liam.getId(), allOf(greaterThanOrEqualTo(0), lessThanOrEqualTo(999999)));
        }

        @Test
        @DisplayName("Check that Spartan birth date is within a valid range")
        void checkThatSpartanBirthDateIsWithinValidRange() {
            LocalDate startDate = LocalDate.of(1990, 1, 1);
            LocalDate endDate = LocalDate.now();
            assertThat(liam.getStartDate(), allOf(greaterThanOrEqualTo(startDate), lessThanOrEqualTo(endDate)));
        }
    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods {

        @Test
        void checkThatNameIsNotEmpty() {
            assertThat(liam.getName(), is(not(emptyOrNullString())));
        }

        @Test
        void checkThatNameEndsWithIam() {
            assertThat(liam.getName(), endsWith("iam"));
        }

    }
}
