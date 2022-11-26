import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstTestng {

    @Test
            void test(){
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        WebElement login= driver.findElement(By.id("text"));
        login.sendKeys("webdriver");

        //second for password
        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("webdriver123");

        //login click button
        WebElement submit= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();



    }
    @Test
    void test1(){
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        WebElement login=driver.findElement(By.id("text"));
        login.sendKeys("Driver");

        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("webdriver123");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();

    }

}
