package Partnerapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AddClient {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device capabilities
		 capabilities.setCapability("deviceName", "motorola moto g34 5G");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("automationName", "uiautomator2");
	        capabilities.setCapability("platformVersion", "14");
	        capabilities.setCapability("app", "D:\\appium app\\Partnerapp.apk");
        URL appiumServerURL = new URL("http://127.0.0.1:4723/");
        Thread.sleep(5000);
        AndroidDriver driver = new AndroidDriver(appiumServerURL, capabilities);
        Thread.sleep(5000);
        WebElement GetStarted=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Get Started\"]"));
        GetStarted.click();
        Thread.sleep(5000);
        WebElement Notificationpermission=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        Notificationpermission.click();
        Thread.sleep(5000);
        WebElement Login=driver.findElement(By.xpath("//android.widget.EditText"));
        Login.click();
        Thread.sleep(5000);
        Login.sendKeys("9729951696");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        WebElement GetOtp=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"GET OTP\"]"));
        GetOtp.click();
        Thread.sleep(15000);
        WebElement Verifiedproceed=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"VERIFY & PROCEED\"]"));
        Verifiedproceed.click();
        WebElement ADDCLIENT=driver.findElement(By.xpath("//android.widget.Button"));
        ADDCLIENT.click();
        Thread.sleep(5000);
        WebElement CLIENTNAME=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        CLIENTNAME.click();
        CLIENTNAME.sendKeys("Shyam Singh");
        WebElement CLIENTPHONE=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        CLIENTPHONE.click();
        CLIENTPHONE.sendKeys("8035241846");
        WebElement Submit=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
        Submit.click();
        Thread.sleep(5000);
        WebElement OKAY=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OKAY\"]"));
        OKAY.click();
        
        
        
        System.out.println("done");
       
		// TODO Auto-generated method stub
      //android.widget.Button[@content-desc="OKAY"]
	}

}
