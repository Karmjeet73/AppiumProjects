package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Sip {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device capabilities
        capabilities.setCapability("appium:deviceName", "motorola moto g34 5G");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "uiautomator2");
        capabilities.setCapability("appium:platformVersion", "14");
        capabilities.setCapability("appium:app", "D:\\appium app\\app-debug.apk");
        Thread.sleep(5000);
        URL appiumServerURL = new URL("http://127.0.0.1:4723/");
        Thread.sleep(5000);
        AndroidDriver driver = new AndroidDriver(appiumServerURL, capabilities);
        Thread.sleep(5000);
      WebElement DevicePermision = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
      DevicePermision.click();
      WebElement NotificationPermision = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
      NotificationPermision.click();
      Thread.sleep(5000);
      WebElement Login=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Mobile Number\r\n"
      		+ "I agree to receive messages via\r\n"
      		+ "WhatsApp\"]/android.widget.ImageView[1]"));
      Login.click();
      Login.sendKeys("9729951696");
      Thread.sleep(20000);
        WebElement Invest = driver.findElement(By.xpath("//android.view.View[@content-desc='Invest\nTab 2 of 5']"));
 Invest.click();
     Thread.sleep(5000);
     WebElement Lumpsum=driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Lumpsum\"])[1]"));
     Lumpsum.click();
     Thread.sleep(5000);
     WebElement InvestLumpsm=driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Invest Now\"])[1]"));
     InvestLumpsm.click();
     Thread.sleep(5000);
     WebElement Enteramount=driver.findElement(By.xpath("//android.widget.EditText"));
     Enteramount.click();
     Enteramount.sendKeys("100");
     Thread.sleep(5000);
     
     WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));

     Done.click();
     Thread.sleep(5000);
     WebElement VerifedOrder=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"verified\"]"));
     VerifedOrder.click();
     Thread.sleep(5000);
     WebElement Doneorder=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
     Doneorder.click();
     
        System.out.println("Hurray Lumpsum  order successfully Completed");
//      android.widget.Button[@content-desc="Done"]
       
    }
}
