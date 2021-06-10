package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Create class “TestSuite”
 * <p>
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on Computer Menu.
 * 1.2 Click on Desktop
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * <p>
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on Computer Menu.
 * 2.2 Click on Desktop
 * 2.3 Select Sort By position "Name: A to Z"
 * 2.4 Click on "Add To Cart"
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8 Select HDD radio "400 GB [+$100.00]"
 * 2.9 Select OS radio "Vista Premium [+$60.00]"
 * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
 * 2.11 Verify the price "$1,475.00"
 * 2.12 Click on "ADD TO CARD" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
 */

public class Computers extends Utility {
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktop = By.xpath("//ul[@class='sublist first-level']/li[1]");
    By buildComputer = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");


    public void verifyProductArrangeInAlphaBaticalOrder() {
        mouseHoverToElement(computer, 5);
        mouseclickToElement(desktop, 5);
        selectByValueFromDropdown(By.xpath("//select[@id='products-orderby']"), 10, "6");
        verifyDecendingorder(By.xpath("//h2[@class='product-tittle']"));


    }
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        mouseHoverToElement(computer, 10);
        mouseclickToElement(desktop, 30);
        selectByValueFromDropdown(By.xpath("//select[@id='products-orderby']"), 10, "5");
      //  mouseHoverToElement(buildComputer, 10);
        mouseclickToElement(buildComputer, 10);
        try{
            Thread.sleep(500);
            mouseclickToElement(buildComputer, 10);
        }
        catch(StaleElementReferenceException e) {
            clickOnElement(buildComputer,10);

        }
        Thread.sleep(3000);
        verifyMessage(By.xpath("//h1[contains(text(),'Build your own computer')]"), 80, "Build your own computer", "user is not on a page");

    }

}
