package com.moraes.springbootmongodb.services;

import com.moraes.springbootmongodb.domain.Post;
import com.moraes.springbootmongodb.domain.User;
import com.moraes.springbootmongodb.dto.UserDTO;
import com.moraes.springbootmongodb.repository.PostRepository;
import com.moraes.springbootmongodb.services.exception.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
