package Annotation;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Annotations  extends SeMethods{
	@BeforeMethod()
  //@BeforeMethod(groups= {"smoke","sanity"})
  public void beforeMethod() {
	  startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement eleUserName = locateElement("id", "username");
		
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);


		WebElement create = locateElement("linktext","CRM/SFA");
		click(create);  
	  
  }

  @AfterMethod()
  public void afterMethod() {
	  closeAllBrowsers();
  }
}
