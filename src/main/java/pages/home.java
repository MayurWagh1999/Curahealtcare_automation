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
	  
	  @FindBy(linkText = "Tokyo CURA Healthcare Center")
	  private WebElement Tokyo_CURA_Healthcare_Center;
	  
	  @FindBy(linkText = "Hongkong CURA Healthcare Center")
	  private WebElement Hongkong_CURA_Healthcare_Center;
	  
	  @FindBy(linkText = "Seoul CURA Healthcare Center")
	  private WebElement Seoul_CURA_Healthcare_Center;
	  
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
	  
	 @FindBy(id = "menu-toggle")
	  private WebElement menutoggle;
	 
	 @FindBy(linkText = "Home" )
	 private WebElement Home;
	 
	 @FindBy(linkText = "History" )
	 private WebElement History;
	 
	 @FindBy(linkText = "Profile" )
	 private WebElement Profile;
	 
	 @FindBy(linkText = "Logout" )
	 private WebElement Logout;
	 
	    
	  public WebElement getcombo_facility() {
			return combo_facility;
		}
	  
	  public WebElement getTokyo_CURA_Healthcare_Center() {
			return Tokyo_CURA_Healthcare_Center;
		}
	  public WebElement getHongkong_CURA_Healthcare_Center() {
			return Hongkong_CURA_Healthcare_Center;
		}
	  
	  public WebElement getSeoul_CURA_Healthcare_Center() {
			return Seoul_CURA_Healthcare_Center;
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
	  
	  public WebElement getmenutoggle() {
			return menutoggle;
		}
	  
	  public WebElement getHome() {
			return Home;
		}
	  
	  public WebElement getHistory() {
			return History;
		}
	  
	  public WebElement getProfile() {
			return Profile;
		}
	  
	  public WebElement getLogout() {
			return Logout;
		}
}
