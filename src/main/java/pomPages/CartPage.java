package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
         //div[@class='cart_productDetails__pKWBd']/child::h3
	@FindBy(xpath="div[@class='cart_productDetails__pKWBd']/h3")
	private WebElement   cartItem;
	
	
	public CartPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
	public String getCartItem() {
		return cartItem.getText();
	}
}
