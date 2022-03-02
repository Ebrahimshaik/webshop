package automationScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.TC_ElectronicsPage_001;

public class TC_001ElectronicsTest extends BaseClass{
@Test
	
	public void camera() {
		electronicsTab=new TC_ElectronicsPage_001(driver);
		electronicsTab.getClickOnElectronicsTab().click();
		
		//Camera
		camera=new TC_ElectronicsPage_001(driver);
     	camera.getClickOnCamera().click();
//		
		//Sort by dropdown
		sortby1=new TC_ElectronicsPage_001(driver);
		sortby1.getClickOnSortByDropdown().click();
		
		//click on one option
		optionZtoA1=new TC_ElectronicsPage_001(driver);
		optionZtoA1.getClickOnZtoAOption().click();
		           
        //click on display dropdown
		display1=new TC_ElectronicsPage_001(driver);
		display1.getClickOnDisplayDropdown().click();
		
		//click on 12 option
		option121=new TC_ElectronicsPage_001(driver);
		option121.getClickOn12Option().click();
		
		
		//click on view as dropdown
		viewas1=new TC_ElectronicsPage_001(driver);
		viewas1.getClickOnViewAsDropdown().click();
		
		//click on list option
		listoption1=new TC_ElectronicsPage_001(driver);
		listoption1.getClickOnListOption().click();
	
	   //click on product
		product1=new TC_ElectronicsPage_001(driver);
		product1.getClickOnProduct().click();
//		
//		//click on add to cart
//		addtocart=new TC_ComputerPage_001(driver);
//		addtocart.getClickOnAddToCart().click();
//		
//		//logout
		logout1=new TC_ElectronicsPage_001(driver);
		logout1.getClickOnLogout().click();
}
}
