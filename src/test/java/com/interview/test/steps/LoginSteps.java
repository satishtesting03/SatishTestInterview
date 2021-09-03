package com.interview.test.steps;

//import io.cucumber.datatable.DataTable;

import com.interview.test.drivers.Driver;
import com.interview.test.pages.HomePage;
import com.interview.test.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginSteps {
    private final Driver driver;


    public LoginSteps(Driver driver) {
        this.driver = driver;
    }

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("I login in with user {string} and Passowrd {string}")
    public void i_login_in_with_user_and_passowrd(String useremail, String userpassword) {
        LoginPage loginPage = new LoginPage(driver.getDriver());
        loginPage.EnterUsersnameandPassword(useremail, userpassword);
    }

    @When("select Sign in button")
    public void select_sign_in_button() {
        LoginPage loginPage = new LoginPage(driver.getDriver());
        loginPage.submitButton();
    }

    @Then("user is succesfuuly Logged in")
    public void user_is_succesfuuly_logged_in() {
        HomePage accountPage = new HomePage(driver.getDriver());
        Assert.assertTrue(accountPage.isMyAccountPageDisplayed());
    }

    @When("I Logout")
    public void iLogout() {
        HomePage accountPage = new HomePage(driver.getDriver());
        Assert.assertFalse(accountPage.isMyAccountPageDisplayed());
    }
}
