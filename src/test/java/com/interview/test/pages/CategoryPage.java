package com.interview.test.pages;

import com.interview.test.drivers.Params;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CategoryPage {
    private final WebDriver driver;
    private final Params params;

    public CategoryPage(WebDriver driver, Params params) {
        this.driver = driver;
        this.params = params;
    }

    public Boolean isCategoryDressesPageDisplayed() {
        return driver.getTitle() == "Dresses - My Store";
    }

    public void sortBy(String sortBy) {
        Select dressesMenuItem = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
        dressesMenuItem.selectByVisibleText(sortBy);
    }

//    public void additemToCart() {
//        WebElement addItemToCartButton = driver.findElement(By.className("ajax_add_to_cart_button"));
//        addItemToCartButton.click();
//    }


    public void addItemToCartByPosition() {
        WebElement addToButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" +
                (getHighestPriceIndex() + 1) +
                "]/div/div[2]/div[2]/a[1]"));
        addToButton.click();
    }

    public void selectHighestPricedItem() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" +
                (getHighestPriceIndex() + 1) +
                "]/div"));
        element.click();
    }


    public void closePopup() {
        WebElement element = driver.findElement(By.cssSelector(".cross"));
        element.click();
    }

    public void openCart() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        element.click();
    }

    public int getHighestPriceIndex() {
        List<Double> prices = driver.findElements(By.cssSelector(".price.product-price")).stream()
                .map(WebElement::getText)
                .filter(s -> !s.equals(""))
                .map(s -> s.replace("$", ""))
                .map(Double::parseDouble).collect(Collectors.toList());

        int index = IntStream.range(0, prices.size())
                .reduce((a, b) -> prices.get(a) < prices.get(b) ? b : a).orElse(0);
        params.addParam("Price", prices.get(index));
        return index;

    }


}
