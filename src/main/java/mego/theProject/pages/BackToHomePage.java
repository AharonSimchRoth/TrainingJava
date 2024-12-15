package mego.theProject.pages;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BackToHomePage {

    @FindBy(className = "logo-img")
    WebElement logo;

    private ChromeDriver driver;

    public BackToHomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void gotHome(String expectedUrl ){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logo));


        logo.click();
        String currentUrl = driver.getCurrentUrl();

        Boolean isPass = expectedUrl.equals(currentUrl);

        Assert.assertTrue("wrong Url", isPass);
    }



}
