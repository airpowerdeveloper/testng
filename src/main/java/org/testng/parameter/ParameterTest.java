package org.testng.parameter;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterTest {
    @Test
    @Parameters({"name", "age"})
    public void paramTest(String name, int age) {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
