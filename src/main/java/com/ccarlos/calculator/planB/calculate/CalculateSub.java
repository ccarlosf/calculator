package com.ccarlos.calculator.planB.calculate;

/**
 * @description: 减法计算操作类
 * @author: ccarlos
 */
public class CalculateSub extends Calculate {

    /**
     * 减法计算初始值
     */
    public double sum = 0;


    /**
     * @description: 减法计算
     * @author: ccarlos
     * @param: [value]
     * @return: void
     **/
    public void calculate(double value) {
        System.out.print("减法器计算:" + sum + "-(" + value + ")=");
        sum = sum - value;
        System.out.println("运算结果：" + sum);
    }
}
