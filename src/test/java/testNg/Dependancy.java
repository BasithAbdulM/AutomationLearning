package testNg;

import org.testng.annotations.Test;

public class Dependancy {
    @Test
    public void sslc(){
        System.out.println("10th");
    }
    @Test (dependsOnMethods = "sslc")
    public void hsc(){
        System.out.println("12th");
    }
    @Test (dependsOnMethods = "hsc")
    public void college(){
        System.out.println("Engineering");
    }
}
