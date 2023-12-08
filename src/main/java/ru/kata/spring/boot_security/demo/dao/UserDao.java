package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getNameUser(String userName);

    public User show(Long id);

    public void save(User user);

    public void update(User updatedUser, Long id);

    public void delete(Long id);


}
