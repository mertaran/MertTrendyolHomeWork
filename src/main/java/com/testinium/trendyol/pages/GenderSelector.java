package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSelector extends BasePage {
    By genderSelector1 = By.cssSelector("img[alt='Male']");

    public GenderSelector(WebDriver driver) {

        super(driver);
    }

    public void genderSelector() {
        click(genderSelector1, 3);

    }
}


