package com.sparta.lh;

public class App {
    public static void main(String[] args) {
        // mocking is useful when you want to test a class (with a defined interface)
        // but nothing else and so it's difficult to test (can also be useful for testing classes with dependencies such as connecting to database etc)
        // learn.microsoft.com/unit testing best practices

        // Mockito is useful for testing a class without complete implementation
        // FIRST - qualities of good unit tests
        // F - FAST - unit tests should be fast (milliseconds) because mature projects can have thousands of unit tests
        // I - ISOLATED - unit tests should be standalone and have no dependencies (outside of file system or database)
        // R - REPEATABLE - Should always return the same result when you run it between runs (if you haven't changed anythinhg
        // S - SELF-CHECKING - A TEST SHOULD automatically detect if it passed or failed without human interaction
        // T - TIMELY - Unit tests should not take long to write compared to the code being tested. If the test code takes a long time to write then
        // look at redesigning your code so it is more testable.

        // What is the industry standard for code coverage? 80%.
        // Why is a code coverage of 100% not a good goal? You hit diminishing returns (accounting for all edge cases could be massive undertaking)
        // What does code coverage measure? The amount of code covered by unit tests (NOT QUALITY OR ANYTHING ELSE)


        // Test doubles - putting something in to represent the same thing
        // Fake, Mock, Stub
        // Fake = generic term to desscribe a stub or mock object (Cathy: a system subbing for the real thing but not suitable for production) ie..e dummy database like an in memory database
        // mock = fake object that decides whether or not a unit test has passed or failed - a mock begins as a fake unit it is asserted against???
                //
        // stub = controllable replacement for an existing dependency (or collaborator) - you can use to test your code without dealing with the dependency directly.
        // a stub starts out as a fake

        // LLOK UP THE MOCKS DEATIL ON THE SPARTA GLOBAL GITHUB FOR MORE INFORMATION

        // a stub is something with predefined method calls
        //



        // ACTIVITY
        // ACADEMY -> GENERAL -> WIKI -> JAVA FURTHER READING -> MOCKITO -> TUTORIALS, ETC

        // TASK AFTER BREAK

        //


    }
}
