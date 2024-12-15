package mego.theProject.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class FindingQuantityAndSubject {

  @FindBy(className = "header")
  WebElement theHeader;



    private ChromeDriver driver;



    public FindingQuantityAndSubject(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void checkQuantityAndSubject(String subject) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(theHeader, " "));

        String header_text = theHeader.getText();
        System.out.println(header_text);

        String numberOnly = header_text.replaceAll("[^\\d]", "");
        System.out.println(numberOnly);

        Integer theNumber = Integer.parseInt(numberOnly);
        System.out.println(theNumber);

        Assert.assertTrue("The number should be greater than 0", theNumber > 0);

        Boolean isPass = header_text.contains(subject);
        Assert.assertTrue(header_text+"does not contain"+ subject, isPass);
    }





}
