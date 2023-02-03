package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class SeoPage_m1 {
    public SeoPage_m1(){


        PageFactory.initElements(Driver.getDriver(),this); }

    //Seo

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;

    @FindBy(id="yoast_wpseo_focuskw_text_input")
    public WebElement enterFocusKeyWord;

    @FindBy(id="yoast_wpseo_metadesc")
    public WebElement metaDescription;

    }


