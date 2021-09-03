package com.interview.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify the Login page is displayed
    public Boolean isLoginPagePageDisplayed() {
        return driver.getTitle() == "Login - My Store";
    }

    //provide email to create a account
    public void emailAddress(String email) {
        WebElement emailAddressField = driver.findElement(By.xpath("//input[@id='email_create']"));
        emailAddressField.sendKeys(email);
    }

    //select the create account button
    public void clickCreateAnAccountButton() {
        WebElement createAccountButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        createAccountButton.submit();
    }

    //login with user Email and user password
    public void EnterUsersnameandPassword(String useremail, String userpassword) {
        WebElement UserEmailField = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement UserpasswordField = driver.findElement(By.xpath("//input[@id='passwd']"));
        UserEmailField.clear();
        UserEmailField.sendKeys(useremail);
        UserpasswordField.clear();
        UserpasswordField.sendKeys(userpassword);
    }

    public void submitButton() {
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        submitBtn.click();
    }
}

