package com.sparta.pcw.codesmellsrefactoring;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class BaseClassTest
{

    @Test
    @DisplayName("getFullName returns correct name")
    public void givenNameOfCathyFrench_GetFullName_ReturnsCathyFrench()
    {
        // create a new BaseClass object, which represents a person
        var subject = new BaseClass("Cathy", "French");
        var result = subject.getFullName();
        MatcherAssert.assertThat(result, is("Cathy French"));
    }

    @Test
    @DisplayName("getFullName returns blank String when name is blank")
    public void givenNoName_GetFullName_ReturnsBlank()
    {
        // create a new BaseClass object, which represents a person
        var subject = new BaseClass("", "");
        var result = subject.getFullName();
        MatcherAssert.assertThat(result, is(" "));
    }

    @Test
    @DisplayName("getAge and setAge methods work correctly")
    public void givenAgeSetTo35_GetAge_Returns35()
    {
        var subject = new BaseClass("A", "B");
        subject.setAge(35);
        MatcherAssert.assertThat(subject.getAge(), is(35));
    }

    @Test
    @DisplayName("toString returns correct information")
    public void toString_ContainsExpectedStrings()
    {
        var subject = new BaseClass("Cathy", "French", 4, "High Street", "Stafford");
        subject.setAge(22);
        var result = subject.toString();
        MatcherAssert.assertThat(
                result,
                containsString("Name: Cathy  French Age: 22. Address: 4 High Street, Stafford"));
        MatcherAssert.assertThat(result, containsString("BaseClass"));
    }
}