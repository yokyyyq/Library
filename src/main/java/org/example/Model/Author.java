package org.example.Model;

import java.time.LocalDate;
import java.util.Date;

public class Author {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String biography;

    public String getFirstName() { return firstName;}

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}

