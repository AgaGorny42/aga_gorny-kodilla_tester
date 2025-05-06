package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom extends AbstractPom {

    @FindBy(css = "input[class='form-control']")
    WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void fillInSearchField (String input) {
        searchField.sendKeys(input);

    }
}
