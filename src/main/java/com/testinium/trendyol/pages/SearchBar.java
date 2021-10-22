package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage {
    By searchBoxBy = By.cssSelector("input[class='search-box']");
    By overlayClickBy = By.cssSelector("div[class='overlay']");

    public SearchBar(WebDriver driver) {
        super(driver);
    }
    public void searchBox (String keyword){
        driver.findElement(searchBoxBy).sendKeys(keyword+ Keys.ENTER);

    }
    public void clickOverlay(){
        click(overlayClickBy,2);
    }

}
