package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartYourInformationPage {
    //Elementos

    @FindBy(id="first-name")
    WebElement txtFirstName;

    @FindBy(id="last-name")
    WebElement txtLastName;

    @FindBy(id="postal-code")
    WebElement txtZipCode;

    @FindBy(id="continue")
    WebElement btnContinue;

    //Constructor

    public cartYourInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Actions

    public void fillingFormWithBuyersInfo(String name, String lastName, String zipCode){
        txtFirstName.sendKeys(name);
        txtLastName.sendKeys(lastName);
        txtZipCode.sendKeys(zipCode);
    }

    public void clickInContinue(){
        btnContinue.click();
    }

}
