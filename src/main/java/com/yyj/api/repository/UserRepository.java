package com.yyj.api.repository;

import com.yyj.api.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<Users, UUID> {
    Users findByUsername(String username);
}
