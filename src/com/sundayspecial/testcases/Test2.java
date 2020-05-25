package com.sundayspecial.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.beust.jcommander.Parameter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
 
public class Test2{
    
	public String username = "Your_LambdaTest_Username";
    public String accesskey = "Your_LambdaTest_Access_Key";
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
    static WebDriver driver ;
    
    //Setting up capabilities to run our test script
   
    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", 84.0);
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs

         capabilities.setCapability("selenium_version","4.0.0-alpha-2");
         capabilities.setCapability("timezone","UTC+05:30");
         capabilities.setCapability("geoLocation","IN");
         capabilities.setCapability("chrome.driver","78.0");


        try {
        	 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
     		// System.setProperty("webdriver.ie.driver", ".\\driver\\chromedriver.exe");
     		   
     		  //it is used to initialize the IE driver
     		   driver = new ChromeDriver(capabilities);
          //  driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (Exception e) {
            System.out.println("Invalid grid URL");
        } 
               
    }
    
    //Opening browser with the given URL and navigate to Registration Page
    @BeforeMethod
    public void openBrowser()
    {
 //   	driver.manage().deleteAllCookies();
    	
		driver.get("https://www.lambdatest.com/");
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        
        WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Start Free Testing')]"));
        signUpButton.click(); 
        
    }
    
    //Verifying elements on Registration page
    @Test
    public void verifyElementsOnPageTest()
    {
    	WebElement lambdaTestLogo = driver.findElement(By.xpath("//p[@class='signup-titel']"));
    	lambdaTestLogo.isDisplayed();
    	
    	WebElement signUpTitle = driver.findElement(By.xpath("//p[@class='signup-titel']"));
    	signUpTitle.isDisplayed();
    	
    	WebElement termsText = driver.findElement(By.xpath("//label[@class='woo']"));
    	termsText.isDisplayed();
    	
    	WebElement loginLinkText = driver.findElement(By.xpath("//p[@class='login-in-link test-left']"));
    	loginLinkText.isDisplayed();
    	
    }  
    
    // Closing the browser session after completing each test case
    @AfterClass
    public void tearDown() throws Exception {
      
           
            driver.quit();
        
    }
}