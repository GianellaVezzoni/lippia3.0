package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseUdemy extends PageBaseWeb {

    public PageBaseUdemy(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://www.udemy.com/";
    }


}
