/**
 * Created by admin on 5/14/15.
 */
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

public class Parknewtest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

        //Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
        File app = new File("/Users/admin/Library/Developer/Xcode/DerivedData/Capalaba_Park-aouqwbpkpbpyqbesgyzifhfskcie/Build/Products/Debug-iphonesimulator/Capalaba Park.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.2");
        capabilities.setCapability("deviceName", "iPhone 5s");
        capabilities.setCapability("app", app.getAbsolutePath());


        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {


        };


}

    @Test
    public void titleChecking() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.lockScreen(2000);

        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(1000);
        try {
            driver.findElement(By.name("close cross circular button")).click();
        } catch (Exception e) {
            System.out.println("Button is missing");

        }
        Thread.sleep(1500);
        driver.findElement(By.name("Earn")).click();
        Thread.sleep(1500);
        System.out.println("Title is missing on Earn screen!");
        driver.findElement(By.name("Redeem")).click();
        System.out.println("Title is missing on Redeem screen!");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[2]/UIACollectionCell[2]/UIAButton[1]")).click();
        System.out.println("Title is missing on opened Redeem screen!");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Deals")).click();
        System.out.println("Title is missing on Deals screen!");
        Thread.sleep(1500);
        driver.findElement(By.name("Competitions")).click();
        System.out.println("Title is missing on Competitons screen!");
        Thread.sleep(1500);
    }

    @Test
    public void changePasswordPageChecking() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("close cross circular button")).click();
        } catch (Exception e) {
            System.out.println("Button is missing");

        }
        Thread.sleep(1500);
        driver.findElement(By.name("icon menu top")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Settings")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Change your password")).click();
        Thread.sleep(1500);
        System.out.println("No Submit button on opened page!");
        Thread.sleep(1500);

    }

    @Test
    public void enablingPermissionsChecking() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("close cross circular button")).click();
        } catch (Exception e) {
            System.out.println("Button is missing");

        }
        Thread.sleep(1500);
        driver.findElement(By.name("icon menu top")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Settings")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Permissions")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIACollectionCell[1]/UIASwitch[(@value='1')]")).click();
        driver.findElement(By.xpath("//UIACollectionCell[2]/UIASwitch[(@value='1')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Permissions")).click();
        Thread.sleep(1500);
        System.out.println("Both buttons are ON!");
        Thread.sleep(1500);
    }


    @Test
    public void buyendScanScreenChecking() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("close cross circular button")).click();
        } catch (Exception e) {
            System.out.println("Button is missing");

        }
        driver.findElement(By.name("open_qr_reader")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(1500);
        System.out.println("Wrong title! Title should be Buy&Scan");
        Thread.sleep(1500);
    }

    @Test
    public void inviteviaFacebookButtonName() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("close cross circular button")).click();
        } catch (Exception e) {
            System.out.println("Button is missing");

        }
        driver.findElement(By.name("icon menu top")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Refer a friend")).click();
        Thread.sleep(1000);
        System.out.println("Wrong name of button! Name should be Invite via Facebook");
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("UIATarget.localTarget().deactivateAppForDuration(50)");
    }
}
