public class User {
    private String firstname;
    private String secondname;
    private int phonenumber;
    private String email;

    public User(String firstname, String secondname, int phonenumber, String email){
        this.firstname = firstname;
        this.secondname = secondname;
        this.phonenumber = phonenumber;
        this.email = email;

    }

    public String getFirstname() {
        return firstname;

    }
    public void setFirstname (String firstname){
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;}

    public void setSecondname(String secondname){
        this.secondname = secondname;

    }

    public int getPhonenumber(){
        return phonenumber;
    }


}




