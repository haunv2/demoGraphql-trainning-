package com.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.entity.Video;
import com.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class videoQuery implements GraphQLQueryResolver {

    @Autowired
    private VideoRepository videoRepository;

    public Video video(Long id){
        return videoRepository.findById(id).get();
    }
}
