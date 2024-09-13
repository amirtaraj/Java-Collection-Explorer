package com.amirtaraj.collectionexplorer.controller;

import com.amirtaraj.collectionexplorer.model.User;
import com.amirtaraj.collectionexplorer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/collections/hashmap")
    public Map<String, User> getHashMap() {
        return userService.getHashMap();
    }

    @GetMapping("/collections/linkedlist")
    public List<User> getLinkedList() {
        return userService.getLinkedList();
    }

    @GetMapping("/collections/arraylist")
    public List<User> getArrayList() {
        return userService.getArrayList();
    }

    @GetMapping("/collections/hashset")
    public Set<User> getHashSet() {
        return userService.getHashSet();
    }

    @GetMapping("/collections/treeset")
    public Set<User> getTreeSet() {
        return userService.getTreeSet();
    }
}
