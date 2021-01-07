package accomodationapp.accomodationapp.controller;

import accomodationapp.accomodationapp.Model.Locations;
import accomodationapp.accomodationapp.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roomtype")
public class LocationsController {

    @Autowired
    private LocationsService locationsService;

    public LocationsController(LocationsService locationsService) {
        this.locationsService = locationsService;
    }

    @PostMapping("/add")
    public List<Locations> AddRoomType(@RequestBody Locations locations){
        return locationsService.AddRoomType(locations);
    }
}
