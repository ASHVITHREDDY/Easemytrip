package EaseMyTrip;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EasemytripScript extends EasemytripBaseClass 
{
	@Test(priority = 1,dataProvider="getdata1")
	public void EasemytripPositive(String citylocation,String defaultcityname,String cityofdeparture,String dateofdeparture,String name,String emailaddress,String mobilenumber) throws InterruptedException {
		EasemytripPages Links=new EasemytripPages(Driver);
		if (Driver.getCurrentUrl().contains("https://www.easemytrip.com/"))
		{
			logger.info("User is on HomePage of EaseMyTrip Website ");		
		}else
		{
			logger.info("User is not on HomePage of EaseMyTrip Website");
		}
		if (Links.getHolidayLinkClicked())
		{
		logger.info("Holiday link is present on the page");
		Links.setHolidayLinkClick();
		logger.info("Holiday link is Clicked");
		}
		else
		{
			logger.info("Holiday link is not present on the page");
	
		}
		if (Driver.getCurrentUrl().contains("https://www.easemytrip.com/holiday-packages.html"))
		{
			logger.info("User is on Holiday page");
		Links.setHolidayInputField(citylocation);
		
		logger.info("Holiday destination is entered");
		Thread.sleep(2000);
		}
		else
		{
			logger.info("User is not on Holiday page");
		}
		if (Links.getSearchEnabled())
		{
			logger.info("Search button is Enabled");
		  Links.setSearchBthClick();
		  logger.info("Search button is clicked");
		  Thread.sleep(2000);
		}
		 else 
		  {
		
			 logger.info("Search button is Not Enabled");
	      }
	
		Links.setImageSourceClick();
		logger.info("Holiday destination image is clicked");
		Thread.sleep(2000);
	   if (Links.NewDelhifromOptionSelected().equals(defaultcityname))
	{
		   logger.info("By Default New Delhi is selected in City Departure list ");
	}
		else
		{
			logger.info("By Default New Delhi is not selected in City Departure list ");
		}
		Links.changeTheFromOption(cityofdeparture);
		logger.info("Pune is selected in City Departure list ");
		Thread.sleep(4000);
		Links.setDateOfDepartureClick(dateofdeparture);
		if(Links.DateOfDepartureField().isEmpty())
		{
		    logger.info("Required Date of Departure");
			Thread.sleep(3000);
		}else
		{
			logger.info("Date of Departure entered");
		}
	
		Links.setYourNameInputFieldClick(name);
		if(Links.NameInputField().isEmpty())
		{
			
			logger.info("Required Name");
			Thread.sleep(3000);
		}else
		{
			logger.info("Name is entered");
		}
			
		Links.setEmailAddressInputFieldClick(emailaddress);
		Thread.sleep(3000);
		if(Links.EmailInputField().isEmpty())
		{
			
			logger.info("Required Email Address");
			Thread.sleep(3000);
		}else {
			logger.info("Email Address is entered");
		}

		Links.setMobileNumberInputFieldClick(mobilenumber);
		Thread.sleep(3000);
		if(Links.MobileNumberInputField().isEmpty())
		{
			logger.info("Required Mobile Number");
			Thread.sleep(3000);
		}else
		{
			logger.info("Mobile number is entered");
		}
        Driver.navigate().to("https://www.easemytrip.com/");
	}

@DataProvider(name="getdata1")
public Object[][] getdata1()
{
	Object[][] data=new Object[1][7];
	data[0][0]="Bangalore";
	data[0][1]="New Delhi";
	data[0][2]="Pune";
	data[0][3]="29/02/2021";
	data[0][4]="balaji";
	data[0][5]="1998balaji@gmail.com";
	data[0][6]="8073565677";
	return data;	
}


@Test(priority = 2,dataProvider="getdata2")
public void getURLEaseMytTripNegative(String citylocation) throws InterruptedException
{
	EasemytripPages Links=new EasemytripPages(Driver);
	if (Driver.getCurrentUrl().contains("https://www.easemytrip.com/"))
	{
		logger.info("User is on HomePage of EaseMyTrip Website ");		
	}else
	{
		logger.info("User is not on HomePage of EaseMyTrip Website");
	}
	if (Links.getHolidayLinkClicked())
	{
	logger.info("Holiday link is present on the page");
	Links.setHolidayLinkClick();
	logger.info("Holiday link is Clicked");
	}
	else
	{
		logger.info("Holiday link is not present on the page");
	}
	if (Driver.getCurrentUrl().contains("https://www.easemytrip.com/holiday-packages.html"))
	{
	logger.info("User is on Holiday page");
	Links.setHolidayInputField(citylocation);
	logger.info("Holiday destination is entered");
	}
	else
	{
		logger.info("User is not on Holiday page");
	}
	Links.setSearchBthClick();
    logger.info("Sorry, your page not found"); 
	}
					
@DataProvider(name="getdata2")
public Object[] getdata2()
{
Object[] data=new Object[1];
data[0]="aaaa";
return data;	
}
}

	

	





