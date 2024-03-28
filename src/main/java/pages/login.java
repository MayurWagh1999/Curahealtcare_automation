package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	   @FindBy(id = "btn-make-appointment")
	   private WebElement appointment;
	    @FindBy(id = "txt-username")
	    private WebElement usernameField;

	    @FindBy(id = "txt-password")
	    private WebElement passwordField;

	    @FindBy(id = "btn-login")
	    private WebElement loginButton;

	    public WebElement getappointment() {
			return appointment;
		}
	    
	    public WebElement getusernameField() {
			return usernameField;
		}
	    
	    public WebElement getpasswordField() {
			return passwordField;
		}
	    
	    public WebElement getlogin() {
			return loginButton;
		}
	    // Other methods for interacting with the login page elements
	}

