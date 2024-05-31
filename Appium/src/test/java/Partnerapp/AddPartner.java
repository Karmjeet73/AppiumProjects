package Partnerapp;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AddPartner {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
        Thread.sleep(15000);
        WebElement Verifiedproceed=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"VERIFY & PROCEED\"]"));
        Verifiedproceed.click();
        Thread.sleep(2000);
        WebElement MyProfile=driver.findElement(By.xpath("//android.view.View[@content-desc=\"K\"]"));
        MyProfile.click();
        Thread.sleep(2000);
        WebElement PersonalProfile=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Personal Profile\"]"));
        PersonalProfile.click();
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement ReferPartner=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Refer Partner\"]"));
        ReferPartner.click();
        Thread.sleep(1000);
        WebElement PartnerName=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        PartnerName.click();
        PartnerName.sendKeys("Rajkumar");
        Thread.sleep(1000);
        WebElement PartnerMobile=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        PartnerMobile.click();
        PartnerMobile.sendKeys("7567545803");
        WebElement Submit=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Partner\"]"));
        Submit.click();
        Thread.sleep(1000);
        WebElement OKAY=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OKAY\"]"));
        OKAY.click();
        Thread.sleep(5000);
//        public void scrollAndClick(String visibleText) {
//            AndroidDriver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")).click();
//               }
           


}
       
     
        }
        
      



