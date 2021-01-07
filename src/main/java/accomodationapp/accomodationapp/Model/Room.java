package accomodationapp.accomodationapp.Model;

public class Room {

    private int Id;
    private int AccomodationId;

    private String Name;
    private int NrOfPersons;
    private int NrOfRooms;
    private int NrOfRoomsReserved;
    private String Utilities;
    private String Description;

    public Room() {
    }

    public Room(int id, int accomodationId, String name, int nrOfPersons, int nrOfRooms, int nrOfRoomsReserved, String utilities, String description) {
        Id = id;
        AccomodationId = accomodationId;
        NrOfPersons = nrOfPersons;
        NrOfRooms = nrOfRooms;
        NrOfRoomsReserved = nrOfRoomsReserved;
        Utilities = utilities;
        Description = description;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNrOfRooms() {
        return NrOfRooms;
    }

    public void setNrOfRooms(int nrOfRooms) {
        NrOfRooms = nrOfRooms;
    }

    public int getNrOfRoomsReserved() {
        return NrOfRoomsReserved;
    }

    public void setNrOfRoomsReserved(int nrOfRoomsReserved) {
        NrOfRoomsReserved = nrOfRoomsReserved;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAccomodationId() {
        return AccomodationId;
    }

    public void setAccomodationId(int accomodationId) {
        AccomodationId = accomodationId;
    }

    public int getNrOfPersons() {
        return NrOfPersons;
    }

    public void setNrOfPersons(int nrOfPersons) {
        NrOfPersons = nrOfPersons;
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
