package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KodillaStorePomApplication {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomeg\\Desktop\\Agusi\\kodilla-course\\Kodilla-login-selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

//        Duration waitTime = Duration.ofMillis(2000);
//        WebDriverWait wait = new WebDriverWait(driver, waitTime);
//        wait.withTimeout(waitTime);

        driver.close();
    }
}
