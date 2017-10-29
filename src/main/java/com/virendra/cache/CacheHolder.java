package com.virendra.cache;

import com.virendra.domain.Reference;
import com.virendra.domain.Country;
import com.virendra.domain.Currency;
import com.virendra.domain.Holiday;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by esha on 05/09/16.
 */
/*
CacheHolder implements LRUCache and can hold upto 1000 object in cache and the size is configurable in property file
To add new ReferenceType in cache, its just need to implements Reference interface and you can pass that store object into cache.. The new calss shoukd
have primary key, key will be combination of table name and primarykey to add in cache.
 */
public class CacheHolder {

    private int cacheSize;
    private Map<String, Reference> cahce;

    CacheHolder(int cacheSize){
        this.cacheSize = cacheSize;
        cahce = new LinkedHashMap<String, Reference>();
    }

    public Map<String, Reference> getCahce() {
        return cahce;
    }


    public synchronized Reference get(String key){
        Reference referenceType = cahce.get(key);
        System.out.println("Access object from cache is: "+referenceType);
        if(null !=referenceType){
            this.set(key, referenceType);
        }
        return  referenceType;
    }

    public synchronized void set(String key, Reference referenceType) {
        if (cahce.containsKey(key)){
            System.out.println("Object already exist in cache again update the object in cache");
            cahce.remove(key);
        }
        else if(cahce.size()== cacheSize){
            System.out.println("Cache is full, first remove last access object from cache. Then add new object to cache");
            Iterator itr = cahce.keySet().iterator();
            itr.next();
            itr.remove();
        }
        System.out.println("Add object to cache for key: "+key +", and object: "+referenceType);
        cahce.put(key, referenceType);
    }

    public synchronized boolean remove(String key){
        if(cahce.containsKey(key)){
            System.out.println("Object exist in cache so delete");
            cahce.remove(key);
            return true;
        }
        System.out.println("Object doest not exist in cache so can not remove from cache");
        return false;
    }


}
