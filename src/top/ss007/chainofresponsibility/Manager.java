package top.ss007.chainofresponsibility;

import java.util.Objects;

/**
 * Created by Ben.Wang
 * <p>
 * author     : Ben.Wang
 * date       : 2021/4/23 13:30
 * description:
 */
public class Manager implements BudgetHandler {
    private BudgetHandler nextHandler;

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);
        if(amount<5000){
            System.out.println("小于2000块，我这个经理可以决定：同意！");
            return true;
        }
        System.out.println(String.format("%d超出Manager权限,请更高级管理层批复",amount));
        return nextHandler.handle(amount);
    }
}
