package mego.page_google_dog_test.pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;


public class googleSearchPage {

    private ChromeDriver driver;

    @FindBy(name = "q")
    WebElement serch;



    public googleSearchPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void typeInToSearct(String userInput) throws InterruptedException {
        serch.click();
        serch.sendKeys(userInput);

        serch.sendKeys(Keys.ENTER);
    }

}
