package com.ccarlos.calculator.planB.calculator;


/**
 * @description: 抽象计算器类
 * @author: ccarlos
 */

public abstract class Calculator {

    /**
     * @description: 执行计算
     * @author: ccarlos
     * @param: [value] 操作数
     * @return: void
     **/
    public abstract void calculate(double value);

    /**
     * @description: 撤销计算
     * @author: ccarlos
     * @date: 2022/10/17 16:56
     * @return: void
     **/
    public abstract void undo();
}
