package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class HomePage {
            
	//DECLARATION
			@FindBy(xpath="//button[@aria-label='Account settings']")
			private WebElement   profileButon;
			@FindBy(xpath="//li[.='My Profile']")
			private WebElement  myprofile;
			@FindBy(xpath="//li[.='Logout']")
			private WebElement logout;
			@FindBy(xpath="//a[text()='Electronic']")
			private WebElement electronicTab;
			@FindBy(xpath="//span[text()='headphone']")
			private WebElement headphoneLink;
	
			//INITIALIZATION
	 		public HomePage(WebDriver driver) {
	 			PageFactory.initElements( driver,this);
	 		}
	
	 		public void clickProfileButton() {
	 			profileButon.click();
	 		}
	 		public void selectMyProfile() {
	 			myprofile.click();
	 		}
	 		public void clickLogout() {
	 			logout.click();
	 		}
	 		public void mouseHoverToElectronics(WebDriverUtility  web) {
	 			web.mouseHover(electronicTab);
	 		}
	 		public void clickHeadPhoneLink() {
	 			headphoneLink.click();
	 		}
}
