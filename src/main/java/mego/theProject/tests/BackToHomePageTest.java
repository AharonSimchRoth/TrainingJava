package mego.theProject.tests;

import mego.pase_object_swagLabs.test.seleniumBase;
import mego.theProject.pages.BackToHomePage;
import mego.theProject.pages.TopicSearch;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class BackToHomePageTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www2.kolhalashon.com/#/");

        TopicSearch HanukkahTopicSearch = new TopicSearch(driver);
        BackToHomePage BackToHomePage = new BackToHomePage(driver);


        HanukkahTopicSearch.InputInToSearct("Hanukkah");
        BackToHomePage.gotHome("https://www2.kolhalashon.com/#/regularSite/home");





        base.seleniumClose(driver);



    }
}
