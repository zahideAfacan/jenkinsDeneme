package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class AdvancedPage_m1 {
    public AdvancedPage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[10]")
    public WebElement advanced;

    @FindBy(id="enable_reviews")
    public WebElement enableReviews;

    @FindBy(id="menu_order")
    public WebElement menuOrder;

    @FindBy(id="purchase_note")
    public WebElement purchaseNote;

}
