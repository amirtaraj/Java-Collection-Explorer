package com.amirtaraj.collectionexplorer.service;

import com.amirtaraj.collectionexplorer.model.User;
import com.amirtaraj.collectionexplorer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Collections to store users
    private Map<String, User> hashMap = new HashMap<>();
    private List<User> linkedList = new LinkedList<>();
    private List<User> arrayList = new ArrayList<>();
    private Set<User> hashSet = new HashSet<>();
    private Set<User> treeSet = new TreeSet<>(Comparator.comparing(User::getName));

    public User saveUser(User user) {
        // Save to MongoDB
        User savedUser = userRepository.save(user);

        // Save user to different collections
        hashMap.put(user.getId(), user);
        linkedList.add(user);
        arrayList.add(user);
        hashSet.add(user);
        treeSet.add(user);

        return savedUser;
    }

    public Map<String, User> getHashMap() {
        return hashMap;
    }

    public List<User> getLinkedList() {
        return linkedList;
    }

    public List<User> getArrayList() {
        return arrayList;
    }

    public Set<User> getHashSet() {
        return hashSet;
    }

    public Set<User> getTreeSet() {
        return treeSet;
    }

    public List<User> getAllUsersFromDb() {
        return userRepository.findAll();
    }
}
