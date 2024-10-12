package MainPackage.User;

public class User {
    private String id;
    private String name;
    private String phoneNo;
    private String email;



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object obj) {

    }
}
