package team06.tests.US_11;

import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.pages.LoginPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class US_11_TC01 {
    @Test
    public void us_11_TC01Test() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));


    }
}
