### 使用简单工厂模式、命令模式、策略模式实现计算器功能
#### 设计思路  
  
* 简单工厂模式：
  主要特点：在工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类。对于客户端来说，去除了与具体产品的依赖。 
  缺点：当增加一个其他运算时候，除了增加类，还必须修改在简单工厂类中的case语句，违背了修改的封闭性原则。 
  
* 策略与简单工厂模式结合： 
  CalculateContext类中属性含有运算类！同时在CalculateContext类内部实现简单工厂模式；这样子客户端只需要认识CalculateContext类即可！ 
  
* 思想：其他类中的成员属性含有基类，有了基类以后可以在构造方法内部实现工厂模式。最后在其他类调用基类的方法就可以将基类完全隐藏起来了。
  在客户端实例化的是CalculateContext的对象，调用的是类CalculateContext中的calculate()和undo()方法；这使得操作类的父类Calculator都不让客户端认识了。 
  
* 命令模式： 
  将行为封装成一个命令，然后将命令添加到调用者内，再由调用者发送给真正的处理者。即通过调用者调用处理者执行命令的方式
  在本案例的计算器实现中，计算器作为调用者，命令是四则运算操作，计算类作为真正处理者，这样就对于计算器与计算类进行了解耦。  
