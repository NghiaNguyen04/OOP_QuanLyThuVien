package model;

public class LibrarySlipdetails {
    private String librarySlipID;
    private int numberOfBookBorrowed;
    private String[] bookID;
    private String bookStatusAfter;
    private String originalBookStatus;
    private double fine;

    public String getLibrarySlipID() {
        return librarySlipID;
    }

    public void setLibrarySlipID(String librarySlipID) {
        this.librarySlipID = librarySlipID;
    }

    public int getNumberOfBookBorrowed() {
        return numberOfBookBorrowed;
    }

    public void setNumberOfBookBorrowed(int numberOfBookBorrowed) {
        this.numberOfBookBorrowed = numberOfBookBorrowed;
    }

    public String[] getBookID() {
        return bookID;
    }

    public void setBookID(String[] bookID) {
        this.bookID = bookID;
    }

    public String getBookStatusAfter() {
        return bookStatusAfter;
    }

    public void setBookStatusAfter(String bookStatusAfter) {
        this.bookStatusAfter = bookStatusAfter;
    }

    public String getOriginalBookStatus() {
        return originalBookStatus;
    }

    public void setOriginalBookStatus(String originalBookStatus) {
        this.originalBookStatus = originalBookStatus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public LibrarySlipdetails() {
    }

    public LibrarySlipdetails(String librarySlipID, int numberOfBookBorrowed, String[] bookID, String bookStatusAfter, String originalBookStatus, double fine) {
        this.librarySlipID = librarySlipID;
        this.numberOfBookBorrowed = numberOfBookBorrowed;
        this.bookID = bookID;
        this.bookStatusAfter = bookStatusAfter;
        this.originalBookStatus = originalBookStatus;
        this.fine = fine;
    }
}
