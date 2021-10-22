package com.testinium.trendyol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    By basketPage = By.cssSelector("a[class='link account-basket']");
    By deleteProduct = By.cssSelector("i[class='i-trash']");
    By secondDeleteBTN = By.cssSelector("button[class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']");
    By dataID = By.cssSelector("div[data-id='53629462']");
    By favCancelBTN = By.cssSelector("i[class='i-close']");
    By gotoFavPage = By.cssSelector("div[class='link']");

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void goToBasketPage() {
        click(basketPage, 3);
    }

    public void deleteProduct() {
        click(deleteProduct, 3);

    }

    public void secondDelete() {
        click(secondDeleteBTN, 3);
    }

    public void gotoFavPage() {
        click(gotoFavPage, 3);
    }

    public void favDelete() {
        getText(dataID);
        if (dataID == dataID) {
            click(favCancelBTN, 2);

        } else if (dataID != dataID) {
            System.out.println("Favorilerden çıkarmaya çalıştınız ürün aynı değil" + getText(dataID));
        }

    }

}

