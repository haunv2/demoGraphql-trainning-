package com.graphql.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.entity.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class userMutator implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;
    public User createUser(User u){
        return userRepository.save(u);
    }

    public Boolean deleteUser(Long id){
        userRepository.deleteById(id);
        return true;
    }
}
