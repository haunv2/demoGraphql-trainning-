package com.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.entity.User;
import com.graphql.exception.UserNotFoundException;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userQuery implements GraphQLQueryResolver {
    @Autowired
    private UserRepository userRepository;

    public User user(Long id){
        return  userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User not found with id= ", id));
    }

    public Iterable<User> allUser(){
        return  userRepository.findAll();
    }
}
