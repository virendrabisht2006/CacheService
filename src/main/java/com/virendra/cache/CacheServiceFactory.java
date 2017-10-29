package com.virendra.cache;

/**
 * Created by esha on 24/01/17.
 */
public class CacheServiceFactory {

    public static CacheService getCacheServiceInstance() {
        return ResourceHolder.cacheService;
    }

    private static final class  ResourceHolder{
        private static final CacheService cacheService = new CacheSericeImpl();
    }

}
