package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import sauceDemoPages.*;

public class SauceDemoCompleteOrderTest {

    WebDriver driver;
    String chromeDriverPath = "..//AutomationNewProject-master//Drivers//chromedriver.exe";
    String url = "https://www.saucedemo.com/";

    @BeforeSuite
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @Test
    public void buyingProduct() {
        SdHomePage home = new SdHomePage(driver);
        home.validCredentialsLogin("standard_user", "secret_sauce");
        home.clickInLogin();

        productsPage products = new productsPage(driver);
        products.clickInAddToCartBackPack();
        products.clickInCartIcon();

        yourCartPage cart = new yourCartPage(driver);
        cart.clickInCheckout();

        cartYourInformationPage personalInfo = new cartYourInformationPage(driver);
        personalInfo.fillingFormWithBuyersInfo("John", "Cena", "1878");
        personalInfo.clickInContinue();

        checkoutOverviewPage preOrder = new checkoutOverviewPage(driver);
        preOrder.clickInFinishButton();
    }

    @AfterSuite
    public void shutdownBrowserAndDriver() {
        driver.quit();
    }
}
