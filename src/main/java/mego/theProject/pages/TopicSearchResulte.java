package mego.theProject.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopicSearchResulte {

    private  String HanukhahLocator;
    private ChromeDriver driver;

    public TopicSearchResulte(ChromeDriver driver){
        this.driver = driver;
        this.HanukhahLocator = "shiurim-text-container";
        PageFactory.initElements(driver, this);

    }

    public void getResultes(int Number){
        List<WebElement> HanukkahResults = this.driver.findElements(By.className(this.HanukhahLocator));
        Assert.assertEquals(Number+"does not equale"+HanukkahResults,Number, HanukkahResults.size());

    }



}
