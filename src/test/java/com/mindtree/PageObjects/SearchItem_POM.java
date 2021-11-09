package com.mindtree.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.ResuableComponents.DriverFunctions;
import com.mindtree.UIStore.SearchItem_UI;
import com.mindtree.Util.ExtentUtility;
import com.mindtree.Util.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class SearchItem_POM extends SearchItem_UI{
	public SearchItem_POM(WebDriver driver, Logger logger,ExtentTest test,String item) {
		try {
		DriverFunctions.sendkeys(driver,Search_bar_input , item);
		DriverFunctions.sendkeys(driver, Search_bar_input, Keys.ENTER);
		 if(driver.findElement(Search_bar_present).isDisplayed())
	      {
	    	  Log.testLoggerInfo(logger, item+"is present");
		      ExtentUtility.pass(test,  item+"is present");
	      }
	      else
	      {
	    	  Log.testLoggerError(logger, item+" is not present");
		      ExtentUtility.fail(test,driver, item+" is not present");
	      }
		 Log.testLoggerInfo(logger, "Search bar is validated");
	      ExtentUtility.pass(test,  "Search bar is validated");
	      DriverFunctions.click(driver, Search_bar_Home);
		}
		catch (Exception e) {
			 Log.testLoggerError(logger, "Search bar is not validated");
		      ExtentUtility.fail(test,driver, "Search bar is not validated");
		}
	}

}
