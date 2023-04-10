package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicarePage {
	
	
	
	
	WebDriver driver;
	
	
	public MedicarePage(WebDriver driver) {
		this.driver = driver;
	}
	//Login
	By Email = By.name("username");
	By Password =By.name("password");
	By LoginButton = By.xpath("//*[@id='loginForm']/div[3]/div/input[2]");
	By LoginLink = By.xpath("//*[@id= 'login']/a");
	
	//add to cart
	By Medicine1 = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/a");
	By Medicine2 =By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/a");
	By AddToCartButton = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/a[1]");
	By HomeScreenButton = By.xpath("/html/body/div[2]/nav/div/div[1]/a");
	
	//Shipping address
	By Checkout = By.xpath("//*[@id= 'cart']/tfoot/tr[2]/td[4]/a");
	By SelectButton =By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div/div/a");
	
	//Payment section
	By cardNumber = By.id("cardNumber");
	By expiryMonth = By.id("expityMonth");
	By expiryYear = By.id("expityYear");
	By cvvCode = By.id("cvCode");
	By PayButton = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/a");
	By OrderConfirmation = By.xpath("/html/body/div/div[1]/div/div[1]/h3");
	By ContinueShopping = By.xpath("/html/body/div/div[1]/div/div[4]/a");
	
	//Product creation
	By ManageProductTab = By.xpath("//*[@id='manageProduct']/a");
	By name = By.id("name");
	By brand = By.id("brand");
	By description = By.id("description");
	By unitPrice = By.id("unitPrice");
	By quantity = By.id("quantity");
	By file = By.id("file");
	By categoryId = By.id("categoryId");
	By SubmitButton = By.name("submit");
	By SuccessMessage = By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div");
	
	
	//Logout
	By LogoutMenu = By.id("dropdownMenu1");
	By LogOutButton = By.xpath("//*[@id= 'logout']/a");
	
	public WebElement get_Email() {return driver.findElement(Email);}
	public WebElement get_password() {return driver.findElement(Password);}
	public WebElement get_LoginButton() {return driver.findElement(LoginButton);}
	public WebElement get_LoginLink() {return driver.findElement(LoginLink);}
	
	public WebElement get_Medicine1() {return driver.findElement(Medicine1);}
	public WebElement get_Medicine2() {return driver.findElement(Medicine2);}
	public WebElement get_AddToCartButton() {return driver.findElement(AddToCartButton);}
	public WebElement get_HomeScreenButton() {return driver.findElement(HomeScreenButton);}
	
	public WebElement get_Checkout() {return driver.findElement(Checkout);}
	public WebElement get_SelectButton() {return driver.findElement(SelectButton);}
	
	public WebElement get_cardNumber() {return driver.findElement(cardNumber);}
	public WebElement get_expiryYear() {return driver.findElement(expiryYear);}
	public WebElement get_expiryMonth() {return driver.findElement(expiryMonth);}
	public WebElement get_cvvCode() {return driver.findElement(cvvCode);}
	public WebElement get_PayButton() {return driver.findElement(PayButton);}
	public WebElement get_OrderConfirmation() {return driver.findElement(OrderConfirmation);}
	
	public WebElement get_ContinueShopping() {return driver.findElement(ContinueShopping);}
	public WebElement get_LogoutMenu() {return driver.findElement(LogoutMenu);}
	public WebElement get_LogOutButton() {return driver.findElement(LogOutButton);}
	
	public WebElement get_name() {return driver.findElement(name);}
	public WebElement get_brand() {return driver.findElement(brand);}
	public WebElement get_description() {return driver.findElement(description);}
	public WebElement get_unitPrice() {return driver.findElement(unitPrice);}
	public WebElement get_quantity() {return driver.findElement(quantity);}
	public WebElement get_file() {return driver.findElement(file);}
	public WebElement get_categoryId() {return driver.findElement(categoryId);}
	public WebElement get_SubmitButton() {return driver.findElement(SubmitButton);}
	public WebElement get_ManageProductTab() {return driver.findElement(ManageProductTab);}
	public WebElement get_SuccessMessage() {return driver.findElement(SuccessMessage);}
	}
	





