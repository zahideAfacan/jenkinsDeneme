package team06.tests.US_04;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team06.pages.*;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

import static team06.utilities.ReusableMethods.waitFor;

public class US_04_TC01 {
    @Test
    public void US04_TC01Test(){
        HomePage homePage=new HomePage();
        LoginPage loginPage=new LoginPage();
        MyAccountPage myAccountPage=new MyAccountPage();
        EditShippingAddressPage editShippingAddressPage=new EditShippingAddressPage();
        AddressesPage addressesPage=new AddressesPage();
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

        homePage.signIn.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("allover_commerce_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("allover_commerce_password"));
        loginPage.signInButton.click();
        waitFor(3);


        //I tried to scroll down to the bottom the page then tried to click the element but it did not work.
        //After I waitFor(2) then it is worked :)
        Actions actions=new Actions(Driver.getDriver());
        //scroll the button of the homepage
        actions.sendKeys(Keys.END).perform();
        waitFor(2);
        //locate my account and click
        homePage.myAccount.click();
        waitFor(2);

        //Note: Also we can click by using JSExecutor
        //clickElementByJS(homePage.myAccount);


        //locate Adresses and click
        myAccountPage.addresses.click();
        addressesPage.editShippingAddress.click();
        waitFor(1);

        //enter first name
        editShippingAddressPage.shippingfirstName.clear();
        editShippingAddressPage.shippingfirstName.sendKeys("Gulcin");

        //enter last name
        editShippingAddressPage.shippinglastName.clear();
        editShippingAddressPage.shippinglastName.sendKeys("Selcuk");

        Select select=new Select(editShippingAddressPage.shippingCountryDropdown);
        select.selectByVisibleText("Turkey");
        waitFor(1);

        editShippingAddressPage.shippingAddress.clear();
        editShippingAddressPage.shippingAddress.sendKeys("13 Leeds Lane");

        editShippingAddressPage.shippingPostcode.clear();
        editShippingAddressPage.shippingPostcode.sendKeys("21420");

        editShippingAddressPage.shippingCity.clear();
        editShippingAddressPage.shippingCity.sendKeys("Merkez");

        Select select1=new Select(editShippingAddressPage.shippingStateDropdown);
        select1.selectByVisibleText("Yalova");
        waitFor(2);



    }

}
