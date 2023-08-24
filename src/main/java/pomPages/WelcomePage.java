package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
     //DECLARATION
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	//INITIALIZATION
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//UTILIZATION
	public void clickLoginButton() {
		loginButton.click();
	}
	
}
