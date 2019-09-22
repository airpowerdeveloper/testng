package org.testng.exceptions;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    /**
     * 什么时候会用到异常测试？
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我们的预期结果就是这个异常
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void arithmeticException() {
        int i = 1 / 0;
        //System.out.println("After division the value of i is :" + i);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void arithmeticException1() {
        int i = 0 / 1;
        //System.out.println("After division the value of i is :" + i);
    }
}
