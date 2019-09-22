package org.testng.dependsongroups;

import org.testng.annotations.Test;

public class  Demo {
    @Test
    public void test() {
        System.out.println("test");
    }

    @Test(dependsOnGroups = "smoke")
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = {"smoke"})
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("test3");
    }
}
