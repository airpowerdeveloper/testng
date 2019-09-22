package org.testng.dependsongroups;

import org.testng.annotations.Test;

public class Demo2 {
    @Test(groups = {"Function"})
    public void test() {
        System.out.println("功能测试");
    }

    @Test(groups = {"API"})
    public void test2() {
        System.out.println("接口测试");
    }

    @Test(groups = {"api", "Function"})
    public void test3() {
        System.out.println("接口和功能测试");
    }

    @Test
    public void test4() {
        System.out.println("不属于任何组的测试");
    }
}
