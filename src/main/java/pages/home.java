package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	  @FindBy(id = "combo_facility")
	    private WebElement combo_facility;
	  
	  @FindBy(xpath = "//input[@value=\"Medicare\"]")
	  private WebElement medicare;
	  
	  @FindBy(xpath =  "//input[@value=\"Medicaid\"]")
	  private WebElement Medicaid;
	  
	  @FindBy(xpath =  "//input[@value=\"None\"]")
	  private WebElement none;
	  
	  @FindBy(xpath = "//div[@class=\"input-group date\"]//input")
	  private WebElement datepicker;
	  
	  @FindBy(id = "txt_comment")
	    private WebElement txt_comment;
	  
	  @FindBy(id = "btn-book-appointment")
	    private WebElement appointment;
	 
	    
	  public WebElement getcombo_facility() {
			return combo_facility;
		}
	  
	  public WebElement getmedicare() {
			return medicare;
		}
	  public WebElement getMedicaid() {
			return Medicaid;
		}
	  public WebElement getnone() {
			return none;
		}
	  public WebElement getdatepicker() {
			return datepicker;
		}
	  public WebElement gettxt_comment() {
			return txt_comment;
		}
	  public WebElement getappointment() {
			return appointment;
		}
}
