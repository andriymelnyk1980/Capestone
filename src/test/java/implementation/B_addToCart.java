package implementation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.MedicarePage;



@Test
public class B_addToCart extends A_Login{
	
	public static void B_addToCartMethod() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		
        //View medicine1 and click on add to  cart button
		CommonObject.get_Medicine1().click();
		Thread.sleep(2000);
		CommonObject.get_AddToCartButton().click();
		Thread.sleep(3000);
		
		//Now go to Home screen
		CommonObject.get_HomeScreenButton().click();
		Thread.sleep(4000);
		
		 //View medicine2 and click on add to  cart button
		CommonObject.get_Medicine2().click();
		Thread.sleep(2000);
		CommonObject.get_AddToCartButton().click();
		Thread.sleep(3000);
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


