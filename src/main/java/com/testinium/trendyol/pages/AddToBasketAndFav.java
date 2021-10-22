package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToBasketAndFav extends BasePage {
    WebDriverWait wait;
    By basketButtonBy = By.cssSelector("button[class='add-to-basket']");
    By favButtonBy = By.cssSelector("button[class='fv']");
    By priceListBy = By.cssSelector("span[class='prc-slg']");

    public String price1;

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = getText(priceListBy);
    }

    public AddToBasketAndFav(WebDriver driver) {
        super(driver);
    }

    public void switchToPage() throws InterruptedException {
        for (String nextTab : driver.getWindowHandles())
            driver.switchTo().window(nextTab);
    }

    public void addBasketButton() {
        click(basketButtonBy, 2);

    }

    public void addFavButton() {
        click(favButtonBy, 2);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void priceList() {
        price1 = getText(priceListBy);

        System.out.println("Price : " + price1);

    }


}
