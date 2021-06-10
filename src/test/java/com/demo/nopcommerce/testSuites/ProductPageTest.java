package com.demo.nopcommerce.testSuites;

import com.demo.nopcommerce.pages.ProductPage;
import com.demo.nopcommerce.testBase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductPageTest extends TestBase {
    ProductPage productPage =new ProductPage();
    @Test
    public void buildYourOwnComputer() throws InterruptedException {
        productPage.buildYourOwnComputer();
        productPage.selectProcessor("1");
        // select ram option 2 GB please enter value 3
        // select ram option 2 GB please enter value 4
        // select ram option 2 GB please enter value 5
        productPage.selectRam("3");
        // select hdd = 320 GB
        // select hdd = 400 GB [+$100.00]
        productPage.selectHdd("400 GB [+$100.00]");
        // select Os = Vista Home [+$50.00]
        // select Os = Vista Premium [+$60.00]
        productPage.selectOs("Vista Premium [+$60.00]");
        // select the software = Microsoft Office [+$50.00]
        // select the software = Acrobat Reader [+$10.00]
        // select the software = Total Commander [+$5.00]
        productPage.selectSoftware("Microsoft Office [+$50.00]");
        productPage.addToCart();





    }
}