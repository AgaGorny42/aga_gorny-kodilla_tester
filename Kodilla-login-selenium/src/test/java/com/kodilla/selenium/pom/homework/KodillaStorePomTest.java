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

import java.util.Arrays;
import java.util.List;

public class KodillaStorePomTest {

    KodillaStorePom searchOption;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchOption = new KodillaStorePom(driver);
    }
    @Test
    public void testStorePage_enterNotebook() {
        String input = "Notebook";
        searchOption.fillInSearchField(input);

        List<WebElement> result = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'NoteBook')]"));
        for(WebElement results : result) {
            System.out.println(results.getText());
        }
        int sizeList = result.size();
        String firstH3Result = driver.findElement(By.xpath("//*[@class='header']/*[('NoteBook 4 Everyone')]")).getText();
        String secondH3Result = driver.findElement(By.xpath("//div[@class='header']/h3[text()='NoteBook Plus']")).getText();
        List<String> displayedResults = Arrays.asList("NoteBook 4 Everyone", "NoteBook Plus");
        String firstExpectedResult = "NoteBook 4 Everyone";
        String secondExpectedResult = "NoteBook Plus";

        Assertions.assertEquals(2, sizeList);
        Assertions.assertTrue(displayedResults.contains(firstH3Result));
        Assertions.assertTrue(displayedResults.contains(secondH3Result));
        Assertions.assertEquals(firstExpectedResult, firstH3Result);
        Assertions.assertEquals(secondExpectedResult, secondH3Result);
    }
    @Test
    public void testStorePage_enterSchool() {
        String input = "School";
        searchOption.fillInSearchField(input);

        String result = driver.findElement(By.xpath("//div[@class='header']/h3[contains(text(), 'School Laptop')]")).getText();
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'School Laptop')]"));
        List<String> displayedResult = List.of("School Laptop");
        int listSize = webElementList.size();

        Assertions.assertTrue(displayedResult.contains(result));
        Assertions.assertEquals(1, listSize);
    }
    @Test
    public void testStorePage_enterBrand() {
        String input = "Brand";
        searchOption.fillInSearchField(input);

        String result = driver.findElement(By.xpath("//div[@class='header']/h3[contains(text(), 'Brand New Model')]")).getText();
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'Brand New Model')]"));
        List<String> displayedResult = List.of("Brand New Model");
        int listSize = webElementList.size();

        Assertions.assertTrue(displayedResult.contains(result));
        Assertions.assertEquals(1, listSize);
    }
    @Test
    public void testStorePage_enterBusiness() {
        String input = "Bussines";
        searchOption.fillInSearchField(input);

        String result = driver.findElement(By.xpath("//div[@class='header']/h3[contains(text(), 'Bussines Laptop')]")).getText();
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'Bussines Laptop')]"));
        List<String> displayedResult = List.of("Bussines Laptop");
        int listSize = webElementList.size();

        Assertions.assertTrue(displayedResult.contains(result));
        Assertions.assertEquals(1, listSize);
    }
    @Test
    public void testStorePage_enterGaming() {
        String input = "Gaming";
        searchOption.fillInSearchField(input);

        String result = driver.findElement(By.xpath("//div[@class='header']/h3[contains(text(), 'Gaming Laptop')]")).getText();
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'Gaming Laptop')]"));
        List<String> displayedResult = List.of("Gaming Laptop");
        int listSize = webElementList.size();

        Assertions.assertTrue(displayedResult.contains(result));
        Assertions.assertEquals(1, listSize);
    }
    @Test
    public void testStorePage_enterPowerful() {
        String input = "Powerful";
        searchOption.fillInSearchField(input);

        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'Powerful')]"));
        int listSize = webElementList.size();

        Assertions.assertEquals(0, listSize);
    }
    @Test
    public void testStorePage_capitalAndLowercaseLetter() {
        String lowerCase = "notebook";
        searchOption.fillInSearchField(lowerCase);

        List<WebElement> result = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'NoteBook')]"));
        int listSize = result.size();
        Assertions.assertEquals(2, listSize);
    }
    @Test
    public void capitaLetterTest() {
        String capitalLetter = "NOTEbook";
        searchOption.fillInSearchField(capitalLetter);

        List<WebElement> result = driver.findElements(By.xpath("//div[@class='header']/h3[contains(text(), 'NoteBook')]"));
        int listSize = result.size();
        Assertions.assertEquals(2, listSize);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}
