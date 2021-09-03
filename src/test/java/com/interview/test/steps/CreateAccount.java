package com.interview.test.steps;

import com.interview.test.drivers.Driver;
import com.interview.test.pages.AccountRegistrationPage;
import com.interview.test.pages.HomePage;
import com.interview.test.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {
    private final Driver driver;
    private final LoginPage loginPage;


    public CreateAccount(Driver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver.getDriver());
    }


    @When("i provide a email")
    public void i_provide_a_email() {
        loginPage.emailAddress("satish.testing03@gmail.com");
    }

    @When("Click on Create an account button")
    public void click_on_create_an_account_button() {
        loginPage.clickCreateAnAccountButton();
    }

    @Then("the account is created")
    public void the_account_is_created() {
        HomePage accountPage = new HomePage(driver.getDriver());
        accountPage.isMyAccountPageDisplayed();
    }

    @And("I complete the form")
    public void iCompleteTheForm() {
        AccountRegistrationPage registrationForm = new AccountRegistrationPage(driver.getDriver());
        registrationForm.MrsTitle();
        registrationForm.FirstName("satish");
        registrationForm.LastName("testing");
        //registrationForm.Email("satish.testing03@gmail.com");
        registrationForm.Password("Test0123");
        registrationForm.AddressFirstName("Test");
        //registrationForm.dobDays("01");
        //registrationForm.dobMonths("01");
        //registrationForm.dobYear("2000");
        registrationForm.AddressLastName("LastNameTest");
        registrationForm.Address1("123, TestStreet");
        registrationForm.City("Test City");
        registrationForm.State("Alabama");
        registrationForm.Zip("01234");
        registrationForm.MobilePhoneNumberr("012345678");
        registrationForm.AddressAlias("TestAddress");
        registrationForm.clickSubmit();
    }

}
