package com.ccarlos.calculator.planB.calculate;

/**
 * @description: 乘法计算操作类
 * @author: ccarlos
 */
public class CalculateMul extends Calculate {

    /**
     * 乘法计算初始值
     */
    public double sum = 1;

    /**
     * @description: 乘法计算
     * @author: ccarlos
     * @param: [value] 操作数
     * @return: void
     **/
    public void calculate(double value) {
        System.out.print("乘法器计算:" + sum + "*(" + value + ")=");
        sum = sum * value;
        System.out.println("运算结果：" + sum);
    }
}
