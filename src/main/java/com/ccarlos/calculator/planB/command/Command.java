package com.ccarlos.calculator.planB.command;

/**
 * @description: 抽象命令类
 * @author: ccarlos
 */
public abstract class Command {
    /**
     * 在原先基础上再加上一个value值
     */
    public abstract void execute(double value);

    /**
     * 撤销
     */
    public abstract void undo();
}