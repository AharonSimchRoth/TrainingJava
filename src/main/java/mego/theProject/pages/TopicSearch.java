package mego.theProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class TopicSearch {

    private ChromeDriver driver;

    @FindBy(className = "form-control")
    WebElement search;

    @FindBy(className = "all-search-results")
    WebElement AllResults;



    public TopicSearch(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void InputInToSearct(String userInput) throws InterruptedException {
        search.click();
        search.sendKeys(userInput);
        AllResults.click();

    }

}
