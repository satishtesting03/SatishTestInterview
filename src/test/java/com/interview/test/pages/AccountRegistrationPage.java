package com.interview.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage {
    private final WebDriver driver;

    public AccountRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void MrTitle() {
        WebElement titleMrBtn = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        titleMrBtn.click();
    }

    public void MrsTitle() {
        WebElement titleMrsBtn = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        titleMrsBtn.click();
    }

    public void FirstName(String firstName) {
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameField.sendKeys(firstName);
    }

    public void LastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastNameField.sendKeys(lastName);
    }

    public void Email(String email) {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }

    public void dobDays(String days) {
        Select dobDaysDropDown = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        dobDaysDropDown.selectByVisibleText(days);
    }

    public void dobMonths(String month) {
        Select dobMonthDropDown = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        dobMonthDropDown.selectByVisibleText(month);
    }

    public void dobYear(String year) {
        Select dobYearDropDown = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        dobYearDropDown.selectByVisibleText(year);
    }

    public void Password(String password) {
        WebElement pswField = driver.findElement(By.xpath("//input[@id='passwd']"));
        pswField.sendKeys(password);
    }

    public void AddressFirstName(String firstName) {
        WebElement addressFirstNameField = driver.findElement(By.xpath("//input[@id='firstname']"));
        addressFirstNameField.sendKeys(firstName);
    }

    public void AddressLastName(String lastName) {
        WebElement addressLastNameField = driver.findElement(By.xpath("//input[@id='lastname']"));
        addressLastNameField.sendKeys(lastName);
    }

    public void companyField(String company) {
        WebElement companyField = driver.findElement(By.xpath("//input[@id='company']"));
        companyField.sendKeys(company);
    }

    public void Address1(String address) {
        WebElement addressField = driver.findElement(By.xpath("//input[@id='address1']"));
        addressField.sendKeys(address);
    }

    public void Address2(String address) {
        WebElement addressField = driver.findElement(By.xpath("//input[@id='address2']"));
        addressField.sendKeys(address);
    }

    public void City(String city) {
        WebElement cityField = driver.findElement(By.xpath("//input[@id='city']"));
        cityField.sendKeys(city);
    }

    public void State(String state) {
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
        stateDropDown.selectByVisibleText(state);
    }

    public void Zip(String zip) {
        WebElement zipField = driver.findElement(By.xpath("//input[@id='postcode']"));
        zipField.sendKeys(zip);
    }

    public void HomePhoneNumberr(String phoneNumber) {
        WebElement homePhoneField = driver.findElement(By.xpath("//input[@id='phone']"));
        homePhoneField.sendKeys(phoneNumber);
    }

    public void MobilePhoneNumberr(String phoneNumber) {
        WebElement mobilePhoneField = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
        mobilePhoneField.sendKeys(phoneNumber);
    }

    public void AddressAlias(String addressAlias) {
        WebElement addressAliasField = driver.findElement(By.xpath("//input[@id='alias']"));
        addressAliasField.sendKeys(addressAlias);
    }

    public void clickSubmit() {
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        submitBtn.click();
    }
}
