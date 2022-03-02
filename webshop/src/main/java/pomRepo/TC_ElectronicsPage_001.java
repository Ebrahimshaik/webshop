package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_ElectronicsPage_001 {
	
		//Constructor
		public TC_ElectronicsPage_001 (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		

		@FindBy(partialLinkText="Electronics") private WebElement clickOnElectronicsTab;
		@FindBy(xpath="//img[@title='Show products in category Camera, photo']") private WebElement clickOnCamera;
		@FindBy(id="products-orderby") private WebElement clickOnSortByDropdown;
		@FindBy(xpath="//option[text()='Name: Z to A']") private WebElement clickOnZtoAOption;
		@FindBy(id="products-pagesize") private WebElement clickOnDisplayDropdown;
	    @FindBy(xpath="//option[text()='12']") private WebElement clickOn12Option;
		@FindBy(id="products-viewmode") private WebElement clickOnViewAsDropdown;
		@FindBy(xpath="//option[text()='List']") private WebElement clickOnListOption;
		@FindBy(xpath="//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000222_1mp-60gb-hard-drive-handycam-camcorder_125.jpeg']") private WebElement clickOnProduct;
		@FindBy(xpath="//input[@data-productid='72']") private WebElement clickOnAddToCart;
		@FindBy(linkText="Log out") private WebElement clickOnLogout;
		@FindBy(xpath="//img[@title='Show products in category Cell phones']") private WebElement clickOnCellPhones;
		@FindBy(xpath="//img[@title='Show details for Phone Cover']") private WebElement clickOnCellphoneProduct;
		 @FindBy(id="add-to-cart-button-80") private WebElement clickOnAddToCartPhones;
		
		public WebElement getClickOnElectronicsTab() {
			return clickOnElectronicsTab;
		}
		
		
		public WebElement getClickOnCamera() {
			return clickOnCamera;
		}
		
		
		public WebElement getClickOnSortByDropdown() {
			return clickOnSortByDropdown;
		}
		
		
		
		public WebElement getClickOnZtoAOption() {
			return clickOnZtoAOption;
		}
		
		
		
		public WebElement getClickOnDisplayDropdown() {
			return clickOnDisplayDropdown;
		}
		
	  
		
		public WebElement getClickOn12Option() {
			return clickOn12Option;
		}
		
	
		
		public WebElement getClickOnViewAsDropdown() {
			return clickOnViewAsDropdown;
			
			
		
		}
		
		
			
			public WebElement getClickOnListOption() {
				return clickOnListOption;
				
				
			}
			
			
		public WebElement getClickOnProduct() {
					return clickOnProduct;
					
					
			}
		
			

			
				
				public WebElement getClickOnLogout() {
					return clickOnLogout;
						
						
				}		
				
				////////////////////////////////////
				
				
				public WebElement getClickOnCellPhones() {
					return  clickOnCellPhones;
						
						
				}
				
				
				public WebElement getClickOnCellPhoneProduct() {
					return clickOnCellphoneProduct;
						
						
				}
				
				public WebElement getClickOnAddToCartPhones() {
						return  clickOnAddToCartPhones;
							
							
					}
			
				
			
}

