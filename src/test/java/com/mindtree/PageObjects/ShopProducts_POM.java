package com.mindtree.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.ResuableComponents.DriverFunctions;
import com.mindtree.UIStore.ShopProducts_UI;
import com.mindtree.Util.ExtentUtility;
import com.mindtree.Util.Log;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.utils.ExtentUtil;

public class ShopProducts_POM extends ShopProducts_UI{
	
	public ShopProducts_POM(WebDriver driver,Logger logger,ExtentTest test) throws InterruptedException {
		try{
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(shop_products_header)).build().perform();
	      Thread.sleep(3000);
	      DriverFunctions.click(driver, shop_products_powder);
	      Thread.sleep(3000);
	      
	      if(driver.findElement(shop_products_Confirm).isDisplayed())
	      {
	    	  Log.testLoggerInfo(logger, " 'Tide Free and Gentle powder' is present");
		      ExtentUtility.pass(test, "'Tide Free and Gentle powder' is present");
	      }
	      else
	      {
	    	  Log.testLoggerError(logger, " 'Tide Free and Gentle powder' is not present");
		      ExtentUtility.fail(test,driver, " 'Tide Free and Gentle powder' is not present");
	      }
	      Thread.sleep(3000);
//	      DriverFunctions.click(driver, shop_products_Home);
	      driver.navigate().back();
	      Log.testLoggerInfo(logger, "Succesfully validated the header 'Shop Products'");
	      ExtentUtility.pass(test, "Succesfully validated the header 'Shop Products'");
		}
		catch (Exception e) {
			Log.testLoggerError(logger, "Not Succesfull in  validating the header 'Shop Products'");
		      ExtentUtility.fail(test,driver, "Not Succesfull in  validating the header 'Shop Products'");
		}
		
	      
	}

}
