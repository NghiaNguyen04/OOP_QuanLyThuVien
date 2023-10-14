package model;

import java.util.Arrays;
import java.util.Date;

public class Author {
    private String AuthorID;
    private String name;
    private String hometown;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private String biography;
    private String[] works; // Danh sách các tác phẩm

    public String getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(String authorID) {
        AuthorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String[] getWorks() {
        return works;
    }

    public void setWorks(String[] works) {
        this.works = works;
    }

    public Author() {
    }

    public Author(String authorID, String name, String hometown, Date dateOfBirth, Date dateOfDeath, String biography, String[] works) {
        AuthorID = authorID;
        this.name = name;
        this.hometown = hometown;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.biography = biography;
        this.works = works;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorID='" + AuthorID + '\'' +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfDeath=" + dateOfDeath +
                ", biography='" + biography + '\'' +
                ", works=" + Arrays.toString(works) +
                '}';
    }
}
