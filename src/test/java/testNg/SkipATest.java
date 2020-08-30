package testNg;

import org.testng.annotations.Test;

public class SkipATest {

    @Test
    public void startthecar() {
        System.out.println("START");
    }

    @Test
    public void ChangeGear() {
        System.out.println("changegear");
    }

    @Test(priority = 1)
    public void firstgear() {
        System.out.println("1st");
    }

    @Test(priority = 2)
    public void secondgear() {
        System.out.println("2nd");
    }

    @Test(priority = 3)
    public void thirdgear() {
        System.out.println("3rd");
    }

    @Test(priority = 4)
    public void fourthgear() {
        System.out.println("4th");

    }
    @Test(priority = 5,enabled = true)
    public void putreverse(){
        System.out.println("reverse");
    }
}
