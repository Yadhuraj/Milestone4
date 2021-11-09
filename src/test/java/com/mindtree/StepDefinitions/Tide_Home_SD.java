package com.mindtree.StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.PageObjects.LearnMore_POM;
import com.mindtree.PageObjects.SearchItem_POM;
import com.mindtree.PageObjects.ShopProducts_POM;
import com.mindtree.ResuableComponents.BaseClass;
import com.mindtree.UIStore.LearMore_UI;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Tide_Home_SD extends BaseClass{
public static WebDriver driver;
    @Given("^Navigate to the Login page$")
    public void navigate_to_the_login_page() throws Throwable {
        driver = Driversetup(driver);
        
    }

    @Then("Validate the Shop products")
    public void validate_the_shop_products() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	test = report.startTest("Tide_Home_SD");
        new ShopProducts_POM(driver, log, test);
        report.endTest(test);
        report.flush();
       
    }


    @Then("^Validate Learn more option$")
    public void validate_learn_more_option() throws Throwable {
    	test = report.startTest("validate_learn_more_option");
    	new LearnMore_POM(driver, log, test);
    	 report.endTest(test);
         report.flush();
    }

    @And("^validate the Search Bar to search (.+)$")
    public void validate_the_search_bar_to_search(String data) throws Throwable {
    	Thread.sleep(3000);
    	test = report.startTest("validate_the_search_bar");
       new SearchItem_POM(driver, log, test, data);
       report.endTest(test);
       report.flush();
    }

    @And("^Close the driver$")
    public void close_the_driver() throws Throwable {
        
    }

}
