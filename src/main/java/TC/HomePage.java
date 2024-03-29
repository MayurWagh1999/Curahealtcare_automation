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
		hp.getSeoul_CURA_Healthcare_Center();
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
		hp.getHongkong_CURA_Healthcare_Center();
		hp.getmedicare().click();
		hp.getdatepicker().sendKeys("12/05/2024");
		hp.gettxt_comment().sendKeys("addadd");
		hp.getappointment().click();
		 String expectedUrl = "https://katalon-demo-cura.herokuapp.com/appointment.php#summary";
	     String actualUrl = driver.getCurrentUrl();
	     Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after Book Appointment");
		
	}
	@Test
	
	public void test03()  {
		// Test case to verify unsuccessful Book Appointment with empty date
		login();
		home hp = new home(driver);
		hp.getcombo_facility().click();
		hp.getTokyo_CURA_Healthcare_Center();
		hp.getmedicare().click();
		hp.getdatepicker().sendKeys("");
		hp.gettxt_comment().sendKeys("addadd");
		hp.getappointment().click();
		
		
	}
	
	@Test
	public void test04()  {
		// This test verifies that clicking the "Home" button navigates to the correct URL
	login();
	home hp = new home(driver);
	hp.getmenutoggle().click();
	hp.getHome().click();
	String expectedUrl = "https://katalon-demo-cura.herokuapp.com/";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after click home button");	
	}
	
	@Test
	public void test05()  {
		// This test verifies that clicking the "History" button navigates to the correct URL
	login();
	home hp = new home(driver);
	hp.getmenutoggle().click();
	hp.getHistory().click();
	String expectedUrl = "https://katalon-demo-cura.herokuapp.com/history.php#history";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after click history button ");		
	}
	
	@Test
	public void test06()  {
		// This test verifies that clicking the "Profile" button navigates to the correct URL
	login();
	home hp = new home(driver);
	hp.getmenutoggle().click();
	hp.getProfile().click();
	String expectedUrl = "https://katalon-demo-cura.herokuapp.com/profile.php#profile";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after click profile button ");			
	}
	
	@Test 
	public void test07()  {
		// This test verifies that clicking the "Logout" button navigates to the correct URL
	login();
	home hp = new home(driver);
	hp.getmenutoggle().click();
	hp.getLogout().click();	
	String expectedUrl = "https://katalon-demo-cura.herokuapp.com/";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after logout");
	}
	}
	

