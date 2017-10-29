package com.virendra.cache;

import com.virendra.domain.Country;
import com.virendra.domain.Currency;
import com.virendra.domain.Holiday;

import java.util.Date;

/**
 * Cache App
 *
 */


public class App 
{
    private static  CacheService cacheService;

    public static void main( String[] args )
    {
        System.out.println("Starting Cache Application");

     //  ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
       //CacheService cacheService = (CacheService) context.getBean("cacheService");

        cacheService = CacheServiceFactory.getCacheServiceInstance();

        Long countryId= 101L;

        //add country object to cache for countryId 101L
        Country country = new Country();

        country.setCountryId(countryId);
        country.setCountryCode("IND");
        country.setCountryName("India");
        country.setLastModifyDate(new Date());
        country.setModifyPersonNumber(12347578);

        //cacheKey is the combination of table name and primarykey in table
        String cacheKey = CacheProperty.REF_COUNTRY.toString()+countryId;

        cacheService.addObjectToCache(cacheKey,country);

        //Get country object from cache for countryId: 101 which already exist in cache
        System.out.println("Get country object from cache for countryId: "+countryId);
        System.out.println(cacheService.getObject(cacheKey));

        Long currencyId=115L;

        //add currency object in cahce REF_CURRENCY
        System.out.println("Add Currency Object for Id :"+currencyId);

        cacheKey = CacheProperty.REF_CURRENCY.toString()+currencyId;

        Currency currency = new Currency();
        currency.setCurrencyId(currencyId);
        currency.setCurrencyCode("AED");
        currency.setCurrencyName("Diram");
        currency.setCurrencySymbol("$");

        cacheService.addObjectToCache(cacheKey, currency);

        //get added object from cache REF_CURRENCY
        System.out.println("Get Currency for currencyId: "+currencyId);
        System.out.println(cacheService.getObject(cacheKey));


        //remove country REF_COUNTRY object from cahce with countryId
        System.out.println("Remove country Objecy from cache: "+ cacheService.removeFromCache(CacheProperty.REF_COUNTRY.getDisplayName()+countryId));


        Long countryId1= 150L;

        Country country1 = new Country();
        country1.setCountryId(countryId1);
        country1.setCountryCode("US");
        country1.setCountryName("USA");
        cacheService.addObjectToCache(CacheProperty.REF_COUNTRY.getDisplayName()+countryId1,country1);

       //get holdiday object which doest not exist in cache
        Long holidayIdToRemove =150L;
        System.out.println("Trying to remove holiday object from cache with holidayid:  "+holidayIdToRemove);
        System.out.println(cacheService.removeFromCache(CacheProperty.REF_HOLIDAY.toString()+holidayIdToRemove));

        Long holidayId = 150L;
        Holiday holiday = new Holiday();
        holiday.setHolidayId(holidayId);

        //add holiday to cache cacheKey
        cacheKey = CacheProperty.REF_HOLIDAY.toString()+holidayId;
        cacheService.addObjectToCache(cacheKey , holiday);

        System.out.println(cacheService.getObject(CacheProperty.REF_HOLIDAY.toString()+holidayId));

    }


}
