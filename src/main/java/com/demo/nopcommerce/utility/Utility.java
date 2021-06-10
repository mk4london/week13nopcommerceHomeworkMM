package com.demo.nopcommerce.utility;

import com.demo.nopcommerce.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility extends BasePage {
    /**
     * this methode click on elements
     *
     * @param by
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    /***
     *
     * @param by
     * @param timeout
     * This method can click on element with wait time
     */
    public void clickOnElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();

    }


    /**
     * This method will  get the text from element
     *
     * @param by
     * @return
     */

    public String getTextFromElement(By by) {

        return driver.findElement(by).getText();

    }

    /***
     *
     * @param by
     * @param timeout
     * @return
     */
    public String getTextFromElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).getText();

    }

    /***
     * This method will send text on elements
     * @param by
     * @param text
     */
    public void sendTextFromElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    /***
     * This method will send text on elements with time wait
     * @param by
     * @param timeout
     * @param text
     */
    public void sendTextFromElement(By by, int timeout, String text) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

        driver.findElement(by).sendKeys(text);
    }

    /***
     * this methode select the value from dropdown
     * @param by
     * @param value
     */
    public void selectByValueFromDropdown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    /***
     *
     * @param by
     * @param timeout
     * @param value
     */
    public void selectByValueFromDropdown(By by, int timeout, String value) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    /***
     *
     * @param by
     * @param timeout
     * @param value
     */
    public void selectByVisableText(By by,int timeout,String value ){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    /***
     *
     * @param by
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    /***
     *
     * @param by
     * @param timeout
     */
    public void mouseHoverToElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    /***
     *
     * @param by
     * @param timeout
     */

    public void mouseclickToElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    /***
     *
     * @param by
     * @param timeout
     * @param expected
     * @param unexpected
     */
    public void verifyMessage(By by,int timeout ,String expected,String unexpected ){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        String expectedMessage =expected;
        String actualMessage  = driver.findElement(by).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    public void verifyDecendingorder(By by){
        List<WebElement> webelementslist = driver.findElements(by);
        List<String> weblistname = new ArrayList<>();
        for (WebElement list : webelementslist) {
            weblistname.add(list.getText());
        }
        List<String> templist = new ArrayList<>();
        templist.addAll(weblistname);
        Collections.sort(templist,Collections.reverseOrder());
        System.out.println(weblistname);
        System.out.println(templist);
        Assert.assertEquals(weblistname,templist);

    }





}
