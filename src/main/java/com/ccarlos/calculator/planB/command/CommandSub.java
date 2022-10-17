package com.ccarlos.calculator.planB.command;


import com.ccarlos.calculator.planB.calculate.CalculateSub;

/**
 * @description: 减法计算命令类
 * @author: ccarlos
 */
public class CommandSub extends Command {
    private CalculateSub sub = new CalculateSub();
    private double value = 0;

    public void execute(double value) {
        this.value = value;
        sub.calculate(value);
    }

    public void undo() {
        sub.calculate(-value);
    }
}
