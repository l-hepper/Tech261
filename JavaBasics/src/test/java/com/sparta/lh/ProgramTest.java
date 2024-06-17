package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test
    @DisplayName("First test")
    public void basicTest() {
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, then the greeting should be 'Good Evening'")
    public void checkThat21GivesGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good Evening";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 5, then the greeting should be 'Good Morning'")
    public void checkThat5GivesGoodMorning() {
        int time = 5;
        String expectedGreeting = "Good Morning";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 18, then the greeting should be 'Good Afternoon'")
    public void checkThat18GivesGoodAfternoon() {
        int time = 18;
        String expectedGreeting = "Good Afternoon";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be 'Good Afternoon'")
    public void checkThat12GivesGoodAfternoon() {
        int time = 12;
        String expectedGreeting = "Good Afternoon";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting); // if/else is evaluating to true for the 1st condition before going to the second
    }

    @Test
    @DisplayName("Given a time of 7, then the greeting should be 'Good Morning'")
    public void checkThat7GivesGoodMorning() {
        int time = 7;
        String expectedGreeting = "Good Morning";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 15, then the greeting should be 'Good Afternoon'")
    public void checkThat15GivesGoodAfternoon() {
        int time = 15;
        String expectedGreeting = "Good Afternoon";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 0, then the greeting should be 'Good Evening'")
    public void checkThat0GivesGoodEvening() {
        int time = 0;
        String expectedGreeting = "Good Evening";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
}
