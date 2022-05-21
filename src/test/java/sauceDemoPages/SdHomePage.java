package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SdHomePage {

    //Elements
    @FindBy(id = "user-name")
    WebElement txtUser;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(id="login-button")
    WebElement btnSubmitButton;

    //Constructor

    public SdHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Actions

    public void validCredentialsLogin(String user, String pass){
        txtUser.sendKeys(user);
        txtPassword.sendKeys(pass);
    }

    public void clickInLogin(){
        btnSubmitButton.click();
    }



}
