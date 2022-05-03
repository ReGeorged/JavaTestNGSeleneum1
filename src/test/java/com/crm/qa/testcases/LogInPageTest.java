package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LogInPageTest extends LoginPage {
    static LoginPage loginPage;
    static HomePage homePage;


    public LogInPageTest(){
        super();
    }

    @BeforeMethod
    public static void setUp(){
        initialization();
        loginPage = new LoginPage();

    }


    @Test
    public void loginPageTitleTest(){
        String title = loginPage.validateWebPage();
        Assert.assertEquals(title,"Login - My Store","error titles do not match");
    }

    @Test
    public void loginTest(){
        homePage = loginPage.authentication(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public static void tearDown(){
        driver.quit();
    }

}
