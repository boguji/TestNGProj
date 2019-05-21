package test.java.TestNG.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDatarovider(String name,int age){
        System.out.println("name=" + name + ";" + "age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",20},
                {"lisi",30},
                {"heheh",40}
        };
        return  o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name=" + name + "; age=" + age);
    }
    @Test(dataProvider = "methodData")
    public void  test2(String name,int age){
        System.out.println("test222方法 name=" + name + "; age=" + age);
    }
    @DataProvider(name = "methodData")
    public Object[][] MethodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"AAAAA",50},
                    {"bbbbb",60}
            };
        }else  if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"ccccc", 5},
                    {"ddddd",15}
            };
        }
        return  result;
    }

}
