package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	//DECLARATION
			@FindBy(xpath="//div[text()='My Addresses']")
			private WebElement myAddressLink;
			
			//INITIALIZATION
	 		public MyProfilePage(WebDriver driver) {
	 			PageFactory.initElements( driver,this);
	 		}
	 		
	 		//UTILIZATION
	 		
	 		public void clickMyAddresses() {
	 			myAddressLink.click();
	 		}
	 		
}
