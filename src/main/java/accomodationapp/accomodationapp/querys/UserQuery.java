package accomodationapp.accomodationapp.querys;

public class UserQuery {
    public final static String GET_USER_SQL = "select * from user";
    public final static String ADAUGA_USER ="INSERT INTO user(id,firstname,lastname,username,age) values (null,?,?,?,?)";
    public final static String DELETE_USER ="DELETE FROM user where id = ?";
//    public final static String COMANDA_PERSOANA ="select c.numeComanda, c.pretComanda," +
//            " p.numePersoana, p.prenumePersoana\n" +
//            "from demo.comanda c inner join demo.persoana p\n" +
//            "on c.idPersoana = p.idPersoana";
}
