package test.java.TestNG.groups;

import org.testng.annotations.Test;

@Test(groups = "teach")
public class GroupsOnClass3 {
    public void teach1() {
        System.out.println("GroupsOnClass3中的teach111运行");
    }

    public void teach2() {
        System.out.println("GroupsOnClass3中的teach222运行");
    }
}
