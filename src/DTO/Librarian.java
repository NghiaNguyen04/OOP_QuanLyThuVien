package DTO;

public class Librarian {
    private String librarianID;
    private String password;
    private String surName;
    private String firstName;
    private String phone;
    private String email;

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Librarian() {
    }

    public Librarian(String librarianID, String password, String surName, String firstName, String phone, String email) {
        this.librarianID = librarianID;
        this.password = password;
        this.surName = surName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "librarianID='" + librarianID + '\'' +
                ", password='" + password + '\'' +
                ", surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
