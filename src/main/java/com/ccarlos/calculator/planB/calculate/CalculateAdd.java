package com.ccarlos.calculator.planB.calculate;

/**
 * @description: 加法计算类
 * @author: ccarlos
 */
public class CalculateAdd extends Calculate {

    /**
     * 加法计算初始值
     */
    public double sum = 0;


    /**
     * @description: 加法计算
     * @author: ccarlos
     * @param: [value] 操作数
     * @return: void
     **/
    public void calculate(double value) {
        System.out.print("加法器计算:" + sum + "+(" + value + ")=");
        sum = sum + value;
        System.out.println("运算结果：" + sum);
    }
}