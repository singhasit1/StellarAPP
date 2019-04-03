package com.channel4.helper.resource;

/**
 * Created by asit.singh on 18-01-2019.
 */
public class ResourceHelper  {

    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        return basePath +"/"+ path;
    }
}
