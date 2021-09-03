package com.interview.test.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private WebDriver driver;

    public Hooks(WebDriver driver){
        this.driver = driver;
    }

    @Before
        public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
            }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
