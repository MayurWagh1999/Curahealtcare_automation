package TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import pages.home;
import pages.login;

public class HomePage extends Base_Class{
	
	public void login() {
		    
	        login lp = new login(driver);
	        lp.getappointment().click();
	        lp.getusernameField().sendKeys("John Doe");
	        lp.getpasswordField().sendKeys("ThisIsNotAPassword");
	        lp.getlogin().click();
	    }
	
	@Test
	public void test01()  {
		// Test case to verify successful Book Appointment
		login();
		home hp = new home(driver);
		hp.getcombo_facility().click();
		hp.getMedicaid().click();
		hp.getdatepicker().sendKeys("12/05/2024");
		hp.gettxt_comment().sendKeys("addadd");
		hp.getappointment().click();
		
		
	}
	@Test
	public void test02()  {
		// Test case to verify successful Book Appointment and navigation to the Appointment Confirmation
		login();
		home hp = new home(driver);
		hp.getcombo_facility().click();
		hp.getmedicare().click();
		hp.getdatepicker().sendKeys("12/05/2024");
		hp.gettxt_comment().sendKeys("addadd");
		hp.getappointment().click();
		 String expectedUrl = "https://katalon-demo-cura.herokuapp.com/appointment.php#summary";
	     String actualUrl = driver.getCurrentUrl();
	     Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after login");
		
	}
	@Test
	public void test03()  {
		// Test case to verify unsuccessful Book Appointment with empty date
		login();
		home hp = new home(driver);
		hp.getcombo_facility().click();
		hp.getmedicare().click();
		hp.getdatepicker().sendKeys("");
		hp.gettxt_comment().sendKeys("addadd");
		hp.getappointment().click();
		
		
	}
	
		
		
	}
	

