package com.ccarlos.calculator.planA.factory;

/**
 * @description: 减法类，继承运算类
 * @author: ccarlos
 */
public class OperationSub extends Operation {


    /**
     * @description: 获取减法运算结果
     * @author: ccarlos
     * @return: double
     **/
    @Override
    public double getResult() {
        return super.getNumberA() - super.getNumberB();
    }
}