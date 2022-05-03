package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DressesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.WomenPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DressesPageTest extends TestBase {
    public DressesPageTest(){
        super();
    }


    static LoginPage loginPage;
    static HomePage homePage;
    static WomenPage womenPage;
    static DressesPage dressesPage;

    @BeforeMethod
    public static void setUp(){
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.authentication(prop.getProperty("username"), prop.getProperty("password"));
        womenPage = new WomenPage();
        dressesPage = new DressesPage();
        //dressesPage.clickDressPage();
        homePage.clickOnDresses();

    }


    @Test()

    public static void verifyDressesPage(){
        Assert.assertTrue(dressesPage.verifyDressesSpanBox());





    }



    @AfterMethod
    public static void TearDown(){
        driver.quit();
    }

}
