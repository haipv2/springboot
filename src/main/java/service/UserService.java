package service;

import model.User;

import java.util.List;

/**
 * Created by Namlong on 7/17/2017.
 */
public interface UserService {
    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
