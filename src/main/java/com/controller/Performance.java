package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Performance {

    public static long lastUsed = Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory();
    public static int count = 1;

    @RequestMapping("count")
    public Object count() {
        Map<String, Long> rs = new HashMap<>();
        Runtime rt = Runtime.getRuntime();
        long mem = rt.totalMemory();
        long fm = rt.freeMemory();
        long mm = rt.maxMemory();
        long used = mm - fm;


        System.out.println("Times " + (count++) + "->" + used);
        System.out.println("distance->" + (used - lastUsed));
        lastUsed = used;
        return rs;
    }
}
