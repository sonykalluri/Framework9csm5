package pomPages;


import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class AddressFormPage {
	@FindBy (xpath="//input[@id='Name']")
	private WebElement nameTF;
	@FindBy (id="House/Office Info")
	private WebElement houseInfoTF;
	@FindBy (id="Street Info")
	private WebElement streetInfoTF;
	@FindBy (id="Landmark")
	private WebElement landmarkTF;
	@FindBy (id="Country")
	private WebElement countryDropdown;
	@FindBy (id="State")
	private WebElement stateDropdown;
	@FindBy (id="City")
	private WebElement cityDropdown;
	@FindBy (id="Pincode")
	private WebElement pincodeTF;
	@FindBy (id="Phone Number")
	private WebElement phoneNumberTF;
	//@FindBy (id="btnDisabled")
	@FindBy (xpath="//button[@id='btnDisabled']")
	private WebElement addAddressButton;
	
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	/*public void addAddressDetails(String name, String houseinfo, String streetinfo, String landmark,WebDriverUtility web,
			String country,String state,String city, String pincode, String phoneNum) {
		nameTF.sendKeys(name);
		houseInfoTF.sendKeys(houseinfo);
		streetInfoTF.sendKeys(streetinfo);
		landmarkTF.sendKeys(landmark);
		
		web.selectFromDropdown(country,countryDropdown );
		web.selectFromDropdown(state,stateDropdown);
		web.selectFromDropdown(city,cityDropdown);
		
		pincodeTF.sendKeys(pincode);
		phoneNumberTF.sendKeys(phoneNum);
		addAddressButton.click();		
	}*/
	public void addAddressDetails(WebDriverUtility web,Map<String, String> map) {
		nameTF.sendKeys(map.get("Name"));
		houseInfoTF.sendKeys(map.get("House/Office Info"));
		streetInfoTF.sendKeys(map.get("Street Info"));
		landmarkTF.sendKeys(map.get("LandMark"));
		
		web.selectFromDropdown(map.get("Country"),countryDropdown );
		web.selectFromDropdown(map.get("State"),stateDropdown);
		web.selectFromDropdown(map.get("City"),cityDropdown);
		
		pincodeTF.sendKeys(map.get("Pincode"));
		phoneNumberTF.sendKeys(map.get("Phone Number"));
		addAddressButton.click();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}