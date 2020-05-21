package com.crowdar.examples.pages;

import autovalue.shaded.com.google$.common.collect.$ObjectArrays;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.Random;

public class UdemyHomePage extends PageBaseUdemy {

    private final String INPUT_SEARCH_ID = "header-search-field";
    private final String BUTTON_SEARCH_CSS = "span.input-group:nth-child(3) > span:nth-child(2) > button:nth-child(1)";
    private final String DROPDOWN_PRICE_XPATH = "/html/body/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/form/div/div[3]/label";
    private final String FREE_FILTER_XPATH = "/html/body/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/form/div/div[3]/div/div/div/div/div/fieldset/label[2]";
    private final String COURSES_ITEMS_CSS_SELECTOR = "div.course-list--container--3zXPS:nth-child(2) > div:nth-child(%d) > div:nth-child(1)";
    private final String LINK_ITEM_COURSE_CLASS = "udlite-custom-focus-visible";

    public UdemyHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() { //Go to udemy home page
        navigateToCompleteURL();
    }

    public void searchCourse(String course) { //Click and complete the input search
        clickElement(By.id(INPUT_SEARCH_ID));
        completeField(By.id(INPUT_SEARCH_ID), course);
    }

    public void clickSearchButton() { //Click on the search button
        clickElement(By.cssSelector(BUTTON_SEARCH_CSS));
    }

    public void filterPrice(){ //open the dropdown price and select the free option
        clickElement(By.xpath(DROPDOWN_PRICE_XPATH));
        clickElement(By.xpath(FREE_FILTER_XPATH));
    }

    public void selectCourse(int number_course){ //select a determinate course
        WebElement course = driver.findElement(By.cssSelector(String.format(COURSES_ITEMS_CSS_SELECTOR, number_course + 1)));
        course.findElement(By.className(LINK_ITEM_COURSE_CLASS)).click();
    }

}
