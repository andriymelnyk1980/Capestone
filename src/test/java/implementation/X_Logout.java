package implementation;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MedicarePage;



@Test
public class X_Logout extends E_paymentSection{
	
	public static void F_LogoutMethod() throws Exception {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		
        //click on continue shopping button
		CommonObject.get_ContinueShopping().click();
		Thread.sleep(1000);
		
		//click on logout menu and logout button
		CommonObject.get_LogoutMenu().click();
		Thread.sleep(1000);
		CommonObject.get_LogOutButton().click();
		Thread.sleep(1000);
	
		//Logout validation
		String Expected_Title = "Medicare - Login";
		String Actual_Title =driver.getTitle();
		Thread.sleep(1000);
		Assert.assertEquals(Actual_Title, Expected_Title);
		System.out.println("Login Successful");
		Thread.sleep(2000);
		driver.quit();
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


