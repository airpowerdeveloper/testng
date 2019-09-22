package org.testng.dependsonmethods;

import org.testng.annotations.Test;

public class TestNGDependency {
    @Test(dependsOnMethods = {"testMethod2"})
    public void testMethod1(){
        System.out.println("testMethod1");
    }

    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3(){
        System.out.println("testMethod3");
    }

    @Test
    public void testMethod4(){
        System.out.println("testMethod4");
    }
}
