package com.cacheConfig.listener;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ehcacheListener implements CacheEventListener<Object, Object> {

    private static final Logger LOG = LoggerFactory.getLogger(ehcacheListener.class);

    @Override
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        LOG.info("custom Caching event {} {} {} {} ", cacheEvent.getType(), cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
    }
}
