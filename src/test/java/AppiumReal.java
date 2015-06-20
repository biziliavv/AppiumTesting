import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.net.URL;
import java.util.Set;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AppiumReal {

    public AppiumDriver driver = null;

    @Before
    public void setUp() throws Exception {

        //Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
//        File app = new File("/Users/admin/Library/Developer/Xcode/DerivedData/Capalaba_Park-aouqwbpkpbpyqbesgyzifhfskcie/Build/Products/Debug-iphonesimulator/Capalaba Park.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.2");
        capabilities.setCapability("deviceName", "My Iphone");
        capabilities.setCapability("app", "/Users/admin/Library/Developer/Xcode/DerivedData/Capalaba_Park-fdntunnwdiqpjdfamqadtbrigljy/Build/Products/Debug-iphoneos/Capalaba Park.app");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {


            public MobileElement scrollTo(String s) {
                return null;
            }

            public MobileElement scrollToExact(String s) {
                return null;
            }
        };
    }

    @Test
    public void titleChecking() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.closeApp();
        driver.removeApp("com.capalabapark.parkpoints");
        driver.installApp("/Users/admin/Library/Developer/Xcode/DerivedData/Capalaba_Park-fdntunnwdiqpjdfamqadtbrigljy/Build/Products/Debug-iphoneos/Capalaba Park.app");
        driver.launchApp();
        driver.lockScreen(2);


//        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("biziliavv@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("qwerty");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        Thread.sleep(2000);
//        try {
//            driver.findElement(By.name("OK")).click();
//        } catch (Exception e) {
//            System.out.println("Button is missing");
//
//        }
//
//        try {
//            driver.findElement(By.name("Allow")).click();;
//        } catch (Exception e) {
//            System.out.println("Button is missing");
//
//        }
//
//        Thread.sleep(2000);
//        try {
//            driver.findElement(By.name("close cross circular button")).click();
//        } catch (Exception e) {
//            System.out.println("Button is missing");
//
//        }
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
}