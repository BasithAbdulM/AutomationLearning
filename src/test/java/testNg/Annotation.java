package testNg;

import org.testng.annotations.*;

public class Annotation {
    @Test
    public void test(){
        System.out.println("I am TEST");
    }
    @BeforeMethod
    public void before(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void after(){
        System.out.println("After Method");
    }
    @BeforeClass
    public void beforeclass() {
        System.out.println("Before Class");

    }
    @AfterClass
    public void afterclass() {
        System.out.println("After Class");
    }
    @BeforeTest
    public void beforetest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("After Test");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("After Suite");
    }
}
