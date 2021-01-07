package accomodationapp.accomodationapp.querys;

public class RoomQuery {
    public final static String GET_ROOM_SQL = "select * from room";
    public final static String ADAUGA_ROOM ="INSERT INTO room(id,accomodationId,RoomTypeId,NrOfPersons,Utilities,Description) values (null,?,?,?,?,?)";
    public final static String DELETE_ROOM ="DELETE FROM room where id = ?";
}
