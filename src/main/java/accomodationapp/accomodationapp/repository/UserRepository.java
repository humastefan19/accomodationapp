package accomodationapp.accomodationapp.repository;

import accomodationapp.accomodationapp.Model.User;
import accomodationapp.accomodationapp.querys.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate template) { jdbcTemplate = template; }

    public List<User> AddUser (User u){
        jdbcTemplate.update(UserQuery.ADAUGA_USER, u.getFirstName(),u.getLastName(),u.getUsername(),u.getAge());
        return jdbcTemplate.query(UserQuery.GET_USER_SQL, new BeanPropertyRowMapper<>(User.class));
    }

    public List<User> GetUsers(){
        return jdbcTemplate.query(UserQuery.GET_USER_SQL, new BeanPropertyRowMapper<>(User.class));
    }
}
