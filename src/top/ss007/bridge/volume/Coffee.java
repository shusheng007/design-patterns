package top.ss007.bridge.volume;

import top.ss007.bridge.additives.ICoffeeAdditives;

public abstract class Coffee {
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}
