package com.cacheConfig;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Method;
import java.util.Arrays;

@Configuration
@EnableCaching
public class cacheConfig {

    @Bean
    public KeyGenerator multiplyKeyGenerator() {
        return (Object target, Method method, Object... params) ->
                method.getName() + "_" + Arrays.toString(params);
    }
}
