package test.java.TestNG.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
       System.out.println("beforeSuite");
   }
   @AfterSuite
   public  void  afterSuite(){
       System.out.println("afterSuite");
   }
   @BeforeTest
   public  void  Beforetest(){
        System.out.println("beforetest");

   }
   @AfterTest
   public void Aftertest(){
        System.out.println("aftertest");
   }
}
