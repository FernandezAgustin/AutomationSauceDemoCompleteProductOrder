package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverviewPage {

    //Elementos
    @FindBy(id="finish")
    WebElement btnFinish;

    //Constructor
    public checkoutOverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void clickInFinishButton(){
        btnFinish.click();
    }
}
