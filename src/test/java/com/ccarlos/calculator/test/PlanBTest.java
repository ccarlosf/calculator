package com.ccarlos.calculator.test;

import com.ccarlos.calculator.planB.strategy.CalculateContext;
import org.junit.Test;

/**
 * @description: PlanB测试类
 * @author: ccarlos
 */
public class PlanBTest {

    @Test
    public void testAdd() {
        CalculateContext cc = new CalculateContext("+");
        cc.calculate(2);
        cc.calculate(2);
        cc.undo();
        cc.undo();
    }

    @Test
    public void testSub() {
        CalculateContext cc = new CalculateContext("-");
        cc.calculate(2);
        cc.calculate(2);
        cc.undo();
    }

    @Test
    public void testMul() {
        CalculateContext cc = new CalculateContext("*");
        cc.calculate(2);
        cc.calculate(2);
        cc.undo();
    }

    @Test
    public void testDiv() {
        CalculateContext cc = new CalculateContext("/");
        cc.calculate(2);
        cc.calculate(1);
        cc.undo();
    }
}