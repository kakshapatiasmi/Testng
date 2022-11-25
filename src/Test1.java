import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver;
    final String browser="chrome";
    @Test
    void Test(){
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/asmitakakshapati/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/asmitakakshapati/Downloads/geckodriver");
            WebDriver driver=new org.openqa.selenium.firefox.FirefoxDriver();

        }
    }
}
