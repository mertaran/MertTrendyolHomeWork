package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testinium.trendyol.WebDriverHelper;


public class BasePage extends WebDriverHelper {
    By loginButtonBy = By.cssSelector("div[class='account-nav-item user-login-container']");
    By searchBoxBy = By.cssSelector("input[class='search-box']");

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginPage() {
        click(loginButtonBy, 10);
        return new LoginPage(driver);
    }
}





