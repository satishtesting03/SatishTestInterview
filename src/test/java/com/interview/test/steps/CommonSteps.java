package com.interview.test.steps;

import com.interview.test.drivers.Driver;
import com.interview.test.pages.IndexPage;
import com.interview.test.pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommonSteps {
    private final Driver driver;
    private final LoginPage loginPage;

    public CommonSteps(Driver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver.getDriver());
    }

    //This is for the Registration and also to sign in
    @Given("I am on the Regsitartion page")
    public void iAmOnTheRegistrationPage() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        IndexPage indexPage = new IndexPage(driver.getDriver());
        indexPage.clickSignIn();
        loginPage.isLoginPagePageDisplayed();
    }
}
