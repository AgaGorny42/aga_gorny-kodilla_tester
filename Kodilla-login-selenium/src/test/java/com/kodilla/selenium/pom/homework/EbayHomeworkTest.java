package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

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
        ebaySearch.randomResult().click();
    }
    @Test
    public void randomResultTest(){
        List<WebElement> webElements = driver.findElements(By.xpath("//*[@role='heading' and @aria-level='3']"));
        List<String> expectedWebElementsGetText = new ArrayList<>();
        for (WebElement element : webElements) {
            expectedWebElementsGetText.add(element.getText());
        }
        Assertions.assertTrue(expectedWebElementsGetText.contains(ebayHomework.randomResult().getText()));

    }
    @AfterEach
    public void testDown() {
        driver.close();
    }
}
