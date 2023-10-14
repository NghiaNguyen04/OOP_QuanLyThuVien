package model;

public class Admin {
    private String adminID;
    private String password;
    public String getAdminID() {
        return adminID;
    }
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public Admin(String adminID, String password) {
        this.adminID = adminID;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
