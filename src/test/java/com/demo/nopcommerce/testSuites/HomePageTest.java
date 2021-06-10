package com.demo.nopcommerce.testSuites;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testBase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() throws InterruptedException {
        homePage.select_Menu("Electronics");
        verifyMessage(By.xpath("//div[@class='page-title']/h1"), 30, "Electronics", "User is not on a page");



    }
}
