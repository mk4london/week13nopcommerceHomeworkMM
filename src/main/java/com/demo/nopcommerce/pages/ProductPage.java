package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.basePage.BasePage;
import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktop = By.xpath("//ul[@class='sublist first-level']/li[1]");
    // By buildComputer = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    By buildComputer = By.xpath("//div[@class='buttons']");

    public void buildYourOwnComputer() throws InterruptedException {
        mouseHoverToElement(computer, 10);
        mouseclickToElement(desktop, 30);
        selectByValueFromDropdown(By.xpath("//select[@id='products-orderby']"), 10, "5");
        Thread.sleep(3000);
        mouseHoverToElement(buildComputer, 10);
        mouseclickToElement(buildComputer, 10);
        try {
            mouseclickToElement(buildComputer, 10);
        } catch (StaleElementReferenceException e) {
            mouseclickToElement(buildComputer, 10);

        }

    }

    public void selectProcessor(String value) throws InterruptedException {
        selectByValueFromDropdown(By.xpath("//select[@name='product_attribute_1']"), 10, value);
    }

    public void selectRam(String value) throws InterruptedException {
        selectByValueFromDropdown(By.id("product_attribute_2"), 10, value);
    }


    public void selectHdd(String size) throws InterruptedException {
        String hdd = getTextFromElement(By.xpath("//label[contains(text(),'320 GB')]"), 5);
        String hddsize = size;
        hddsize.equalsIgnoreCase(size);
        if (hdd.equals(hddsize)) {
            Thread.sleep(500);
            clickOnElement(By.cssSelector("#product_attribute_3_6"), 5);
        } else {
            Thread.sleep(5000);
            clickOnElement(By.cssSelector("#product_attribute_3_7"), 5);
        }


    }

    public void selectOs(String operatingSystem) throws InterruptedException {
        Thread.sleep(5000);
    //    String os = getTextFromElement(By.cssSelector("#product_attribute_4_8"), 50);
        String os = getTextFromElement(By.xpath("//input[@id='product_attribute_4_9']"), 50);
        String operating = operatingSystem;
        operating.equalsIgnoreCase(operatingSystem);
        if (os.equals(operating)) {
            Thread.sleep(500);
            clickOnElement(By.cssSelector("#product_attribute_4_8"), 5);
        } else {
            Thread.sleep(5000);
            clickOnElement(By.cssSelector("#product_attribute_4_9"), 5);
        }

    }

    public void selectSoftware(String software) throws InterruptedException {
        String office = getTextFromElement(By.cssSelector("#product_attribute_5_10"), 10);
        String acrobat = getTextFromElement(By.cssSelector("#product_attribute_5_11"), 10);
        String totalcommander = getTextFromElement(By.cssSelector("#product_attribute_5_12"), 10);
        String soft = software;
        soft.equalsIgnoreCase(software);
        if (soft.equals(office)) {
            clickOnElement(By.cssSelector("#product_attribute_5_10"), 10);
            clickOnElement(By.cssSelector("#product_attribute_5_10"), 10);

        } else if (soft.equals(acrobat)) {
            clickOnElement(By.cssSelector("#product_attribute_5_10"), 10);
            clickOnElement(By.cssSelector("#product_attribute_5_11"), 10);

        } else if (soft.equals(totalcommander)){
            clickOnElement(By.cssSelector("#product_attribute_5_10"), 10);
            clickOnElement(By.cssSelector("#product_attribute_5_12"));

        }


        /*else !(soft.equals(office) && soft.equals(acrobat) && soft.equals(totalcommander)){
        clickOnElement(By.cssSelector("#product_attribute_5_10"),10);
        clickOnElement(By.cssSelector("#product_attribute_5_10"),10);
        clickOnElement(By.xpath("#product_attribute_5_11"),10);
        clickOnElement(By.cssSelector("#product_attribute_5_12"));


        //clickOnElement(By.xpath("//dd[@id='product_attribute_input_5']/ul/li"), 30);
    }*/

    }

    public void addToCart(){
        mouseHoverToElement(By.cssSelector("#add-to-cart-button-1"), 10);
        mouseclickToElement(By.cssSelector("#add-to-cart-button-1"), 10);


    }
}


