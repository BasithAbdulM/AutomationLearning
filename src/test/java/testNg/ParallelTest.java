package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
    @Test
    public void opengoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\IdeaProjects\\TestNGTutor\\src\\driversss\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
    }
    @Test
    public void openbing(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\IdeaProjects\\TestNGTutor\\src\\driversss\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.bing.com");
        driver.quit();
    }
}
