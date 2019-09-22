package org.testng.dependsongroups;

import org.testng.annotations.Test;

public class Demo3 {
    @Test(groups = {"API"})
    public void test1() {
        System.out.println("API");
    }

    @Test(groups = {"API"})
    public void test2() {
        System.out.println("API");
    }

    @Test(groups = {"Function"})
    public void test3() {
        System.out.println("Function");
    }

    @Test(groups = {"Not"})
    public void test4() {
        System.out.println("Not in API");
    }
}
