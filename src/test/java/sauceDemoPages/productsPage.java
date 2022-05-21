package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {

    //Elements

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackPackButton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartButton;

    //Constructor

    public productsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void clickInAddToCartBackPack(){
        addToCartBackPackButton.click();
    }

    public void clickInCartIcon(){
        cartButton.click();
    }
}
