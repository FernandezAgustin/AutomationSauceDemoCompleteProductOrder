package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourCartPage {

    //Elements
    @FindBy(id="checkout")
    WebElement btnCheckout;

    //Constructor
    public yourCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Acciones
    public void clickInCheckout(){
        btnCheckout.click();
    }


}
