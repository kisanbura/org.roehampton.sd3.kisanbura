public class User {
    private String firstName;
    private String secondName;
    private int phoneNumber;
    private String dob;

    public User(String firstName, String secondName, int phoneNumber, String dob) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public void printUser() {
        System.out.println("User: " + firstName + " " + secondName);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("DOB: " + dob);
        System.out.println("-----------------------------------");
    }
}
