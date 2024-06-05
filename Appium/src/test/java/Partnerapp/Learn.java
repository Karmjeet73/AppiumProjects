package Partnerapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Learn {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device capabilities
		 capabilities.setCapability("deviceName", "motorola moto g34 5G");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("automationName", "uiautomator2");
	        capabilities.setCapability("platformVersion", "14");
	        capabilities.setCapability("app", "D:\\appium app\\Partnerapp.apk");
        URL appiumServerURL = new URL("http://127.0.0.1:4723/");
      
        AndroidDriver driver = new AndroidDriver(appiumServerURL, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement GetStarted=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Get Started\"]"));
        GetStarted.click();
       
        WebElement Notificationpermission=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        Notificationpermission.click();
        
        WebElement Login=driver.findElement(By.xpath("//android.widget.EditText"));
        Login.click();
        ;
        Login.sendKeys("9729951696");
    
        driver.navigate().back();
      
        WebElement GetOtp=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"GET OTP\"]"));
        GetOtp.click();
        Thread.sleep(10000);  
        // Continue with further actions
        WebElement Verifiedproceed=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"VERIFY & PROCEED\"]"));
        Verifiedproceed.click(); 
        Thread.sleep(5000);
        WebElement Learn=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Client\r\n"
        		+ "Tab 2 of 4\"]"));




        Learn.click();
      
		

	}

}
