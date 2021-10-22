package com.testinium.selenium;

import com.testinium.trendyol.Log4j;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        String baseUrl = "https://www.trendyol.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chrome/chromedriver.exe");
        driver = new ChromeDriver(options);
        Log4j.info("Test is starting");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        Log4j.info("Test is ending");
        driver.quit();
    }

}


