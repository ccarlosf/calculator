package com.ccarlos.calculator.planB.calculator;


import com.ccarlos.calculator.planB.command.Command;
import com.ccarlos.calculator.planB.command.CommandSub;

/**
 * @description: 减法计算器类
 * @author: ccarlos
 */
public class CalculatorSub extends Calculator {
    private Command command = new CommandSub();

    public void calculate(double value) {
        command.execute(value);
    }

    public void undo() {
        System.out.println("撤销，此时结果：");
        command.undo();
    }
}
