package com.moraes.springbootmongodb.services;

import com.moraes.springbootmongodb.domain.User;
import com.moraes.springbootmongodb.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

}
