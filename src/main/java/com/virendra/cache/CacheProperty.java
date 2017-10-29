package com.virendra.cache;

/**
 * Created by esha on 05/09/16.
 */
public enum CacheProperty {

    REF_COUNTRY("REF_COUNTRY"),

    REF_CURRENCY("REF_CURRENCY"),

    REF_HOLIDAY("REF_HOLIDAY");

            private final String displayName;

            CacheProperty(String displayName){

                this.displayName = displayName;
            }
    public String getDisplayName(){
        return displayName;
    }
}
