package com.channel4.helper.listener;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by asit.singh on 18-01-2019.
 */
public class RetryListener implements IAnnotationTransformer {
    public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
        IRetryAnalyzer retry = arg0.getRetryAnalyzer();
        if(retry == null){
            arg0.setRetryAnalyzer(Retry.class);
        }
    }
}
