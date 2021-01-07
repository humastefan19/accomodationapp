package accomodationapp.accomodationapp.querys;

public class LocationsQuery {
    public final static String GET_LOCATION_SQL = "select * from location";
    public final static String ADAUGA_LOCATION ="INSERT INTO location(id,name) values (null,?)";
    public final static String DELETE_LOCATION ="DELETE FROM location where id = ?";
}
