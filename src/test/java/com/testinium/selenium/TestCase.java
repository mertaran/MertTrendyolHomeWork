package com.testinium.selenium;

import com.testinium.trendyol.Log4j;
import com.testinium.trendyol.pages.*;
import com.testinium.trendyol.users.User;
import org.junit.Test;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class TestCase extends BaseTest {

    @Test
    public void trendYolTest() throws InterruptedException {
        String title = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        String email = "merttestinium@gmail.com";
        String password = "aranmert1";
        MainPage mainPage = new MainPage(driver);
        String webDriverTitle = mainPage.getHomePageTitle();
        Log4j.info("Title : " + webDriverTitle);
        assertEquals(webDriverTitle, title);

        GenderSelector genderSelector = new GenderSelector(driver);
        Log4j.info("Gender being chosen");
        genderSelector.genderSelector();

        LoginPage loginPage = mainPage.getLoginPage();
        User user = new User(email, password);
        loginPage.login(user);
        TimeUnit.SECONDS.sleep(2);
        Log4j.info("Looking for 'kazak' ");
        SearchBar searchBar = new SearchBar(driver);
        searchBar.searchBox("kazak");
        searchBar.clickOverlay();
        Log4j.info("Product being chosen");
        SelectProduct selectProduct = new SelectProduct(driver);
        selectProduct.clickProduct();

        AddToBasketAndFav addToBasketAndFav = new AddToBasketAndFav(driver);
        Log4j.info("The selected product is added to the basket and favorite.");
        addToBasketAndFav.switchToPage();
        addToBasketAndFav.addBasketButton();
        TimeUnit.SECONDS.sleep(3);
        addToBasketAndFav.addFavButton();
        TimeUnit.SECONDS.sleep(3);
        Log4j.info("Product price information is received.");
        addToBasketAndFav.priceList();
        System.out.println("Price Eşit :" + addToBasketAndFav.getPrice1());
        BasketPage basketPage = new BasketPage(driver);
        Log4j.info("Go to Basket page");
        basketPage.goToBasketPage();
        Log4j.info("Product deleting");
        basketPage.deleteProduct();
        basketPage.secondDelete();
        Log4j.info("Go to Favorite Page");
        TimeUnit.SECONDS.sleep(2);
        basketPage.gotoFavPage();
        TimeUnit.SECONDS.sleep(2);
        Log4j.info("Selected product favorite deleting");
        basketPage.favDelete();
        TimeUnit.SECONDS.sleep(2);


    }

}
