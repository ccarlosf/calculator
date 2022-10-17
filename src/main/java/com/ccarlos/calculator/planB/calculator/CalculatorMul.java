package com.ccarlos.calculator.planB.calculator;

import com.ccarlos.calculator.planB.command.Command;
import com.ccarlos.calculator.planB.command.CommandMul;

/**
 * @description: 乘法计算器类
 * @author: ccarlos
 */

public class CalculatorMul extends Calculator {
    private Command command = new CommandMul();

    public void calculate(double value) {
        command.execute(value);
    }

    public void undo() {
        System.out.println("撤销，此时结果：");
        command.undo();
    }
}