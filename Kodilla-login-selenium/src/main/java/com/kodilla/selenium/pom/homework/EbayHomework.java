package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class EbayHomework extends AbstractPom {

    @FindBy(xpath = "//*[@id='gh-ac-wrap']/input")
    WebElement inputField;

    @FindAll(@FindBy(xpath = "//*[@role='heading' and @aria-level='3']"))
    List<WebElement> listResult;

    public EbayHomework(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillInSearchField(String input) {
        inputField.sendKeys(input);
        inputField.submit();
    }

    public EbayHomeworkRandomResult randomResult() throws InterruptedException {
        Random random = new Random();
        int randomIndex = random.nextInt(listResult.size());
        WebElement result = listResult.get(randomIndex);

        System.out.println(listResult.size());
        result.click();

        Thread.sleep(10000);

        return new EbayHomeworkRandomResult(driver);

    }
}
