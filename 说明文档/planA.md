### 使用简单工厂模式，实现计算器功能
* 定义Operation运算类
```
/**
 * @description: Operation运算类
 * @author: ccarlos
 **/
public class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * @description: 获取运算结果
     * @author: ccarlos
     * @return: double
     **/
    public double getResult() {
        double result = 0;
        return result;
    }
}

```

* 分别创建加减乘除四个操作运算类
```
/**
 * @description: 加法类，继承运算类
 * @author: ccarlos
 */
public class OperationAdd extends Operation {

    /**
     * @description: 获取加法运算结果
     * @author: ccarlos
     * @return: double
     **/
    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }

}
```

* 简单运算工厂类
```aidl
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
```

* 单元测试，使用断言
```aidl
/**
 * @description: PlanA测试类
 * @author: ccarlos
 */
public class PlanATest {


    /**
     * @description: 测试加法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testAdd() {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setNumberA(10);
        operationAdd.setNumberB(20);
        double result = operationAdd.getResult();
        System.out.println("加法运算结果为：" + result);
        Assert.assertEquals(result, 30.0, -1);
    }

    /**
     * @description: 测试减法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testSub() {
        Operation operationSub = OperationFactory.createOperation("-");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("减法运算结果为：" + result);
        Assert.assertEquals(result, -10.0, -1);
    }

    /**
     * @description: 测试乘法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testMul() {
        Operation operationSub = OperationFactory.createOperation("*");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("乘法运算结果为：" + result);
        Assert.assertEquals(result, 200.0, -1);
    }

    /**
     * @description: 测试除法运算
     * @author: ccarlos
     * @return: void
     **/
    @Test
    public void testDiv() {
        Operation operationSub = OperationFactory.createOperation("/");
        operationSub.setNumberA(10);
        operationSub.setNumberB(20);
        double result = operationSub.getResult();
        System.out.println("除法运算结果为：" + result);
        Assert.assertEquals(result, 0.5, -1);
    }
}
```