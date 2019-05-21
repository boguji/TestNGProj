package test.java.TestNG.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("server test1");
    }
    @Test(groups = "server")
    public void  test2(){
        System.out.println("server test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client test3");
    }
    @Test(groups = "client")
    public void  test4(){
        System.out.println("client test4");
    }
    @BeforeGroups("server")
    public  void beforeGroupsOnServer(){
        System.out.println("Before server test");
    }
    @AfterGroups("server")
    public void afterGroupsOnSerever(){
        System.out.println("After server test");
    }
    @BeforeGroups("client")
    public  void beforeGroupsOnClient(){
        System.out.println("Before Client test");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("After client test");
    }
}
