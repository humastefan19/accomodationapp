package accomodationapp.accomodationapp.controller;


import accomodationapp.accomodationapp.Model.User;
import accomodationapp.accomodationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping ("/add")
    public List<User> AddUser(@RequestBody User u){
        return userService.AddUser(u);
    }

    @GetMapping("/get")
    public List<User> GetUsers(){
        return userService.GetUsers();
    }
}
