package data.repository;

import data.User;

public interface UserRepository {

    User save(User user);

    User findByEmail(String email);
    }

