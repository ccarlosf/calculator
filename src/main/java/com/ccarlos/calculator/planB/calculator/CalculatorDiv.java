package com.ccarlos.calculator.planB.calculator;


import com.ccarlos.calculator.planB.command.Command;
import com.ccarlos.calculator.planB.command.CommandDiv;

/**
 * @description: 减法计算器类
 * @author: ccarlos
 */
public class CalculatorDiv extends Calculator {

    /**
     * 命令模式，封装算法
     */
    private Command command = new CommandDiv();

    /**
     * @description: 执行运算
     * @author: ccarlos
     * @date: 2022/10/17 16:58
     * @param: [value] 操作数
     * @return: void
     **/
    public void calculate(double value) {
        command.execute(value);
    }

    /**
     * @description: 撤销命令
     * @author: ccarlos
     * @date: 2022/10/17 16:59
     * @return: void
     **/
    public void undo() {
        System.out.println("撤销，此时结果：");
        command.undo();
    }
}