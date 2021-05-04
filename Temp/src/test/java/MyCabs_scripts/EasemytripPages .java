package EaseMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class EasemytripPages {
	WebDriver Driver;
	public EasemytripPages(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(linkText="HOLIDAYS")
	@CacheLookup
    WebElement holiday;

	public void setHolidayLinkClick()
	{
		holiday.click();
	}
	public boolean getHolidayLinkClicked() {
		return holiday.isDisplayed();
	}
	
	
	@FindBy(name="txtDesCity")
	@CacheLookup
    WebElement holidayinputfield;
	public List<WebElement> setHolidayInputField(String input)
	{
		holidayinputfield.sendKeys(input);
		return null;
	
	}
	public boolean getHolidayPage() {
		return holidayinputfield.isDisplayed();
	}
	
	
	@FindBy(tagName="onclick")
	@CacheLookup
    WebElement back;

	public void setBackClick()
	{
		back.click();
	}
	
	
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/form/div/div[3]/button")
	@CacheLookup
    WebElement search;
	public void setSearchBthClick()
	{
		search.click();
		
		
	}
	public boolean getSearchEnabled() {
		return search.isEnabled();
	}
	
	
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/div[5]/a/img")
	@CacheLookup
    WebElement imagesource;

	public void setImageSourceClick()
	{
		imagesource.click();
		
	}
	
	@FindBy(id="PackageName")
	@CacheLookup
    WebElement pacakagename;
	public void setPackageName(String input)
	{
		pacakagename.click();
		pacakagename.sendKeys(input);
	}
	public String PackageNameField()
	{
		String textInsideInputBox = pacakagename.getAttribute("value");
		return textInsideInputBox;
	
	}
	
	
	@FindBy(id= "PackageDepartureCity")
	@CacheLookup
	WebElement fromOptions;
	public String NewDelhifromOptionSelected() 
	{
		Select select = new Select(fromOptions);
		return select.getFirstSelectedOption().getAttribute("value");
	}
	public void changeTheFromOption(String input) {
		Select select = new Select(fromOptions);
		select.selectByVisibleText(input);
	}

	
	@FindBy(name="datepicker")
	@CacheLookup
    WebElement dateofdeparture;

	public void setDateOfDepartureClick(String input)
	{
		dateofdeparture.click();
		dateofdeparture.sendKeys(input);
	}
	public String DateOfDepartureField()
	{
		String textInsideInputBox = dateofdeparture.getAttribute("value");
		return textInsideInputBox;
	
	}
	

	
	@FindBy(id="ContactName")
	@CacheLookup
    WebElement yournamefield;
	public void setYourNameInputFieldClick(String input)
	{
		yournamefield.sendKeys(input);
	}
	
	public String NameInputField()
	{
		String textInsideInputBox = yournamefield.getAttribute("value");
		return textInsideInputBox;
	
	}
	
	@FindBy(xpath="//*[@id=\"MobileNo\"]")
	@CacheLookup
    WebElement mobilenumberfield;
	public void setMobileNumberInputFieldClick(String input)
	{
		mobilenumberfield.sendKeys(input);
		
	}
	public String MobileNumberInputField()
	{
		String textInsideInputBox = mobilenumberfield.getAttribute("value");
		return textInsideInputBox;
	}
	
	
	
	@FindBy(id="ContactEmail")
	@CacheLookup
    WebElement EmailAddressField;
	public void setEmailAddressInputFieldClick(String input)
	{
		EmailAddressField.sendKeys(input);
	}
	public String EmailInputField()
	{
		String textInsideInputBox = EmailAddressField.getAttribute("value");
		return textInsideInputBox;
	}
	
	
	
	@FindBy(id="Button2")
	@CacheLookup
    WebElement submit;
	public void setSubmitBthClick()
	{
		submit.click();
		
}
	
	
}