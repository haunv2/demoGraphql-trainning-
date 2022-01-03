package com.controller;


import com.entity.Video;
import com.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("video")
public class VideoControler {

    @Autowired
    VideoService service;

    @GetMapping("findall")
    public List<Video> findall(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        return service.getAll(page);
    }

    @GetMapping("delete/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        service.deleteById(id);
        return true;
    }

    @PostMapping("update")
    public Video update(@RequestBody Video v) {
        return service.update(v);
    }

    @GetMapping("/{id}")
    public Video find(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("getVideo")
    @Transactional
    public List<Video> getVideo() {
        return service.getVideos();
    }
}
