package mego.pase_object_swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productsPage {


    private ChromeDriver driver;

    @FindBy(className = "inventory_item_price")
    WebElement price;

    @FindBy(className = "product_sort_container")
    WebElement sort;



    public productsPage(ChromeDriver driver){
        this.driver = this.driver;
        PageFactory.initElements(this.driver, this);
    }
    public void getFirstPrice(){
        String price_as_text = price.getText();

    }

    public void setDropDown(int index){
        Select select = new Select(sort);
        select.selectByIndex(index);


    }




}
