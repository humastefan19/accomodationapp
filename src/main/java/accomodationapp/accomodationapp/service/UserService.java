package accomodationapp.accomodationapp.service;

import accomodationapp.accomodationapp.Model.User;
import accomodationapp.accomodationapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

public List<User> AddUser(User u){
        return userRepository.AddUser(u);
}

    public List<User> GetUsers(){
        return userRepository.GetUsers();
    }

}
