package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
    WebDriver driver;
    long starttime;
    long endtime;
    long totaltime;
    @BeforeSuite
    public void lauchbrowser(){
        starttime=System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\IdeaProjects\\TestNGTutor\\src\\driversss\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void opengoogle(){
        driver.get("http://www.google.com");
    }
    @Test
    public void openbing() {
        driver.get("http://www.bing.com");
    }
    @Test
    public void openyahoo() {
        driver.get("http://www.yahoo.com");
    }
    @AfterSuite
    public void closebrowser(){
        driver.quit();
        endtime=System.currentTimeMillis();
        totaltime=endtime-starttime;
        System.out.println("TotaltimeTaken"+totaltime);
    }

}
