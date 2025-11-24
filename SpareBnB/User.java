public class User {
    private String fullName;
    private int phoneNumber;
    private String dob;
    private String email;

    public User(String fullName, int phoneNumber, String dob, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUser() {
        System.out.println("User: " + fullName);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("-----------------------------------");
    }
}
