package com.ccarlos.calculator.planB.command;


import com.ccarlos.calculator.planB.calculate.CalculateMul;

/**
 * @description: 乘法计算命令类
 * @author: ccarlos
 */
public class CommandMul extends Command {
    private CalculateMul mul = new CalculateMul();
    private double value = 0;

    public void execute(double value) {
        this.value = value;
        mul.calculate(value);
    }

    public void undo() {
        mul.calculate(1 / value);
    }
}
