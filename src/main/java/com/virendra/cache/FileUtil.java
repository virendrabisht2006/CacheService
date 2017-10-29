package com.virendra.cache;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by esha on 24/01/17.
 */
public class FileUtil {

    public static Properties loadPropertiesFile() {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input  = FileUtil.class.getClassLoader().getResourceAsStream("cache.properties");

            // load a properties file
            prop.load(input);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return prop;
    }
}
