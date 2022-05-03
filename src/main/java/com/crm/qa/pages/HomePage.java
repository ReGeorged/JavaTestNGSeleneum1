package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements( driver, this);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    WebElement myUserNameLoggedIn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenButton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressesButton;


    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyUserDisplayed(){
        return myUserNameLoggedIn.isDisplayed();
    }

    public WomenPage clickOnWomen(){
        womenButton.click();
        return new WomenPage();
    }

    public DressesPage clickOnDresses(){
        dressesButton.click();
        return new DressesPage();

    }


}
