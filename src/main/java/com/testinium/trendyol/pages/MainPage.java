package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    By mainBy = By.id("container");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainBy));
    }
}
