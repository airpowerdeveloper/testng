package org.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    //演示两个参数
    @Test(dataProvider = "twoParam")
    public void dataProviderTest(String name, int age) {
        System.out.println("name = " + name + ";age = " + age);
    }

    @DataProvider(name = "twoParam")
    public Object[][] provideData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 11},
                {"wangwu", 12},
                {"zhaoliu", 13}
        };
        return o;
    }

    //演示一个参数
    @Test(dataProvider = "OneParam")
    public void onlyOneDataProvider(int money) {
        System.out.println("my Money is:" + money + "万");
    }

    @DataProvider(name = "OneParam")
    public Object[] oneProvideData() {
        Object[] o = new Object[]{
                100, 200, 1000, 2000
        };
        return o;
    }

    //演示多个参数
    @Test(dataProvider = "manyParam")
    public void manyDataProvider(String name, int age, String nation, int height) {
        System.out.println("name:" + name + ",age:" + age + ",nation:" + nation + ",height:" + height);
    }

    @DataProvider(name = "manyParam")
    public Object[][] manyProvideData() {
        Object[][] o = new Object[][]{
                {"A", 20, "中国", 180},
                {"B", 21, "USA", 150},
                {"C", 22, "AUS", 160},
                {"D", 23, "CAN", 170}
        };
        return o;
    }

    //演示根据不同方法传不同的参数
    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1方法: name=" + name + ",age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2方法: name=" + name + ",age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] provideMethodData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"ZhangSan", 30},
                    {"LiSi", 31}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"WangWu", 40},
                    {"ZhaoLiu", 41}
            };
        }
        return result;
    }
}
