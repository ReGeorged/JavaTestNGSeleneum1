package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //PageFactory - OR

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement logInField;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement logInButton;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement externalSignInButton;

    //initializing page objects
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //Actions
    public String validateWebPage(){
        return driver.getTitle();
    }

    public HomePage authentication (String un, String pwd){
        logInField.sendKeys(un);
        passwordField.sendKeys(pwd);
        logInButton.click();
        return new HomePage();
    }

}
