package com.service;

import com.entity.Video;
import com.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testImpl implements test{

    @Autowired
    VideoRepository videoRepository;

    @Override
    public List<Video> findAll() {
        return videoRepository.findAll();
    }
}
