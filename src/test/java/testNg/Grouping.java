package testNg;

import org.testng.annotations.Test;

public class Grouping {
    @Test (groups = "Apple")
    public void apple(){
        System.out.println("iphone SE ");
    }
    @Test (groups = "Apple")
    public void ipad(){
        System.out.println("play music");
    }
    @Test (groups = "Lenovo")
    public void moto(){
        System.out.println("moto8");
    }
    @Test (groups = "Lenovo")
    public void motog(){
        System.out.println("motoG9");
    }
    @Test (groups = "MI")
    public void redmi(){
        System.out.println("note 8 pro" );
    }
    @Test (groups = "MI")
    public void xiomi(){
        System.out.println("mi10");
    }
    @Test (groups = "Samsung")
    public void samsung(){
        System.out.println("s20");
    }
    @Test (groups = "Samsung")
    public void samsungg(){
        System.out.println("S10");
    }

}
