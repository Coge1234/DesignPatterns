package com.jochen.designpatterns.strategy;

/**
 * Created by JoChen on 2020/5/20.
 * Strategy 策略模式
 */

public class StrategyOder1 {
    public enum TaxBase {
        CN_Tax,
        US_Tax,
        DE_Tax,
        FR_Tax
    }

    TaxBase tax;

    public void calculateTax() {
        // ...if switch 分支下的大量代码，按照jvm都会加载进cpu缓存（高级缓存：一级缓存，二级缓存），
        // 不够放的话还会去到硬盘虚拟内存
        switch (tax) {
            case CN_Tax:
                // CN******
                break;
            case US_Tax:
                // US******
                break;
            case DE_Tax:
                // DE******
                break;
            case FR_Tax:
                // FR******
                break;
        }
    }
}
