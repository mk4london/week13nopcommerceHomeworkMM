package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
1. create class "TopMenuTest"
 	1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
	1.2 This method should click on the menu whatever name is passed as parameter.
	1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.

 */

public class HomePage extends Utility {

    public void select_Menu(String menu) throws InterruptedException {

        List<WebElement> elementList2 = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        Thread.sleep(2000);
        for (WebElement element : elementList2) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }


        }
    }
}
