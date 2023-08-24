package testScript;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass{
	@Test
	public void addToCartTest() throws InterruptedException {
		//login TO APPLICATION
		Map<String, String> map=excel.getData("Sheet1", "Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		//MOVING THE CURSOR TO ELECTRONICS
          home.mouseHoverToElectronics(webUtil);
          Thread.sleep(2000);
          //CLICK ON HEADPHN LINK
          home.clickHeadPhoneLink();
          headPhone.clickAddToCart();
          Thread.sleep(3000);
          Assert.assertEquals(headPhone.getAddToCartText(),"ADDED");
          String itemName=headPhone.getItemName();
          headPhone.clickCartIcon();
          Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
          
          
          
	}

}
