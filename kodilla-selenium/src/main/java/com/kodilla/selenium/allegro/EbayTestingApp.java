package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EbayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.pl/");

        WebElement select = driver.findElement(By.cssSelector("#gh-cat"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        select.click();

        WebElement select2 = driver.findElement(By.cssSelector(".gh-search-categories"));
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"gh-search-categories\"]/option"));
        elements.get(1).click();

        String text = elements.get(1).getText();
        System.out.println(text);

        for(int i=0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

        WebElement clickFind = driver.findElement(By.className("gh-search-button__label"));
        clickFind.click();


//        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac-wrap\"]/input"));
//        inputField.sendKeys("mavic mini");
//        inputField.submit();
    }
}
