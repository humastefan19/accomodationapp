package accomodationapp.accomodationapp.Model;

public class Locations {
    private long Id;
    private String Name;


    public Locations(long id, String name) {
        Id = id;
        Name = name;
    }

    public Locations() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
