package accomodationapp.accomodationapp.Model;


public class User {

    private long Id;
    private String FirstName;
    private String LastName;
    private String Username;
    private long Age;

    public User() {
    }

    public User(long id, String firstName, String lastName, String username, long age) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Username = username;
        Age = age;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public long getAge() {
        return Age;
    }

    public void setAge(long age) {
        Age = age;
    }
}
