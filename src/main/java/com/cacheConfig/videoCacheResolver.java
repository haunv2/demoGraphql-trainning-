package com.cacheConfig;

import org.ehcache.core.Ehcache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.interceptor.CacheOperationInvocationContext;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.jcache.JCacheCache;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.stereotype.Component;
import org.ehcache.jsr107.Jsr107Service;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class videoCacheResolver implements CacheResolver {

    @Autowired
    CacheManager cacheManager;

    @Override
    public Collection<? extends Cache> resolveCaches(CacheOperationInvocationContext<?> context) {
        JCacheCacheManager jCacheCacheManager = (JCacheCacheManager) cacheManager;

        Collection<Cache> caches = new ArrayList<>();

        JCacheCache cache = (JCacheCache) cacheManager.getCache("area1");
        cache.clear();

        caches.add(cacheManager.getCache("area1"));
        return caches;
    }
}
