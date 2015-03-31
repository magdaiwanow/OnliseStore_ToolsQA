package automationFramework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase_POF {
    static WebDriver driver;

    @FindBy(xpath=".//*[@id='account']/a")
    static WebElement btn_myAccount;

    @FindBy(id="log")
    static WebElement txtfd_username;

    @FindBy(id="pwd")
    static WebElement txtfd_password;

    @FindBy(id="login")
    static WebElement btn_login;

    @FindBy()
    static WebElement btn_logout;

    public static void main (String[] args) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");

        PageFactory.initElements(driver, TestCase_POF.class);

        btn_myAccount.click();

        txtfd_username.sendKeys("testuser_1");

        txtfd_password.sendKeys("Test@123");

        btn_login.click();

        System.out.println("Login successfully");

        driver.quit();

    }



}
