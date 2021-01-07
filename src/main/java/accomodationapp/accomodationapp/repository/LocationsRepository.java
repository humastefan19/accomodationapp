package accomodationapp.accomodationapp.repository;

import accomodationapp.accomodationapp.Model.Locations;
import accomodationapp.accomodationapp.querys.LocationsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public LocationsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Locations> AddRoomType(Locations locations){
        jdbcTemplate.update(LocationsQuery.ADAUGA_LOCATION, locations.getName());
        return jdbcTemplate.query(LocationsQuery.GET_LOCATION_SQL, new BeanPropertyRowMapper<>(Locations.class));
    }
}
