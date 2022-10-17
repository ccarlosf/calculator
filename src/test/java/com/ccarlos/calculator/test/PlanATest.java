package com.ccarlos.calculator.test;

import com.ccarlos.calculator.planA.factory.Operation;
import com.ccarlos.calculator.planA.factory.OperationFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: PlanA测试类
 * @author: ccarlos
 */
public class PlanATest {


    /**
     * @description: 测试加法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testAdd() {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setNumberA(10);
        operationAdd.setNumberB(20);
        double result = operationAdd.getResult();
        System.out.println("加法运算结果为：" + result);
        Assert.assertEquals(result, 30.0, -1);
    }

    /**
     * @description: 测试减法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testSub() {
        Operation operationSub = OperationFactory.createOperation("-");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("减法运算结果为：" + result);
        Assert.assertEquals(result, -10.0, -1);
    }

    /**
     * @description: 测试乘法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testMul() {
        Operation operationSub = OperationFactory.createOperation("*");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("乘法运算结果为：" + result);
        Assert.assertEquals(result, 200.0, -1);
    }

    /**
     * @description: 测试除法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testDiv() {
        Operation operationSub = OperationFactory.createOperation("/");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("除法运算结果为：" + result);
        Assert.assertEquals(result, 0.5, -1);
    }
}