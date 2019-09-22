/**
 * 使用<define>标签将测试方法在组内再次进行分组并以name属性进行区分,
 * <run>通过define标签的name进行调用,以后修改测试直接修改run调用的名称即可
 */
package org.testng.groupsfour;

import org.testng.annotations.Test;

public class TestngGroupsOfGroups {
    @Test(groups = {"windows.xp"})
    public void testMethod5() {
        System.err.println("(groups = { windows.xp })");
    }

    @Test(groups = {"windows.7"})
    public void testMethod6() {
        System.err.println("(groups = { windows.7 })");
    }

    @Test(groups = {"windows.8"})
    public void testMethod7() {
        System.err.println("(groups = { windows.8 })");
    }
}
