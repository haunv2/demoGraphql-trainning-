package com.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.entity.Video;
import com.repository.VideoRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class videoQuery implements GraphQLQueryResolver {

    static Logger videoQueryLoger = LoggerFactory.getLogger(videoQuery.class);

    @Autowired
    private VideoRepository videoRepository;

    public Video video(Long id){
        videoQueryLoger.debug("Query video by id-> debug");
        videoQueryLoger.info("Query video by id-> infor");

        return videoRepository.findById(id).get();
    }
}
