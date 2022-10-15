package top.ss007.run;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/10/15 11:49
 * @description:
 */
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
    VISITOR,
    OBSERVER;

    public static List<String> patterList() {
        return Arrays.stream(DesignPatternName.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
