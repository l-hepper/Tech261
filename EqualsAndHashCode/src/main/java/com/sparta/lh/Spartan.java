package com.sparta.lh;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;

    public Spartan(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Spartan spartan = (Spartan) o;
//        return Objects.equals(firstName, spartan.firstName) && Objects.equals(lastName, spartan.lastName);
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;   // if this instance is the same memory address as o then return true they must be the same
        }

        // if this is a spartan object
        if (object instanceof Spartan spartan) {

            // if they are the same, then do they have the same content?
            if (this.getFirstName().equals(spartan.getFirstName()) && (this.getLastName().equals(spartan.getLastName()))) {
                return true;
            }
        }

        return false;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
}
