package mego.theProject.tests;

import mego.pase_object_swagLabs.test.seleniumBase;
import mego.theProject.pages.TopicSearch;
import mego.theProject.pages.TopicSearchResulte;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TopicSearchTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www2.kolhalashon.com/#/");

        TopicSearch HanukkahTopicSearch = new TopicSearch(driver);
        TopicSearchResulte HanukkahTopicSearchResulte = new TopicSearchResulte(driver);


        HanukkahTopicSearch.InputInToSearct("Hanukkah");
        HanukkahTopicSearchResulte.getResultes(19);



        base.seleniumClose(driver);



    }
}
