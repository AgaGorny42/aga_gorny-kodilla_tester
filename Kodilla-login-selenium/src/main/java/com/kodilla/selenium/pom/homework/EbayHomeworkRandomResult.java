package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class EbayHomeworkRandomResult extends AbstractPom {

    public EbayHomeworkRandomResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public String getUrl(){
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        System.out.println(tabs);

        driver.switchTo().window(tabs.get(1));
        return driver.getCurrentUrl();

    }
}
