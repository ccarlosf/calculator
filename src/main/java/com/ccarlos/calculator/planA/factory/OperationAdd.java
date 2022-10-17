package com.ccarlos.calculator.planA.factory;

/**
 * @description: 加法类，继承运算类
 * @author: ccarlos
 */
public class OperationAdd extends Operation {

    /**
     * @description: 获取加法运算结果
     * @author: ccarlos
     * @return: double
     **/
    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }

}