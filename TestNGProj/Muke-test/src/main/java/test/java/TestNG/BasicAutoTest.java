package TestNG;


import org.testng.annotations.*;

public class BasicAutoTest {
 @Test
 public void testCase1(){
  System.out.println("testCase1");
 }

 @Test
 public  void testCase2(){
  System.out.println("testCase2");
 }


 @BeforeMethod
 public void beforeMethod(){
  System.out.println("BeforeMethod运行在每个测试方法之前");

 }
 @AfterMethod
 public void afterMethod(){
  System.out.println("AfterMethod运行在每个测试方法之后");

 }
 @BeforeClass
 public void beforeClass(){
  System.out.println("BeforeClass运行在所有测试方法之前");
 }

 @AfterClass
 public  void afterClass(){
  System.out.println("AfterClass运行在所有测试方法之后");
 }

 @BeforeSuite
 public  void  beforeSuite(){
  System.out.println("BeforeSuite测试套件，运行在所有测试类之前");
 }

 @AfterSuite
 public  void afterSuite(){
  System.out.println("AfterSuite测试套件，运行在所有测试类之后");
 }

}
