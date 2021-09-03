package com.interview.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
    private final WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isIndexPageDisplayed() {
        System.out.println(driver.getTitle());
        return driver.getTitle() == "My Store";
    }

    public void clickSignIn() {
        driver.findElement(By.cssSelector(".login")).click();
    }
}
