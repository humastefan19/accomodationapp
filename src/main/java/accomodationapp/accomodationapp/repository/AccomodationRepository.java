package accomodationapp.accomodationapp.repository;


import accomodationapp.accomodationapp.Model.Accomodation;
import accomodationapp.accomodationapp.querys.AccomodationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccomodationRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AccomodationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Accomodation> GetAccomodationByFilters(String Location){
        return jdbcTemplate.query(AccomodationQuery.GET_ACCOMODATION_ROOM_RESERVED_NUMBER,  new BeanPropertyRowMapper<>(Accomodation.class), Location);
    }
}
