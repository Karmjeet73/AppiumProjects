package Partnerapp;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ReportsAndSupport {
	public static void main(String[] args) throws InterruptedException, IOException {
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
        Thread.sleep(1000);
        WebElement GetStarted=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Get Started\"]"));
        GetStarted.click();
        Thread.sleep(1000);
        WebElement Notificationpermission=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        Notificationpermission.click();
        Thread.sleep(1000);
        WebElement Login=driver.findElement(By.xpath("//android.widget.EditText"));
        Login.click();
        Thread.sleep(1000);
        Login.sendKeys("9729951696");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        WebElement GetOtp=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"GET OTP\"]"));
        GetOtp.click();
        Thread.sleep(20000);  
        // Continue with further actions
        WebElement Verifiedproceed=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"VERIFY & PROCEED\"]"));
        Verifiedproceed.click(); 
        Thread.sleep(2000);
        WebElement ClientList=driver.findElement(By.xpath("Learn\r\n"
        		+ "Tab 3 of 4"));
        ClientList.click(); 
        
        
      //android.view.View[@content-desc="Client
//        Tab 2 of 4"]
//        WebElement MyProfile=driver.findElement(By.xpath("//android.view.View[@content-desc=\"K\"]"));
//        MyProfile.click();
//        Thread.sleep(2000);
//        WebElement MyAccount=driver.findElement(By.xpath("//android.view.View[@content-desc=\" Account\"]"));
//        MyAccount.click();
//        WebElement Withdraw=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wallet Balance\r\n"
//        		+ "8000.25\r\n"
//        		+ "Withdraw\"]"));
//        Withdraw.click(); 
//        WebElement ChooseAmount=driver.findElement(By.xpath("//android.view.View[@content-desc=\"2000\"]"));
//        ChooseAmount.click();
//        WebElement WithdrawClick=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Withdraw\"]"));
//        WithdrawClick.click();
//        driver.navigate().back();
//        WebElement Support=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Support\"]"));
//        Support.click();
//        WebElement HavingIssue=driver.findElement(By.xpath("//android.widget.EditText"));
//        HavingIssue.click();
//        HavingIssue.sendKeys("Not Working System as expected");
//        driver.navigate().back();
//        WebElement SubmitIssue=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
//        SubmitIssue.click();
//        WebElement Okay=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
//        Okay.click();
//        Thread.sleep(2000);
////        driver.navigate().back();
//        Thread.sleep(2000);
//        WebElement ViewIssue=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"View Issue\"]"));
//        ViewIssue.click();
//        driver.navigate().back();
//        driver.navigate().back();
//        WebElement Reports=driver.findElement(By.xpath("//android.view.View[@content-desc='Reports']"));
//        Reports.click();
//        WebElement ClientSummary=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Client Summary\"]"));
//        ClientSummary.click();
//        driver.navigate().back();
//        WebElement CommsionSummary=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Commission Summary\"]"));
//        CommsionSummary.click();
//        driver.navigate().back();
//        WebElement CommsionLedger=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Commission Ledger\"]"));
//        CommsionLedger.click();
//        driver.navigate().back();
//        driver.navigate().back();
//        driver.navigate().back();
//        Thread.sleep(2000);
//        WebElement Logout=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Log Out\r\n"
//        		+ "V1.3.9\"]"));
//        Logout.click();
//        Thread.sleep(2000);
//        WebElement ConfirmLogout=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"YES\"]"));
//        ConfirmLogout.click();
        
     
        
        
        
        

        
        
        
        
       
     
        String scrollableText = "Sahil Room"; // Replace "YourText" with the text you want to scroll to
        WebElement element = driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + scrollableText + "\"))"
        ));

       
        
      System.out.println("sahi chal rha h code"); 
        driver.quit();
    }}
