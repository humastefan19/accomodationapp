package accomodationapp.accomodationapp.Model;

import java.sql.Date;

public class Reservation {
    private int Id;
    private int RoomId;
    private int UserId;
    private Date StartDate;
    private Date EndDate;

    public Reservation() {
    }

    public Reservation(int id, int roomId, int userId, Date startDate, Date endDate) {
        Id = id;
        RoomId = roomId;
        UserId = userId;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAccomodotationId() {
        return RoomId;
    }

    public void setAccomodotationId(int accomodotationId) {
        RoomId = accomodotationId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
}
