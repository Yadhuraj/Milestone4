package com.mindtree.PageObjects;

import org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.ResuableComponents.DriverFunctions;
import com.mindtree.UIStore.LearMore_UI;
import com.mindtree.Util.ExtentUtility;
import com.mindtree.Util.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class LearnMore_POM extends LearMore_UI{
	public LearnMore_POM(WebDriver driver, Logger logger,ExtentTest test) throws InterruptedException {
		try {
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(How_laundry_header)).build().perform();
	      Thread.sleep(3000);
	      DriverFunctions.click(driver, How_laundry_option);
	      
	      if(driver.findElement(How_laundry_confirm).isDisplayed())
	      {
	    	  Log.testLoggerInfo(logger, "The expected 'How_laundry_confirm' is displayed");
	    	  ExtentUtility.pass(test, "The expected 'How_laundry_confirm' is displayed");
	      }
	      else
	      {
	    	  Log.testLoggerError(logger, "The expected 'How_laundry_confirm' is not displayed");
	    	  ExtentUtility.fail(test,driver, "The expected 'How_laundry_confirm' is not displayed");
	      }
	      Log.testLoggerInfo(logger, "Navigated to the expected page");
    	  ExtentUtility.pass(test, "Navigated to the expected page");
		}
		catch (Exception e) {
			Log.testLoggerError(logger, "Did not Navigate to the expeected page");
	    	  ExtentUtility.fail(test,driver, "Did not Navigate to the expeected page");
		}
	}
}
