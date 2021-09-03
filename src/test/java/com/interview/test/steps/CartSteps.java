package com.interview.test.steps;

//import io.cucumber.java.en.And;

import com.interview.test.drivers.Driver;
import com.interview.test.pages.CartPage;
import com.interview.test.pages.CategoryPage;
import com.interview.test.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    private final Driver driver;
    private final CategoryPage categoryPage;

    public CartSteps(Driver driver) {
        this.driver = driver;
        this.categoryPage = new CategoryPage(driver.getDriver(), driver.getParams());
    }


    @When("I navigate to the page {string}")
    public void i_navigate_to_the_page(String Category) {
        HomePage accountPage = new HomePage(driver.getDriver());
        accountPage.clickMenuItem(Category);
    }

    @When("I select the Highest priced dress from the list")
    public void i_select_the_highest_priced_dress_from_the_list() {

        categoryPage.selectHighestPricedItem();
    }

    @When("I select Add item to the cart")
    public void i_select_add_item_to_the_cart() {
        categoryPage.addItemToCartByPosition();
        categoryPage.closePopup();
    }

    @When("I sort by {string}")
    public void i_sort_by(String sortBy) {
        // Write code here that turns the phrase above into concrete actions
        CategoryPage categoryPage = new CategoryPage(driver.getDriver(), driver.getParams());
        categoryPage.sortBy(sortBy);
    }

    @Then("my item is added to the cart")
    public void my_item_is_added_to_the_cart() {
        CategoryPage categoryPage = new CategoryPage(driver.getDriver(), driver.getParams());
        categoryPage.openCart();
        CartPage cartPage = new CartPage(driver.getDriver(), driver.getParams());
        cartPage.validatePrice(0.0);
        //  categoryPage.verifyPrice(0.0);
    }

    @Then("item is still in the cart")
    public void item_is_still_in_the_cart() {
        CategoryPage categoryPage = new CategoryPage(driver.getDriver(), driver.getParams());
        categoryPage.openCart();
        CartPage cartPage = new CartPage(driver.getDriver(), driver.getParams());
        cartPage.validatePrice(0.0);
    }


}

