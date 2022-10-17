package com.ccarlos.calculator.planA.factory;

/**
 * @description: 乘法类，继承运算类
 * @author: ccarlos
 */
public class OperationMul extends Operation {

    /**
     * @description: 获取乘法运算结果
     * @author: ccarlos
     * @return: double
     **/
    @Override
    public double getResult() {
        return super.getNumberA() * super.getNumberB();
    }
}