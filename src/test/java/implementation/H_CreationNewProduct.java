package implementation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MedicarePage;



@Test
public class H_CreationNewProduct extends G_LoginWithAdmin{
	
	public static void H_CreationNewProductMethod() throws InterruptedException, IOException {
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		prop = new Properties();		
		FileInputStream CreateProductinput = new FileInputStream ("config.properties");
		prop.load(CreateProductinput);
		

		//Create Object for POM
		MedicarePage CommonObject = new MedicarePage(driver);
		CommonObject.get_ManageProductTab().click();
		Thread.sleep(2000);
		CommonObject.get_name().clear();
		Thread.sleep(1000);
		CommonObject.get_name().sendKeys(prop.getProperty("Name"));
		Thread.sleep(1000);
		CommonObject.get_brand().clear();
		Thread.sleep(1000);
		CommonObject.get_brand().sendKeys(prop.getProperty("Brand"));
		Thread.sleep(1000);
		CommonObject.get_description().clear();
		Thread.sleep(1000);
		CommonObject.get_description().sendKeys(prop.getProperty("Description"));
		Thread.sleep(1000);
		CommonObject.get_unitPrice().clear();
		Thread.sleep(1000);
		CommonObject.get_unitPrice().sendKeys(prop.getProperty("UnitPrice"));
		Thread.sleep(1000);
		CommonObject.get_quantity().clear();
		Thread.sleep(1000);
		CommonObject.get_quantity().sendKeys(prop.getProperty("Quantity"));
		Thread.sleep(1000);
		CommonObject.get_file().sendKeys(prop.getProperty("File"));
		Thread.sleep(1000);
		
		//Create object for select
		Select Category = new Select(CommonObject.get_categoryId());
		Category.selectByIndex(2);
		
		//Click on save button
		CommonObject.get_SubmitButton().click();
		Thread.sleep(2000);
		
		//Product creation Verification
		String Expected_Title = "Product submitted successfully!";
		String Actual_Title = CommonObject.get_SuccessMessage().getText();
		Thread.sleep(1000);
		Assert.assertEquals(Actual_Title, Expected_Title);
		System.out.println("Product added Successfully");
		
		
		
		
	}
	
		
		
		
		
		
	
		
	}
	
	



	
	


