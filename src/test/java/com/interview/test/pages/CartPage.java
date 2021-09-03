package com.interview.test.pages;

import com.interview.test.drivers.Params;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
    private final WebDriver driver;
    private final Params params;

    public CartPage(WebDriver driver, Params params) {
        this.driver = driver;
        this.params = params;
    }


    public void validatePrice(double price) {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"product_price_4_16_562997\"]/span"));
        String expected = params.getParam("Price").toString();
        System.out.println(expected);
        String actual = element.getText().replace("$", "");
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}
