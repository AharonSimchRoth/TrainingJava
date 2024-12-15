package mego.page_google_dog_test.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class googleResultPage {

        private ChromeDriver driver;

        public googleResultPage(ChromeDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }

        public void getResulte(){
          List<WebElement> results = this.driver.findElements(By.className("LC20lb"));
            String FirstResulte = results.get(0).getText();
            System.out.println("first resulte is" + FirstResulte);
        }

    public void assertForFirstLink(String stringToFind){
        List<WebElement> results = this.driver.findElements(By.className("LC20lb"));
        String FirstLinkToFind = results.get(0).getText();
        Boolean isPass = FirstLinkToFind.contains(stringToFind);
        Assert.assertTrue(stringToFind+" " + "is not include in first link text" ,isPass);
    }






}
