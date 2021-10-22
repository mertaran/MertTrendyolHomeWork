package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectProduct extends BasePage {
    By selectProductBy = By.cssSelector("div[class='p-card-wrppr']");

    public void clickProduct() {
        List<WebElement> productList = driver.findElements(selectProductBy);
        WebElement list1 = productList.get(9);
        list1.click();
    }

    public SelectProduct(WebDriver driver) {
        super(driver);
    }
}
