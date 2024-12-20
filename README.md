# design-patterns

致力于全网最说人话的设计模式讲解，使用最浅显的示例呈现设计模式的精髓，力争让每一位程序员都看得懂，入得门...

## 如何使用此源码

无任何三方依赖，可直接运行。运行后按照提示输入对应的设计模式名称，则会得到运行结果

```
请输入列表中任意设计模式名称，列表：[COMMAND, CHAIN_OF_RESPONSIBILITY, BUILDER, ABSTRACT_FACTORY, FACTORY_METHOD, SIMPLE_FACTORY]
输入exit后按回车健可退出程序
BUILDER
assembled personal computer:Computer{cpu='I5处理器', ram='三星125', usbCount=2, keyboard='苹果键盘', display='苹果显示器'}
mac computer:Computer{cpu='I5处理器', ram='三星125', usbCount=2, keyboard='苹果键盘', display='苹果显示器'}
lenovo computer:Computer{cpu='I7处理器', ram='海力士222', usbCount=4, keyboard='联想键盘', display='联想显示器'}
DD
输入错误，请重试。或者输入exit回车退出程序
exit

Process finished with exit code 0
```


# 概述
在IT这个行业，技术日新月异，可能你今年刚弄懂一个编程框架，明年它就不流行了。 然而即使在易变的IT世界也有很多几乎不变的知识，他们晦涩而重要，默默的将程序员划分为卓越与平庸两类。例如基础算法，设计模式等等。

首先，前辈们经过多年的摸索总结出了软件设计的六大原则，其可谓是面向对象设计之魂，其是设计模式的理论基础，所以强烈推荐在进入设计模式的世界之前，先读读这篇文章：

[面向对象设计之魂(六大原则)](https://blog.shusheng007.top/archives/solid)


# 定义

英文：
>In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations. Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

汉语：
>在软件工程领域，设计模式是一套通用的可复用的解决方案，用来解决在软件设计过程中产生的通用问题。它不是一个可以直接转换成源代码的设计，只是一套在软件系统设计过程中程序员应该遵循的最佳实践准则。

从定义可以看出，设计模式是一套语言无关的最佳设计实践准则，而不是什么真理定理，所以不可盲从。本文先期主要讲述GOF的面向对象的23种设计模式，由于本人惯用Java编程语言，所以代码示例均为Java实现。


# 分类


设计模式按照其要解决的问题被分为3类：

## 创建型（creational）

顾名思义，主要解决如何灵活创建对象或者类的问题，共**5**个。
1. 工厂方法模式（Factory Method）

[秒懂设计模式之工厂方法模式（Factory Method Pattern）]( https://blog.shusheng007.top/archives/factory-method-pattern)

2.  抽象工厂模式（Abstract Factory）

[秒懂设计模式之抽象工厂模式（Abstract Factory Pattern）]( https://blog.shusheng007.top/archives/abstract-factory-pattern)


3. 构建者模式（Builder）

[秒懂设计模式之建造者模式（Builder pattern）](https://blog.shusheng007.top/archives/builder-pattern)

4. 单例模式（Singleton）

[秒懂设计模式之单例模式（Singleton Pattern）]( https://blog.shusheng007.top/archives/singleton-pattern)

5.  原型模式（Prototype）

[秒懂设计模式之原型模式（Prototype Pattern)](https://blog.shusheng007.top/archives/prototype-pattern)


另外还有一个简单工厂模式，其虽然不在GOF23种设计模式之中，但是应用也很广泛：

[秒懂设计模式之简单工厂模式（Simple Factory Pattern）](https://blog.shusheng007.top/archives/simple-factory-pattern)



## 结构型（structural）

结构型设计模式主要用于将类或对象进行组合从而构建灵活而高效的结构，共**7**个。

1. 适配器模式（Adapter）

[秒懂设计模式之适配器模式（Adapter Pattern）](https://blog.shusheng007.top/archives/adapter-pattern)

2. 桥接模式（Bridge）

[秒懂设计模式之桥接模式（Bridge Pattern）](https://blog.shusheng007.top/archives/bridge-pattern)

3. 组合模式（Composite）

[秒懂设计模式之组合模式（Composite Pattern）](https://blog.shusheng007.top/archives/composite-pattern)

4. 装饰者模式（Decorator）

[秒懂设计模式之装饰者模式（Decorator Pattern）](https://blog.shusheng007.top/archives/decorator-pattern)

5. 外观模式（Facade）

[秒懂设计模式之外观模式（Facade Pattern）](https://blog.shusheng007.top/archives/facade-pattern)

6. 享元模式（Flyweight）

[秒懂设计模式之享元模式（Flyweight Pattern）](https://blog.shusheng007.top/archives/flyweight-pattern)

7. 代理模式（Proxy）

[秒懂Java代理与动态代理模式（Proxy Pattern）](https://blog.shusheng007.top/archives/proxy-pattern)

## 行为型（behavioral）

行为型设计模式主要解决类或者对象之间互相通信的问题，共**11**个

1. 责任链模式（Chain of responsibility）

[秒懂设计模式之责任链模式（Chain of responsibility）](https://blog.shusheng007.top/archives/chain-of-responsibility-pattern)

2. 命令模式（Command）

[秒懂设计模式之命令模式（Command Pattern）](https://blog.shusheng007.top/archives/command-pattern)

3. 解释器模式（Interpreter）

敬请期待

4. 迭代器模式（Iterator）

[秒懂设计模式之迭代器模式（Iterator Pattern）](https://blog.shusheng007.top/archives/iterator-pattern)

5. 中介者模式（Mediator）

敬请期待

6. 备忘录模式（Memento）

[秒懂设计模式之备忘录模式（Memento Pattern）](https://blog.shusheng007.top/archives/memento-pattern)

7. 观察者模式（Observer）

[秒懂设计模式之观察者模式（Observer Pattern）](https://blog.shusheng007.top/archives/observer-pattern)

8. 策略模式（Strategy）

[秒懂设计模式之策略模式（Strategy Pattern）](https://blog.shusheng007.top/archives/strategy-pattern)

9. 状态模式（State）

[秒懂设计模式之状态模式（State Pattern）](https://blog.shusheng007.top/archives/state-pattern)

10. 模板方法模式（Template method）

[秒懂设计模式之模板方法模式（Template Method Pattern）](https://blog.shusheng007.top/archives/template-method-pattern)

11. 访问者模式（Visitor）

[秒懂设计模式之访问者模式（Visitor Pattern）](https://blog.shusheng007.top/archives/visitor-pattern)

# 总结
本篇为设计模式汇总篇，我会不断的完善其中没有实例的设计模式，你可以先点赞收藏起来，那样就再也不怕找不到走向卓越的路了。最后请抬起你的小手手随手点个小星星...


# 联系

你可以从下面找到我，希望我们可以成为兴趣相投的好朋友:

- 个人博客：[ShuSheng007个人博客](https://blog.shusheng007.top)
- CSDN博客：[ShuSheng007CSDN博客](https://blog.csdn.net/ShuSheng0007)
- 微信： <img src="https://app.shusheng007.top/socialmedia/wechat_sj.png" width="200px">
