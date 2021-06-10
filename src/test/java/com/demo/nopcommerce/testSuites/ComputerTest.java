package com.demo.nopcommerce.testSuites;

import com.demo.nopcommerce.pages.Computers;
import com.demo.nopcommerce.testBase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    Computers computers = new Computers();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computers.verifyProductArrangeInAlphaBaticalOrder();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computers.verifyProductAddedToShoppingCartSuccessFully ();
       // System.out.println(getTextFromElement(By.xpath("//option[contains(text(),'2 GB')]")));
        System.out.println(getTextFromElement(By.xpath("//label[contains(text(),'320 GB')]"), 5));
        System.out.println(getTextFromElement(By.cssSelector("#product_attribute_4_9")));

    }
}
