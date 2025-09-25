package xeanutsp.io.sonar.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xeanutsp.io.sonar.entity.User;
import xeanutsp.io.sonar.service.UsersService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UsersController {

    private final UsersService usersService = new UsersService();

    // Get all users
    @GetMapping("/users/{id}")
    public List<User> getUsers(@PathVariable Long id, @RequestParam String param) {

        if (id != null) {

            // Has id
            return usersService.getUserFromId(id);

        } else {

            // Has nothing on id
            return usersService.getAllUsers();
        }

    }

    // Post create users
    @PostMapping("/users")
    public User postMethodName(@RequestBody User entity) {

        return usersService.addUser(entity);
    }

    // Put update user
    @PutMapping("/users/{id}")
    public User putMethodName(@PathVariable Long id, @RequestBody User entity) {

        return usersService.updateUser(id, entity);
    }

    // Delete delete user
    @DeleteMapping("/users/{id}")
    public void deleteUserName(@PathVariable Long id, @RequestBody User entity) {
        usersService.deleteUser(id);;
    }

}
