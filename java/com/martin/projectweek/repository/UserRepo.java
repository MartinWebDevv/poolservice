package com.martin.projectweek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martin.projectweek.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
