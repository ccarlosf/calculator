package com.ccarlos.calculator.planB.command;


import com.ccarlos.calculator.planB.calculate.CalculateAdd;

/**
 * @description: 加法计算命令类，命令模式，封装算法的具体实现
 * @author: ccarlos
 */
public class CommandAdd extends Command {
    private CalculateAdd add = new CalculateAdd();
    private double value = 0;

    public void execute(double value) {
        this.value = value;
        add.calculate(value);
    }

    public void undo() {
        add.calculate(-value);
    }
}