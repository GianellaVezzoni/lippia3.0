package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UdemySelectCourseResultPage extends PageBaseUdemy {

    private final String VIDEO_PREVIEW_CLASS = "ud-component--course-landing-page-udlite--introduction-asset";

    public UdemySelectCourseResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private WebElement stats() {
        return getWebElement(By.className(VIDEO_PREVIEW_CLASS));
    }

    public boolean getVideoPreview() {
        return stats().isDisplayed();
    }
}
