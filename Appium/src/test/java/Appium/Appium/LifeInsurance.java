package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LifeInsurance {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device capabilities
        capabilities.setCapability("deviceName", "motorola moto g34 5G");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformVersion", "14");

        // 
        capabilities.setCapability("app", "D:\\appium app\\app-debug.apk");
        URL appiumServerURL = new URL("http://127.0.0.1:4723/");
        Thread.sleep(5000);
        AndroidDriver driver = new AndroidDriver(appiumServerURL, capabilities);
        Thread.sleep(5000);
        Thread.sleep(20000);
        WebElement Invest = driver.findElement(By.xpath("//android.view.View[@content-desc='Invest\nTab 2 of 5']"));
 Invest.click();
     Thread.sleep(5000);
     WebElement LifeInsurance=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Life Insurance\"]"));
     LifeInsurance.click();
     Thread.sleep(5000);
     WebElement LifeContinue=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CONTINUE\"]"));
     LifeContinue.click();
     Thread.sleep(5000);
     WebElement LifeSubmit=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SUBMIT\"]"));
     LifeSubmit.click();
     WebElement ProceedtoBuy=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Proceed to Buy\"])[1]"));
     ProceedtoBuy.click();
     WebElement CamerPermission=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
     CamerPermission.click();
     WebElement DevicePermission=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
     DevicePermission.click();
     
     //android.widget.Button[@content-desc="Proceed to Buy"])[1]
		// TODO Auto-generated method stub

	}

}
