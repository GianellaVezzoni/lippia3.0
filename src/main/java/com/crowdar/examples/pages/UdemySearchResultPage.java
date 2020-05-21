package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UdemySearchResultPage extends PageBaseUdemy {

    private final String FILTERS_CONTAINER_CLASS = "filter-panel--heading--1A6EZ";

    public UdemySearchResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private WebElement stats() {
        return getWebElement(By.className(FILTERS_CONTAINER_CLASS));
    }

    public boolean getStats() {
        return stats().isDisplayed();
    }
}
