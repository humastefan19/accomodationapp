package accomodationapp.accomodationapp.service;

import accomodationapp.accomodationapp.Model.Locations;
import accomodationapp.accomodationapp.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationsService {

    @Autowired
    private LocationsRepository locationsRepository;

    public LocationsService(LocationsRepository locationsRepository) {
        this.locationsRepository = locationsRepository;
    }

    public List<Locations> AddRoomType(Locations locations){
        return locationsRepository.AddRoomType(locations);
    }
}
