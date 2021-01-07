package accomodationapp.accomodationapp.Model;

public class Accomodation {
    private int Id;
    private int LocationId;
    private String Name;
    private String Address;
    private int NrOfRooms;
    private String Utilities;
    private String Description;

    public Accomodation() {

    }

    public Accomodation(int id,int locationId, String name, String address, int nrOfRooms, String utilities, String description) {
        Id = id;
        LocationId = locationId;
        Name = name;
        Address = address;
        NrOfRooms = nrOfRooms;
        Utilities = utilities;
        Description = description;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNrOfRooms() {
        return NrOfRooms;
    }

    public void setNrOfRooms(int nrOfRooms) {
        NrOfRooms = nrOfRooms;
    }

    public String getUtilities() {
        return Utilities;
    }

    public void setUtilities(String utilities) {
        Utilities = utilities;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
