package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends TestBase {
    public DressesPage(){
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressPageButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/span")
    WebElement dressesSpanBox;





    public boolean verifyDressesSpanBox(){
       return dressesSpanBox.isDisplayed();
    }

    public void clickDressPage(){
        dressPageButton.click();
    }



}
