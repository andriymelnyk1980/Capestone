package pages;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

@SuppressWarnings("unused")
public class DriverSetup {
	public static WebDriver driver;
	public static Actions action;
	public static Properties prop;
	
	@BeforeClass
	public static WebDriver Driver() {
		System.setProperty("webdriver.crome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		return driver;	
	}

	

}