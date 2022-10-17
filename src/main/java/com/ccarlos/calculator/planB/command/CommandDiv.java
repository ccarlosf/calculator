package com.ccarlos.calculator.planB.command;


import com.ccarlos.calculator.planB.calculate.CalculateDiv;

/**
 * @description: 减法计算命令类
 * @author: ccarlos
 */
public class CommandDiv extends Command {
    private CalculateDiv div = new CalculateDiv();
    private double value = 0;

    public void execute(double value) {
        this.value = value;
        div.calculate(value);
    }

    public void undo() {
        div.calculate(1 / value);

    }
}