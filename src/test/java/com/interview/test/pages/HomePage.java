package com.interview.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isMyAccountPageDisplayed(){
        return driver.getTitle() .equals("My account - My Store");
    }

    public void clickMenuItem(String menuName){
        List<WebElement> dressesMenuItem = driver.findElements(By.cssSelector("a[title='" + menuName + "']"));
        dressesMenuItem.get(1).click();
    }
}
