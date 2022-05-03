package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.WomenPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    static LoginPage loginPage;
    static HomePage homePage;
    static WomenPage womenPage;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public static void setUp(){
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.authentication(prop.getProperty("username"), prop.getProperty("password"));
        womenPage = new WomenPage();

    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest(){

        Assert.assertEquals(homePage.verifyHomePageTitle(),"My account - My Store","error titles do not match");

    }
    @Test(priority = 2)
    public void verifyUserDisplayedTest(){
        Assert.assertTrue(homePage.verifyUserDisplayed());

    }
    @Test(priority = 3)
    public void clickOnWomenTest(){
        womenPage = homePage.clickOnWomen();
    }



    @AfterMethod
    public static void TearDown(){
        driver.quit();
    }
}
