# design-patterns
使用最浅显的示例呈现设计模式，力争让每一位程序员都看得懂，入得门...

## 如何使用此源码示例

无任何三方依赖，可直接运行。运行后按照提示输入对应的设计模式名称，则会得到运行结果

```
请输入设计模式名称运行代码，列表：[COMMAND, CHAIN_OF_RESPONSIBILITY, BUILDER, ABSTRACT_FACTORY, FACTORY_METHOD, SIMPLE_FACTORY]
输入exit回车可退出程序
BUILDER
assembled personal computer:Computer{cpu='I5处理器', ram='三星125', usbCount=2, keyboard='苹果键盘', display='苹果显示器'}
mac computer:Computer{cpu='I5处理器', ram='三星125', usbCount=2, keyboard='苹果键盘', display='苹果显示器'}
lenovo computer:Computer{cpu='I7处理器', ram='海力士222', usbCount=4, keyboard='联想键盘', display='联想显示器'}
DD
输入错误，请重试。或者输入exit回车退出程序
COMMAND
只见冰冰纤纤玉手，顺着双峰慢慢移到了背后，一颗，两颗...
伴随着重金属的摇滚音乐，冰冰扭动着水蛇腰，双手已经移动到了三角区...
开始跳舞表演，时长为：半小时
终日以文雅示人的大幂幂尽然也有她狂野的一面，只见她随着音乐疯狂的扭动，魅惑的表情更是让人想入非非，欲罢不能...
exit

Process finished with exit code 0
```




# 概述
在IT这个行业，技术日新月异。有可能你今年刚弄懂一个编程框架，明年它就不流行了，无怪乎有些无节操的IT从业人员去GitBub上用汉语提Issue：“求你别更新了，实在学不动了”。对于这种行为我只能说，太jb不要脸了...

然而即使在易变的IT世界也有很多几乎不变的知识，他们晦涩而重要，默默的将程序员划分为卓越与平庸两类，例如算法，例如我们今天要说的设计模式，等等。


# 定义
英文：
>In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations. Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

汉语：
>在软件工程领域，设计模式是一套通用的可复用的解决方案，用来解决在软件设计过程中产生的通用问题。它不是一个可以直接转换成源代码的设计，只是一套在软件系统设计过程中程序员应该遵循的最佳实践准则。

从定义可以看出，设计模式是一套语言无关的最佳设计实践准则，我们这里主要介绍GOF的面向对象的23种设计模式。

# 分类
设计模式安装其要解决的问题一般被分为3类：

## 创建型（creational）
顾名思义，主要解决如何灵活创建对象或者类的问题，共5个

1.  抽象工厂模式（Abstract Factory）

[秒懂设计模式之抽象工厂模式（Abstract Factory Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/86644481)
  
2. 工厂方法模式（Factory Method）

[秒懂设计模式之工厂方法模式（Factory Method Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/86636494)

3. 构建者模式（Builder）

[秒懂设计模式之建造者模式（Builder pattern）](https://blog.csdn.net/ShuSheng0007/article/details/86619675)

4. 单例模式（Singleton）

敬请期待

5.  原型模式（Prototype）

敬请期待


另外还有一个简单工厂模式，不在GOF 23种设计模式之中。
[秒懂设计模式之简单工厂模式（Simple Factory Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/86634864)




## 结构型（structural）
结构型设计模式主要用于将类或对象进行组合从而构建灵活而高效的结构，共7个。

1. 适配器模式（Adapter）

[秒懂设计模式之适配器模式（Adapter Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/116161690)

2. 桥接模式（Bridge）

[秒懂设计模式之桥接模式（Bridge Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/88370067)

3. 组合模式（Composite）
4. 装饰者模式（Decorator）

[秒懂设计模式之装饰者模式（Decorator Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/88780036)

5. 外观模式（Facade）
6. 享元模式（Flyweight）
7. 代理模式（Proxy）

[秒懂Java代理与动态代理模式（Proxy Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/80864854)
## 行为型（behavioral）
行为型设计模式主要解决类或者对象直接互相通信的问题，共11个

1. 责任链模式（Chain of responsibility）

[秒懂设计模式之责任链模式（Chain of responsibility）](https://blog.csdn.net/ShuSheng0007/article/details/116138433)

2. 命令模式（Command）

[秒懂设计模式之命令模式（Command Pattern），王二狗背着媳妇又搞事了](https://blog.csdn.net/ShuSheng0007/article/details/116115743)

3. 解释器模式（Interpreter）
4. 迭代器模式（Iterator）
5. 中介者模式（Mediator）
6. 备忘录模式（Memento）
7. 观察者模式（Observer）
8. 策略模式（Strategy）

[秒懂设计模式之策略模式（Strategy Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/88085445)

9. 状态模式（State）

[秒懂设计模式之状态模式（State Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/116375477) 

10. 模板方法模式（Template method）

[秒懂设计模式之模板方法模式（Template Method Pattern）](https://blog.csdn.net/ShuSheng0007/article/details/88832293)

11. 访问者模式（Visitor）
 

# 总结
本篇为设计模式汇总篇，我会不断的完善补全其中没有实例的设计模式，你可以先点赞收藏起来，那样就再也不怕找不到走向卓越的路了。
