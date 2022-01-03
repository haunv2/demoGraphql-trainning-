package com.service;

import com.entity.Video;
import com.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRepository repo;

    @Cacheable(value = "area1", key = "#page")
    public List<Video> getAll(int page) {
        System.out.println("call first!");
        return repo.findAll().stream().toList();
    }

    @CacheEvict(value = "area1", allEntries = true)
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @CachePut(value = "area1", key = "#v.id")
    public Video update(Video v) {
        return repo.save(v);
    }

    @Cacheable(cacheNames = {"area1"}, key = "#id", cacheResolver = "videoCacheResolver")
    public Video findById(Long id) {
        System.out.println("call first!");
        return repo.findById(id).get();
    }

    public List<Video> page(Pageable page) {
        return repo.findAll(page).toList();
    }

    public List<Video> getVideos() {
        return repo.getVideos();
    }
}
