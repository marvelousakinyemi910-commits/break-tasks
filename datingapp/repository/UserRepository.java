package datingapp.repository;

import datingapp.models.User;


import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    private int idCounter = 1;

    public User save(User user){
        if (user.getId() == 0){
            user.setId(idCounter++);
            users.add(user);
            return user;
        }
        return user;
    }
    public User findByEmail(String email){
        for (User user : users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;

    }
}
