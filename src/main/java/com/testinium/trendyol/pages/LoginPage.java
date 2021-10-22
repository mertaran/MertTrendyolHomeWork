package com.testinium.trendyol.pages;

import com.testinium.trendyol.users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By userNameFieldBy = By.id("login-email");
    By passwordFieldBy = By.id("login-password-input");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage login(User User) {
        sendKeys(userNameFieldBy, User.getEmail(), false);
        sendKeys(passwordFieldBy, User.getPassword(), true);

        MainPage MainPage = new MainPage(driver);
        MainPage.waitForLoad();
        return MainPage;
    }

}
