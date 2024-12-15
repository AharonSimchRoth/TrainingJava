package mego.theProject.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class findNameAndTopic {
    private ChromeDriver driver;

    @FindBy(xpath = "//a[@href='#/regularSite/ravs/2361']")
    WebElement name;


    public findNameAndTopic(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void findDetails(String holiday) {
        String Name = name.getText();
        System.out.println(Name);

        // List<WebElement> shiurim = this.driver.findElements(By.className("mat-tooltip-trigger"));

        List<WebElement> TextOfTheLessons = driver.findElements(By.cssSelector(".mat-tooltip-trigger.shiurim-title"));

        String firstElementText = TextOfTheLessons.get(0).getText();

        System.out.println("First Element Text: " + firstElementText);

        String[] words = firstElementText.split("\\s+");

        System.out.println("Words in Text: " + Arrays.toString(words));
        System.out.println("Holiday: " + holiday);

        boolean isFound = Arrays.stream(words).anyMatch(word -> word.equalsIgnoreCase(holiday.trim()));

        Assert.assertTrue("The word '" + holiday + "' was not found in the first element.", isFound);
    }


}
