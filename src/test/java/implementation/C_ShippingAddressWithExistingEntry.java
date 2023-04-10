package implementation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.MedicarePage;



@Test
public class C_ShippingAddressWithExistingEntry extends B_addToCart{
	
	public static void C_ShippingAddressWithExistingEntryMethod() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		
        //click on checkout button
		CommonObject.get_Checkout().click();
		Thread.sleep(2000);
		
		
		//Click on select for existing address
		CommonObject.get_SelectButton().click();
		Thread.sleep(3000);
		
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


