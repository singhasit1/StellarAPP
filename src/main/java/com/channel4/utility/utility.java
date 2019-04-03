package com.channel4.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.*;
import com.channel4.basest.baseclass;

public class utility extends baseclass {

    @Rule
    public TestRule Listen=  new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
            try {
                takeScreenshotAtEndOfTest (description.getClassName()+","+description.getMethodName());
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    };

    public static void takeScreenshotAtEndOfTest(String name) throws IOException {
        String DateName=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String Destination=System.getProperty("G:\\Mapsynq\\Mapsynq\\src\\main\\java\\com\\channel4\\screenshot")+name+DateName+".png";
        FileUtils.copyFile(scrFile, new File(Destination));
    }


    }

