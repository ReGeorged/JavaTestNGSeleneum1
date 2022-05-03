package com.crm.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    //public static WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMillis(5000L));

    public TestBase(){

        try { prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/com/crm/qa/config/config.properties");
            prop.load(ip);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void initialization (){
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else System.out.println("chrome driver not found ! ");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    }






}
