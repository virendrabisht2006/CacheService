package com.virendra.cache;

import com.virendra.domain.Reference;

/**
 * Created by esha on 05/09/16.
 */

/*

•	Cache should be globally accessible throughout the JVM
•	Cache client will access cached objects by providing table name & primary key value
•	All tables have integer primary key
•	Initially three tables are required to be cached, REF_COUNTRY, REF_CURRENCY & REF_HOLIDAY
•	Cache should have provision to support more tables if required
•	Cache should have provision to manual and auto removal of cache
•	Code should be adhered to java development standards


 */
public interface CacheService {

    public void addObjectToCache(String cacheKey, Reference reference);

    public Reference getObject(String cacheKey);

    public boolean removeFromCache(String cacheKey);
}
