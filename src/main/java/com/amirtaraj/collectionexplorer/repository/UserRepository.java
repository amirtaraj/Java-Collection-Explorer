package com.amirtaraj.collectionexplorer.repository;

import com.amirtaraj.collectionexplorer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
