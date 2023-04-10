package implementation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DriverSetup;
import pages.MedicarePage;



@Test
public class G_LoginWithAdmin extends DriverSetup{
	
	public static void G_LoginWithAdminMethod() throws InterruptedException, IOException {
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		prop = new Properties();		
		FileInputStream Logininput = new FileInputStream ("config.properties");
		prop.load(Logininput);
		

		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		CommonObject.get_LoginLink().click();
		Thread.sleep(2000);
		CommonObject.get_Email().clear();
		Thread.sleep(1000);
		CommonObject.get_Email().sendKeys(prop.getProperty("EmailInputAdmin"));
		Thread.sleep(1000);
		CommonObject.get_password().clear();
		Thread.sleep(1000);
		CommonObject.get_password().sendKeys(prop.getProperty("PasswordAdmin"));
		Thread.sleep(1000);
		CommonObject.get_LoginButton().click();
		Thread.sleep(4000);

		
		//Login Verification
		String Expected_Title = "Medicare - Home";
		String Actual_Title =driver.getTitle();
		Thread.sleep(1000);
		Assert.assertEquals(Actual_Title, Expected_Title);
		System.out.println("Login Successful with Admin user");
		
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


