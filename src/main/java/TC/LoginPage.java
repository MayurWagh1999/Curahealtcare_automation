package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import pages.login;

public class LoginPage extends Base_Class {


    @Test
    public void testcase_01() {
        // Test case to verify login with valid credentials 
        login lp = new login(driver);
        lp.getappointment().click();
        lp.getusernameField().sendKeys("John Doe");
        lp.getpasswordField().sendKeys("ThisIsNotAPassword");
        lp.getlogin().click();
    }

    @Test
    public void testcase_02() {
        // Test case to verify login with another set of invalid credentials and error message display
        login lp = new login(driver);
        lp.getappointment().click();
        lp.getusernameField().sendKeys("abcd");
        lp.getpasswordField().sendKeys("ThisIsNotAPassword");
        lp.getlogin().click();

        WebElement errorMessage = driver.findElement(By.cssSelector("p.lead.text-danger"));
        String expectedErrorMessage = "Login failed! Please ensure the username and password are valid.";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch");
    }
    
    @Test
    public void testcase_03() {
    	// Test case to verify successful login and navigation to the Appointment page
        login lp = new login(driver);
        lp.getappointment().click();
        lp.getusernameField().sendKeys("John Doe");
    	lp.getpasswordField().sendKeys("ThisIsNotAPassword");
        lp.getlogin().click();

      
        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Incorrect URL after login");
    }
    @Test
    public void testcase_04() {
        // Test case to verify login with another set of invalid credentials and error message display
        login lp = new login(driver);
        lp.getappointment().click();
        lp.getusernameField().sendKeys("");
        lp.getpasswordField().sendKeys("");
        lp.getlogin().click();

        WebElement errorMessage = driver.findElement(By.cssSelector("p.lead.text-danger"));
        String expectedErrorMessage = "Login failed! Please ensure the username and password are valid.";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch");
    }
    @Test
    public void testcase_05() {
        // Test case to verify login with another set of invalid credentials and error message display
        login lp = new login(driver);
        lp.getappointment().click();
        lp.getusernameField().sendKeys("John Doe");
        lp.getpasswordField().sendKeys("");
        lp.getlogin().click();

        WebElement errorMessage = driver.findElement(By.cssSelector("p.lead.text-danger"));
        String expectedErrorMessage = "Login failed! Please ensure the username and password are valid.";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch");
    }
}

