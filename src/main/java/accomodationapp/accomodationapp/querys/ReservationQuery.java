package accomodationapp.accomodationapp.querys;

public class ReservationQuery {
    public final static String GET_RESERVATIONS_BY_USERID_SQL = "select * from Reservation where userId = ?";
    public final static String ADAUGA_ROOMTYPE ="INSERT INTO reservation(id,roomId,UserId,startDate,EndDate ) values (null,?,?,?,?)";
    public final static String DELETE_ROOMTYPE ="DELETE FROM reservation where id = ? and startDate > CurDate()";
}
