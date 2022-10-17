package com.ccarlos.calculator.planA.factory;

/**
 * @description: 简单工厂运算工厂类
 * @author: ccarlos
 */
public class OperationFactory {


    /**
     * @description: 创建运算类
     * @author: ccarlos
     * @param: [operate] 运算操作符
     * @return: com.ccarlos.calculator.factory.Operation 运算类
     **/
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}