package testNg;

import org.testng.annotations.*;

public class DataProvider {

    @Test(dataProvider = "testdata")
    public void testDataProvider(String userName,String password){
        System.out.println(userName);
        System.out.println(password);

    }

    @Test(dataProvider = "testdata")
    public void anothertestDataProvider(String userName,String password){
        System.out.println(userName);
        System.out.println(password);

    }


    @Test
    @Parameters({"username","password"})
    public void parametertestDataProvider(String userName,String password){
        System.out.println(userName);
        System.out.println(password);

    }

    @org.testng.annotations.DataProvider(name = "testdata")
    public Object[][] dataProvider(){
       String[][] data=new String[1][2];
       data[0][0]="admin";
       data[0][1]="admin123";
        return data;
    }
}
