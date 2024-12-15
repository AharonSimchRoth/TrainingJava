package mego.page_google_dog_test.test;

import mego.page_google_dog_test.pages.googleResultPage;
import mego.page_google_dog_test.pages.googleSearchPage;
import mego.pase_object_swagLabs.test.seleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class searchWithAssertExample {

    public static void main(String[] args) throws InterruptedException {
        mego.pase_object_swagLabs.test.seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.google.com/");

        googleSearchPage googleSearchPage = new googleSearchPage(driver);
        googleResultPage googleResultPage = new googleResultPage(driver);


        googleSearchPage.typeInToSearct("dog");
        googleResultPage.assertForFirstLink("dog");


        base.seleniumClose(driver);
    }


}
