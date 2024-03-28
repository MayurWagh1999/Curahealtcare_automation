package BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class {
    protected WebDriver driver;
    @Parameters({"browserName","url"})
    @BeforeMethod
	public void configBeforeMathod(String browserName,String url) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}else if(browserName.equals("internet explorer")) {
			driver=new InternetExplorerDriver();
		}else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
