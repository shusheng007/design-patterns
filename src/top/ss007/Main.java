package top.ss007;

import top.ss007.adapter.AdapterClient;
import top.ss007.bridge.BridgeClient;
import top.ss007.builder.BuilderPatternService;
import top.ss007.chainofresponsibility.DogWang2Cor;
import top.ss007.command.DogWang2Client;
import top.ss007.composite.CompositeClient;
import top.ss007.decorator.DecoratorClient;
import top.ss007.facade.FacadeClient;
import top.ss007.factory.FactoryPatternService;
import top.ss007.flyweight.FlyweightClient;
import top.ss007.iterator.IteratorClient;
import top.ss007.memento.MementoClient;
import top.ss007.prototype.PrototypeClient;
import top.ss007.proxy.ProxyClient;
import top.ss007.singleton.SingletonClient;
import top.ss007.state.StateClient;
import top.ss007.strategy.StrategyClient;
import top.ss007.template.TemplateClient;
import top.ss007.visitor.VisitorClient;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("请输入设计模式名称运行代码，列表：%s", DesignPatternName.patterList()));
        System.out.println("输入exit回车可退出程序");

        while (true) {
            final String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            try {
                switch (DesignPatternName.valueOf(input)) {
                    case COMMAND:
                        runCommand();
                        break;
                    case CHAIN_OF_RESPONSIBILITY:
                        runChainOfResponsibility();
                        break;
                    case BUILDER:
                        runBuilder();
                        break;
                    case SIMPLE_FACTORY:
                        runSimpleFactory();
                        break;
                    case FACTORY_METHOD:
                        runFactoryMethod();
                        break;
                    case ABSTRACT_FACTORY:
                        runAbstractFactory();
                        break;
                    case BRIDGE:
                        runBridge();
                        break;
                    case STRATEGY:
                        runStrategy();
                        break;
                    case TEMPLATE:
                        runTemplate();
                        break;
                    case ADAPTER:
                        runAdapter();
                        break;
                    case PROXY:
                        runProxy();
                        break;
                    case DECORATOR:
                        runDecorator();
                        break;
                    case STATE:
                        runState();
                        break;
                    case COMPOSITE:
                        runComposite();
                        break;
                    case FLY_WEIGHT:
                        runFlyweight();
                        break;
                    case FACADE:
                        runFacade();
                        break;
                    case PROTOTYPE:
                        runPrototype();
                        break;
                    case SINGLETON:
                        runSingleton();
                        break;
                    case MEMENTO:
                        runMemento();
                        break;
                    case VISITOR:
                        runVisitor();
                        break;
                    case ITERATOR:
                        runIterator();
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("输入错误，请重试。或者输入exit回车退出程序");
            }
        }
    }


    //region 创建型设计模式
    //构建者模式
    private static void runBuilder() {
        BuilderPatternService builder = new BuilderPatternService();
        builder.assemblePcUseSimpleBuilder();
        builder.assemblePcUseTraditionBuilder();
    }

    //抽象工厂
    private static void runAbstractFactory() {
        FactoryPatternService factory = new FactoryPatternService();
        factory.makePcUseAbstractFactory();
    }

    //工厂方法
    private static void runFactoryMethod() {
        FactoryPatternService factory = new FactoryPatternService();
        factory.makePcUseFactory();
    }

    //简单工厂
    private static void runSimpleFactory() {
        FactoryPatternService factory = new FactoryPatternService();
        factory.makePcUseSimpleFactory();
    }

    //原型模式
    private static void runPrototype(){
        PrototypeClient prototypeClient=new PrototypeClient();
        prototypeClient.getReport();

    }

    //单例模式
    private static void runSingleton(){
        SingletonClient singletonClient =new SingletonClient();
        singletonClient.run();
    }
    //endregion

    //region 结构型设计模式
    //适配器模式
    private static void runAdapter() {
        AdapterClient adapterClient = new AdapterClient();
        adapterClient.recordLog();
    }

    //桥接模式
    private static void runBridge() {
        BridgeClient bridgeClient = new BridgeClient();
        bridgeClient.orderOffer();
    }

    //装饰器模式
    private static void runDecorator() {
        DecoratorClient decoratorClient = new DecoratorClient();
        decoratorClient.makeCoffee();
    }

    //代理模式
    private static void runProxy() {
        ProxyClient proxyClient = new ProxyClient();
        proxyClient.doyWang2IndictBos();
        System.out.println("-----------------------------------");
        proxyClient.cuiHuaNiuIndictBos();
    }

    //组合模式
    private static void runComposite() {
        CompositeClient compositeClient = new CompositeClient();
        compositeClient.listOrgInfo();
    }

    //享元模式
    private static void runFlyweight() {
        FlyweightClient flyweightClient = new FlyweightClient();
        flyweightClient.playChess();
    }

    //外观模式
    private static void runFacade() {
        FacadeClient facadeClient = new FacadeClient();
        facadeClient.printReport();
    }
    //endregion

    //region 行为型设计模式
    // 命令模式
    private static void runCommand() {
        DogWang2Client dogWang2 = new DogWang2Client();
        dogWang2.enjoySexRobot();
    }

    //责任连模式
    private static void runChainOfResponsibility() {
        DogWang2Cor dogWang2Cor = new DogWang2Cor();
        dogWang2Cor.applyBudget();
    }

    //策略模式
    private static void runStrategy() {
        StrategyClient strategyClient = new StrategyClient();
        strategyClient.listFeeToTianJinEye();
    }

    //模板方法
    private static void runTemplate() {
        TemplateClient templateClient = new TemplateClient();
        templateClient.startLivePlay();
    }

    //状态模式
    private static void runState() {
        StateClient stateClient = new StateClient();
        stateClient.buyKeyboard();
    }

    //备忘录模式
    private static void runMemento(){
        MementoClient mementoClient=new MementoClient();
        mementoClient.replayGame();
    }

    //迭代器模式
    private static void runIterator(){
        IteratorClient client = new IteratorClient();
        client.checkAttendance();
    }

    //访问者模式
    private static void runVisitor(){
        VisitorClient visitorClient =new VisitorClient();
        visitorClient.startProject();
    }
    //endregion


    public enum DesignPatternName {
        ABSTRACT_FACTORY,
        FACTORY_METHOD,
        SIMPLE_FACTORY,
        BUILDER,
        PROTOTYPE,
        SINGLETON,

        BRIDGE,
        ADAPTER,
        DECORATOR,
        COMPOSITE,
        FLY_WEIGHT,
        FACADE,

        COMMAND,
        CHAIN_OF_RESPONSIBILITY,
        STRATEGY,
        TEMPLATE,
        PROXY,
        STATE,
        MEMENTO,
        ITERATOR,
        VISITOR;

        public static List<String> patterList() {
            return Arrays.stream(DesignPatternName.values()).map(new Function<DesignPatternName, String>() {
                @Override
                public String apply(DesignPatternName designPatternName) {
                    return designPatternName.name();
                }
            }).collect(Collectors.toList());
        }
    }

}
