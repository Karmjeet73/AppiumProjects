package Partnerapp;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ReportsAndSupport {

    public static void main(String[] args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device capabilities
        capabilities.setCapability("deviceName", "motorola moto g34 5G");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("app", "D:\\appium app\\Partnerapp.apk");
        capabilities.setCapability("appPackage", "com.wealthbird.eazyhainapar");
        capabilities.setCapability("appActivity", "com.wealthbird.eazyhainapar.MainActivity");

        URL appiumServerURL;
        AndroidDriver driver = null;
        int retryCount = 0;
        int maxRetry = 3;

        while (retryCount < maxRetry) {
            try {
                appiumServerURL = new URL("http://127.0.0.1:4723/");
                driver = new AndroidDriver(appiumServerURL, capabilities);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

                // Interacting with the app
                WebElement getStarted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Get Started']")));
                getStarted.click();

                WebElement notificationPermission = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")));
                notificationPermission.click();

                WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
                login.click();
                login.sendKeys("9729951696");

                driver.navigate().back();

                WebElement getOtp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"GET OTP\"]")));
                getOtp.click();

                // Wait for OTP verification (assuming it takes some time)
                Thread.sleep(15000);

                WebElement verifyAndProceed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"VERIFY & PROCEED\"]")));
                verifyAndProceed.click();

                // Adding client
                WebElement addClient = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button")));
                addClient.click();

                WebElement clientName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
                clientName.click();
                clientName.sendKeys("Shyam Singh");

                WebElement clientPhone = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
                clientPhone.click();
                clientPhone.sendKeys("9729377594");

                WebElement submit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
                submit.click();

                WebElement okay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"OKAY\"]")));
                okay.click();

                WebElement myProfile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"K\"]")));
                myProfile.click();

                WebElement personalProfile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Personal Profile\"]")));
                personalProfile.click();
                driver.navigate().back();

                // Support and report
                WebElement support = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Support\"]")));
                support.click();

                WebElement havingIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
                havingIssue.click();
                havingIssue.sendKeys("Not Working System as expected");

                WebElement submitIssue = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
                submitIssue.click();

                WebElement okayIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
                okayIssue.click();
                driver.navigate().back();

                WebElement viewIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"View Issue\"]")));
                viewIssue.click();
                driver.navigate().back();
                driver.navigate().back();

                WebElement reports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Reports']")));
                reports.click();

                WebElement clientSummary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\"Client Summary\"]")));
                clientSummary.click();
                driver.navigate().back();

                WebElement commissionSummary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\"Commission Summary\"]")));
                commissionSummary.click();
                driver.navigate().back();

                WebElement commissionLedger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\"Commission Ledger\"]")));
                commissionLedger.click();
                driver.navigate().back();
                driver.navigate().back();

                // Refer partner
                WebElement referPartner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Refer Partner\"]")));
                referPartner.click();

                WebElement partnerName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
                partnerName.click();
                partnerName.sendKeys("Rajkumar");

                WebElement partnerMobile = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
                partnerMobile.click();
                partnerMobile.sendKeys("7567545803");

                WebElement submitPartner = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Partner\"]"));
                submitPartner.click();

                WebElement okayPartner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"OKAY\"]")));
                okayPartner.click();

                // Exit loop if successful
                break;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
                // Retry logic
                retryCount++;
                if (driver != null) {
                    driver.quit();
                }
                System.out.println("Retrying... Attempt " + retryCount);
            }
        }

        // Cleanup
        if (driver != null) {
            driver.quit();
        }
    }
}
