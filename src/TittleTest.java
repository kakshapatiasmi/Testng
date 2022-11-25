import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TittleTest {
    WebDriver driver;
    final String browser ="chrome";
    @Test
    void titleTest(){
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com/");

        String title =driver.getTitle();
        Assert.assertEquals(title,"Google");
    }
    @Test
    void Test1(){
        System.setProperty("webdriver.gecko.driver","/Users/asmitakakshapati/Downloads/geckodriver");
        WebDriver driver=new org.openqa.selenium.firefox.FirefoxDriver();
        driver.get("https:www.google.com/");

        String title= driver.getTitle();
        Assert.assertEquals(title,"Google");
    }

}
