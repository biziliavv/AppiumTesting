/**
 * Created by admin on 4/28/15.
 */
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

import static org.junit.Assert.*;

public class BrooksideTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

        //Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
        File app = new File("/Users/admin/Library/Developer/Xcode/DerivedData/Capalaba_Park-fdntunnwdiqpjdfamqadtbrigljy/Build/Products/Debug-iphonesimulator/Brookside.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.2");
        capabilities.setCapability("deviceName", "iPhone 5s");
        capabilities.setCapability("app", app.getAbsolutePath());



        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {


        };

    }

    @Test
    public void test01() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Sign Up")).click();
        driver.findElement(By.xpath("//UIATextField[(@value='First Name')]")).sendKeys("First");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIATextField[(@value='Last Name')]")).sendKeys("Last");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("bla@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("Password123");
        Thread.sleep(1500);
        driver.findElement(By.name("Done")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Back")).click();


    }


    @Test
    public void test02() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("testvitalii@mailinator.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("123456");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Earn")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Redeem")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Deals")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Competitions")).click();
        Thread.sleep(1500);


    }

    @Test
    public void test03() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("testvitalii@mailinator.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("123456");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("icon menu top")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[1]")).click();
        Thread.sleep(1500);
        WebElement editprofile = driver.findElement(By.name("Edit Profile"));
        WebElement editprofileback = driver.findElement(By.name("edit_profile_background"));
        Assert.assertEquals(true, editprofile.isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(true, editprofileback.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("History")).click();
        Thread.sleep(2000);
        WebElement hist = driver.findElement(By.name("History"));
        //WebElement table = driver.findElement(By.xpath("//UIATableView[(@value='rows 1 to 10 of 10')]"));
        Assert.assertEquals(true, hist.isDisplayed());
        Thread.sleep(2000);
//        Assert.assertEquals(true, table.isDisplayed());
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Refer a friend")).click();
        Thread.sleep(1000);
        WebElement refer = driver.findElement(By.name("Refer a friend"));
        WebElement invite = driver.findElement(By.name("Invite a friend to join the app, both of you will receive 10 points each"));
        WebElement inviteemail = driver.findElement(By.name("Invite via email"));
        WebElement invitefb = driver.findElement(By.name("Invite via Facebook"));
        Assert.assertEquals(true, refer.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, invite.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, inviteemail.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, invitefb.isDisplayed());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Settings")).click();
        Thread.sleep(2000);
        WebElement settings = driver.findElement(By.name("Settings"));
        WebElement edityourprofile = driver.findElement(By.name("Edit your profile"));
        WebElement changeyourpassword = driver.findElement(By.name("Change your password"));
        WebElement notifications = driver.findElement(By.name("Notifications"));
        WebElement permissions = driver.findElement(By.name("Permissions"));
        Thread.sleep(1000);
        Assert.assertEquals(true, settings.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, edityourprofile.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, changeyourpassword.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, notifications.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(true, permissions.isDisplayed());
        Thread.sleep(1000);
    }

    @Test
    public void test04() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("renaterichter@mailinator.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(1000);
        WebElement passwordmessage = driver.findElement(By.name("Please enter a password that is atleast 6 characters long."));
        Assert.assertEquals(true, passwordmessage.isDisplayed());

    }

    @Test
    public void test05() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("testvitalii@mailinator.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("blablabla");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(2000);
        System.out.println("Message is wrong!");
        WebElement passwordmessage2 = driver.findElement(By.name("Your passwordd is missing or incorrect"));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());

    }

    @Test
    public void test06() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(1500);
        WebElement nocredentials = driver.findElement(By.name("Please ensure your email is correctly entered."));
        Assert.assertEquals(true, nocredentials.isDisplayed());
    }

    @Test
    public void test07() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//UIASecureTextField[(@value='Password')]")).sendKeys("blablabla");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
        Thread.sleep(1000);
        WebElement passwordmessage2 = driver.findElement(By.name("Please ensure your email is correctly entered."));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());
    }

    @Test
    public void test08() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Sign Up")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("Done")).click();
        Thread.sleep(1500);
        WebElement passwordmessage2 = driver.findElement(By.name("Please complete all your details to sign up."));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());
    }

    @Test
    public void test09() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Forgot Password?")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        WebElement passwordmessage2 = driver.findElement(By.name("Your email is missing or incorrect."));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());
    }

    @Test
    public void test10() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Forgot Password?")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIATextField[(@value='Email')]")).sendKeys("testvitalii@mailinator.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        WebElement passwordmessage2 = driver.findElement(By.name("We’ve sent you a new password via email. You can change it at anytime by going into the app’s Settings once logged-in."));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());
    }
    @Test
    public void test11() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.name("facebook button")).click();
        Thread.sleep(3000);
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {

            if (contextName.contains("WEBVIEW")) {
                driver.context(contextName);

            }

        }
        driver.findElement(By.name("email")).sendKeys("vital-mti@rambler.ru");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("intelconsalt");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2500);
//        driver.navigate().to("NATIVE_APP");
//        Thread.sleep(5000);
        driver.findElement(By.name("__CONFIRM__")).click();
        Thread.sleep(3000);
        driver.context("NATIVE_APP");
        driver.findElement(By.name("Allow")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("icon menu top")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Done")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Save")).click();
        Thread.sleep(1000);
        WebElement passwordmessage2 = driver.findElement(By.name("Your profile is completed on 100 %!"));
        Assert.assertEquals(true, passwordmessage2.isDisplayed());
        driver.findElement(By.name("OK")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Logout")).click();

    }
}
