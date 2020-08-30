package testNg;


import org.testng.annotations.Test;

public class Priority {


    @Test (priority = 0)
    public void startthecar(){
        System.out.println("START");
    }
    @Test (priority = 1)
    public void firstgear(){
        System.out.println("1st");
    }
    @Test (priority = 2)
    public void secondgear(){
        System.out.println("2nd");
    }
    @Test (priority = 3)
    public void thirdgear(){
        System.out.println("3rd");
    }
    @Test (priority = 4)
    public void fourthgear(){
        System.out.println("4th");
    }

}