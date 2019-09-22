package org.testng.groupsthree;

import org.testng.annotations.Test;

//使用groups进行分组测试,include和exclude的原则是保留最小集合
public class TestngGroups {
    @Test(groups = { "functest", "checkintest" })
    public void testMethod1() {
        System.err.println("groups = { functest, checkintest }");
    }

    @Test(groups = { "functest", "checkintest" })
    public void testMethod2() {
        System.err.println("groups = { functest, checkintest }");
    }

    @Test(groups = { "functest" })
    public void testMethod3() {
        System.err.println("groups = { functest }");
    }

    @Test(groups = { "checkintest" })
    public void testMethod4() {
        System.err.println("groups = { checkintest }");
    }
}
