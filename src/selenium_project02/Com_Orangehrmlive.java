package selenium_project02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_Orangehrmlive {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the Url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is:" + title );
        //Get current Url
        String currentUrl = driver.getCurrentUrl();
        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("page source : " + pageSource);
        //Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Aarav");
        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Aarav2511");
        Thread.sleep(1000);
        driver.quit();

    }


}
