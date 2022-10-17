package com.ccarlos.calculator.planB.calculate;

/**
 * @description: 除法计算操作类
 * @author: ccarlos
 */
public class CalculateDiv extends Calculate {

    /**
     * 除法计算初始值
     */
    public double sum = 1;

    /**
     * @description: 除法操作
     * @author: ccarlos
     * @param: [value] 操作数
     * @return: void
     **/
    public void calculate(double value) {
        System.out.print("除法器计算:" + sum + "/(" + value + ")=");
        if (value == 0)
            throw new IllegalArgumentException("0不能为除数");
        else
            sum = sum / value;
        System.out.println("运算结果：" + sum);

    }
}