package com.jochen.designpatterns.strategy;

import android.content.Context;

/**
 * Created by JoChen on 2020/5/20.
 * Strategy 策略模式
 */

abstract class TaxStrategy {
    public abstract double Calculate(Context context);
}

public class StrategySalesOder2 {
    public class CNTax extends TaxStrategy {

        @Override
        public double Calculate(Context context) {
            return 0;
        }
    }

    public class USTax extends TaxStrategy {

        @Override
        public double Calculate(Context context) {
            return 0;
        }
    }
    public class DETax extends TaxStrategy {

        @Override
        public double Calculate(Context context) {
            return 0;
        }
    }

    TaxStrategy strategy;

    public StrategySalesOder2 (TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double CalculateTax() {
        Context context = null;
        double val = strategy.Calculate(context); // 多态调用
        // ...
        return val;
    }
}
