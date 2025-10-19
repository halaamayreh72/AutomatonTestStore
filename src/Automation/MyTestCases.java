package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends MyData

{
	WebDriver driver = new EdgeDriver();
	String theURL ="https://automationteststore.com/";
    String SignUpPage ="https://automationteststore.com/index.php?rt=account/create";
	
	@BeforeTest
	public void MySetup ()
	
	{
          driver.get(theURL);
        // Set an implicit wait time (wait up to 5 seconds when locating elements)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        
		     
     }
		
		
		
	
	
	
	
	@Test (priority=1)
	public void SignUp() throws InterruptedException
	
	{
		 driver.navigate().to(SignUpPage);
		 WebElement FirstName = driver.findElement(By.id("AccountFrm_firstname"));
		 WebElement LastName = driver.findElement(By.id("AccountFrm_lastname"));
		 WebElement Email = driver.findElement(By.id("AccountFrm_email"));
         WebElement TelephoneNumber = driver.findElement(By.id("AccountFrm_telephone"));
         WebElement TheFax = driver.findElement(By.id("AccountFrm_fax"));
		 WebElement AddressOne = driver.findElement(By.id("AccountFrm_address_1"));
		 WebElement theCountry = driver.findElement(By.id("AccountFrm_country_id"));
		 WebElement TheState = driver.findElement(By.id("AccountFrm_zone_id"));
		 
		
		 Select mySelectElementForCountry = new Select(theCountry);
		 mySelectElementForCountry.selectByIndex(108);
          Thread.sleep(2000);
		 Select mySelectElementForState = new Select(TheState);
		 mySelectElementForState.selectByIndex(TheSelectIndex); 
		 
		 List <WebElement> AlltheStates = TheState.findElements(By.tagName("option"));
		 String theCity = AlltheStates.get(TheSelectIndex).getText();
		 WebElement TheCityInput = driver.findElement(By.id("AccountFrm_city"));

		 
		 //actions
		 FirstName.sendKeys(TheFirstName);
		 LastName.sendKeys(TheLastNames);
		 Email.sendKeys(TheEmail);
		 TelephoneNumber.sendKeys(telephoneNumber);
		 TheFax.sendKeys(theFax);
		 AddressOne.sendKeys(theAdressOne);
		 TheCityInput.sendKeys(theCity);
		 
		
		
		
	}

    

    @AfterTest
    public void AfterMyTest() 
    {
    	
     // driver.close();
    }
        
 

}
