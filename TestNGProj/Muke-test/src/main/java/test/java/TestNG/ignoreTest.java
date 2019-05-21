package test.java.TestNG;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void Ignore1(){
        System.out.println("Ignore1 run!");
    }
    @Test(enabled = false)
    public void  Ignore2(){
        System.out.println("Ignore2 run!");
    }
    @Test(enabled = true)
    public  void Ignore3(){
        System.out.println("Ignore3 run!");
    }
}
