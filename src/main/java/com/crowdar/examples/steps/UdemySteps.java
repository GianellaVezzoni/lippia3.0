package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.UdemyHomePage;
import com.crowdar.examples.pages.UdemySearchResultPage;
import com.crowdar.examples.pages.UdemySelectCourseResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UdemySteps extends PageSteps {

    @Given("The user is in udemy page")
    public void home() {
        Injector._page(UdemyHomePage.class).go();
    }

    @When("The user search for word (.*)")
    public void search(String name_course) {
        Injector._page(UdemyHomePage.class).searchCourse(name_course);
        Injector._page(UdemyHomePage.class).clickSearchButton();
    }

    @And("The user filter by free courses")
    public void filterCourse(){
        Injector._page(UdemyHomePage.class).filterPrice();
    }

    @And("The user select the (.*) course")
    public void selectCourse(int item_number){
        Injector._page(UdemyHomePage.class).selectCourse(item_number);
    }

    @Then("The user verify that results are shown properly")
    public void startVerfication() {
        Assert.assertTrue(Injector._page(UdemySearchResultPage.class).getStats());
    }

    @Then("The user verify that the course selected is correct")
    public void courseVerification(){
        Assert.assertTrue(Injector._page(UdemySelectCourseResultPage.class).getVideoPreview());
    }
}
