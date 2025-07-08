package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomeg\\Desktop\\Agusi\\kodilla-course\\Kodilla-login-selenium\\chromedriver.exe");  // [1]
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        WorldTimePage page = new WorldTimePage(webDriver);

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\tomeg\\Desktop\\Agusi\\Kodilla Selenium OcularExample\\results"))
                .snapshotPath(Paths.get("C:\\Users\\tomeg\\Desktop\\Agusi\\Kodilla Selenium OcularExample\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        page.open();
        page.compare();
        page.close();
    }
}
