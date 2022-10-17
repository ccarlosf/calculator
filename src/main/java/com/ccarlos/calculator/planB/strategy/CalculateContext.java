package com.ccarlos.calculator.planB.strategy;


import com.ccarlos.calculator.planB.calculator.*;
import com.ccarlos.calculator.planB.command.*;

/**
 * @description: 策略模式下的CalculateContext类
 * @author: ccarlos
 */
public class CalculateContext {
    private Calculator calculator = null;//策略模式
    private Command command = null;
    double value;

    /**
     * @description: 工厂模式实现
     * @author: ccarlos
     * @date: 2022/10/17 17:31
     * @param: [op]
     **/
    public CalculateContext(String op) {
        switch (op) {
            case "+":
                calculator = new CalculatorAdd();
                command = new CommandAdd();
                break;
            case "-":
                calculator = new CalculatorSub();
                command = new CommandSub();
                break;
            case "*":
                calculator = new CalculatorMul();
                command = new CommandMul();
                break;
            case "/":
                calculator = new CalculatorDiv();
                command = new CommandDiv();
                break;
        }
    }

    public void calculate(double value) {
        this.value = value;
        this.calculator.calculate(value);
    }

    public void undo() {
        this.calculator.undo();
    }
}
