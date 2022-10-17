package com.ccarlos.calculator.planB.calculator;

import com.ccarlos.calculator.planB.command.Command;
import com.ccarlos.calculator.planB.command.CommandAdd;

/**
 * @description: 加法计算器类
 * @author: ccarlos
 */

public class CalculatorAdd extends Calculator {

    /**
     * 命令模式，封装算法
     */
    private Command command = new CommandAdd();

    /**
     * @description: 加法计算
     * @author: ccarlos
     * @param: [value] 操作数
     * @return: void
     **/
    public void calculate(double value) {
        command.execute(value);
    }

    /**
     * @description: 撤销运算
     * @author: ccarlos
     * @return: void
     **/
    public void undo() {
        System.out.println("撤销，此时结果：");
        command.undo();

    }
}
