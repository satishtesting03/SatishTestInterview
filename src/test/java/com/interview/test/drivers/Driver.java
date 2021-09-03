package com.interview.test.drivers;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Driver {
    private WebDriver driver;
    private Params params;

    public Driver(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        params = new Params();
    }


    public void get(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Params getParams() {
        return params;
    }
}
