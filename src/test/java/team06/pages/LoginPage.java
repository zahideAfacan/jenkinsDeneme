package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[id='username']")
    public WebElement username;

    @FindBy(css = "input[id='password']")
    public WebElement password;

    @FindBy(css = "button[name='login']")
    public WebElement signInButton;
}
