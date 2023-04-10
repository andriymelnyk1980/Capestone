package implementation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MedicarePage;



@Test
public class E_paymentSection extends C_ShippingAddressWithExistingEntry{
	
	public static void E_paymentSectionMethod() throws Exception {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		prop = new Properties();		
		FileInputStream Paymentinput = new FileInputStream ("config.properties");
		prop.load(Paymentinput);
		
		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		
        //Insert credit card information
		CommonObject.get_cardNumber().clear();
		CommonObject.get_cardNumber().sendKeys(prop.getProperty("CreditCardNumber"));
		Thread.sleep(1000);
		CommonObject.get_expiryYear().clear();
		CommonObject.get_expiryYear().sendKeys(prop.getProperty("expiryYear"));
		Thread.sleep(1000);
		CommonObject.get_expiryMonth().clear();
		CommonObject.get_expiryMonth().sendKeys(prop.getProperty("expiryMonth"));
		Thread.sleep(1000);
		CommonObject.get_cvvCode().clear();
		CommonObject.get_cvvCode().sendKeys(prop.getProperty("cVVNumber"));
		Thread.sleep(1000);
		
		//click on pay button
		CommonObject.get_PayButton().click();
		Thread.sleep(3000);
		
		//Validation of order confirmation
		String ActualMessage = CommonObject.get_OrderConfirmation().getText();
		String ExpectedMessage = "Your Order is Confirmed!!";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


