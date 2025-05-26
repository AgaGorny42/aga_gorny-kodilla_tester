package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EbayHomeworkTest {

    EbayHomework ebayHomework;
    WebDriver driver;

    @BeforeEach
    public void setUp() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.ebay.pl/");
        ebayHomework = new EbayHomework(driver);

        EbayHomework ebaySearch = new EbayHomework(driver);
        ebaySearch.fillInSearchField("przyroda");
    }

    @Test
    public void randomResultTest() throws InterruptedException {

        EbayHomework ebaySearch = new EbayHomework(driver);
        EbayHomeworkRandomResult ebayHomeworkRandomResult = ebaySearch.randomResult();
        Assertions.assertNotNull(ebayHomeworkRandomResult.getUrl());

    }
    @AfterEach
    public void testDown() {
        driver.close();
    }

}
