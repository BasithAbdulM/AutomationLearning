package testNg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ExtentReport {

    WebDriver driver;
    ExtentReports extentReport;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;


    
    @Test
    public void opengoogle() throws IOException {
        driver.get("http://www.google.com");
        extentTest=extentReport.createTest("verify google");
        extentTest.log(Status.INFO,"Navigating to Google");
        String title=driver.getTitle();
        if(title.equals("Google")){
            extentTest.log(Status.INFO,"Actual title :"+title);
            extentTest.log(Status.INFO,"Expected title :"+ "Google");
//            System.out.println("Passed");
            extentTest.log(Status.PASS,"Actual and expected are equal");
        }else {
//            System.out.println("Failed");
            extentTest.log(Status.FAIL,"Actual and expected are not equal");
            TakesScreenshot screenshot=(TakesScreenshot)driver;
            File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File("google.png");
            FileHandler.copy(sourcefile,destination);
            extentTest.addScreenCaptureFromPath("google.png");

        }
    }
    @Test
    public void openbing() throws IOException {
        driver.get("http://www.bing.com");
        extentTest=extentReport.createTest("verify bing");
        extentTest.log(Status.INFO,"Navigating to bing");
        String title=driver.getTitle();
        if(title.equals("Bing")){
            extentTest.log(Status.INFO,"Actual title :"+title);
            extentTest.log(Status.INFO,"Expected title :"+ "Bing");
//            System.out.println("Passed");
            extentTest.log(Status.PASS,"Actual and expected are equal");
        }else {
//            System.out.println("Failed");
            extentTest.log(Status.FAIL,"Actual and expected are not equal");
            TakesScreenshot screenshot=(TakesScreenshot)driver;
            File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File("bing.png");
            FileHandler.copy(sourcefile,destination);
            extentTest.addScreenCaptureFromPath("bing.png");

        }
    }
    @Test
    public void openyahoo() throws IOException {
        driver.get("http://www.yahoo.com");
        extentTest=extentReport.createTest("verify yahoo");
        extentTest.log(Status.INFO,"Navigating to yahoo");
        String title=driver.getTitle();
        if(title.equals("yahoo")){
            extentTest.log(Status.INFO,"Actual title :"+title);
            extentTest.log(Status.INFO,"Expected title :"+ "Yahoo");
//            System.out.println("Passed");
            extentTest.log(Status.PASS,"Actual and expected are equal");
        }else {
//            System.out.println("Failed");
            extentTest.log(Status.FAIL,"Actual and expected are not equal");
            TakesScreenshot screenshot=(TakesScreenshot)driver;
            File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File("yahoo.png");
            FileHandler.copy(sourcefile,destination);
            extentTest.addScreenCaptureFromPath("yahoo.png");

        }
    }
    @BeforeSuite
    public void openlauncher(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\IdeaProjects\\TestNGTutor\\src\\driversss\\chromedriver.exe");
        extentReport=new ExtentReports();
        extentHtmlReporter=new ExtentHtmlReporter("Extent.html");
        extentReport.attachReporter(extentHtmlReporter);




        driver=new ChromeDriver();
    }
    @AfterSuite
    public void closebrowser(){

        driver.quit();
        extentReport.flush();
    }

}

