package com.virendra.cache;

import com.virendra.domain.Reference;
import com.virendra.domain.Country;
import com.virendra.domain.Currency;
import com.virendra.domain.Holiday;

import java.util.Map;
import java.util.Properties;

/**
 * Created by esha on 05/09/16.
 */
public class CacheSericeImpl implements CacheService {


    private CacheHolder cacheHolder;

    CacheSericeImpl(){
        Properties properties= FileUtil.loadPropertiesFile();
        int maxCacheSize = Integer.parseInt(properties.getProperty("cache.max.size"));
        System.out.println("Max Cache Size: "+maxCacheSize);
        this.cacheHolder = new CacheHolder(maxCacheSize);
    }


    public void addObjectToCache(String cacheKey, Reference reference) {
        System.out.println("ABout to Add Object to Cache: with CacheKey: "+cacheKey);
        cacheHolder.set(cacheKey, reference);
    }

    public Reference getObject(String cacheKey) {
        System.out.println("ABout to Get object from cache for cacheKey: "+cacheKey);
        return cacheHolder.get(cacheKey);
    }

    public boolean removeFromCache(String cacheKey) {
        System.out.println("Remove object from cache with cacheKey: "+cacheKey);
        return cacheHolder.remove(cacheKey);
    }
}
