package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HerokuApp {
    public static void main(String[] args) throws InterruptedException {
       String baseUrl = "http://the-internet.herokuapp.com/login";
       //Launch the chrome
        WebDriver driver = new ChromeDriver();
        //Open the url into browser
        driver.get(baseUrl);
        //Maximize the browser
        driver.manage().window().maximize();
        //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("page title is : " + title);
        //get current url
        String CurrentUrl = driver.getCurrentUrl();
        //Get page source
        String pageSource = driver.getPageSource();
        //Enter the email field
        driver.findElement(By.name("username")).sendKeys("Paul");
        //Enter the password field
        driver.findElement(By.name("password")).sendKeys("p1a00");
        //wait for 10 seconds
        Thread.sleep(10000);
        driver.quit();
    }
}
