package data.repository;

import data.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public User save(User user) {

        if (user.getId() == 0) {
            user.setId(idCounter++);
        }

        users.add(user);

        return user;
    }

    @Override
    public User findByEmail(String email) {

        for (User user : users) {

            if (user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }
}