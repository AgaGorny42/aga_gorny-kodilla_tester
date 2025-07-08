package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EbayHomeworkApplication {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomeg\\Desktop\\Agusi\\kodilla-course\\Kodilla-login-selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.ebay.pl/");

        EbayHomework ebaySearch = new EbayHomework(driver);
        ebaySearch.fillInSearchField("przyroda");
        EbayHomeworkRandomResult ebayHomeworkRandomResult = ebaySearch.randomResult();
        System.out.println(ebayHomeworkRandomResult.getUrl());

        driver.close();

    }
}
