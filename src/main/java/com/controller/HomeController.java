package com.controller;

import com.entity.User;
import com.entity.Video;
import com.repository.UserRepository;
import com.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    final
    UserRepository userRepository;

    final
    VideoRepository videoRepository;

    @Autowired
    public HomeController(UserRepository userRepository, VideoRepository videoRepository) {
        this.userRepository = userRepository;
        this.videoRepository = videoRepository;
    }

    @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
    public Iterable<User> allUser() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "user/{id}")
    public User findUser(@PathVariable String id) {
        User u = userRepository.findById(Long.valueOf(id)).get();
        return u == null ? null : u;
    }

    @RequestMapping(value = "getAllVideo", method = RequestMethod.GET)
    public Iterable<Video> allVideo() {
        return videoRepository.findAll();
    }

    @RequestMapping(value = "video/{id}")
    public Video findVideo(@PathVariable String id) {
        return null;
    }
}
