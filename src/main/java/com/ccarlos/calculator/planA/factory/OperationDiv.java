package com.ccarlos.calculator.planA.factory;

/**
 * @description: 除法类，继承运算类
 * @author: ccarlos
 */
public class OperationDiv extends Operation {

    /**
     * @description: 获取除法运算结果
     * @author: ccarlos
     * @return: double
     **/
    @Override
    public double getResult() {
        double result = 0;
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        if (numberB == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        result = numberA / numberB;
        return result;
    }
}