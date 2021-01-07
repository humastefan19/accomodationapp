package accomodationapp.accomodationapp.querys;

public class AccomodationQuery {
    public final static String GET_ACCOMODATION_SQL = "select * from accomodation";
    public final static String ADAUGA_ACCOMODATION ="INSERT INTO accmodation(id,name, address, nrofrooms,Utilities, description) values (null,?,?,?,?,?)";
    public final static String DELETE_ACCOMODATION ="DELETE FROM accomodation where id = ?";
    public final static String GET_ACCOMODATION_ROOM_RESERVED_NUMBER = "selecat a.name, a.description, a.Address, a.utilities" +
            "from Accomodation a join Location l on (a.LocationId == l.Id)" +
            "where l.Name like '%?%'";
}
