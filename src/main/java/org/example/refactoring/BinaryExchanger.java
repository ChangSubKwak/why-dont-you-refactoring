package org.example.refactoring;

public class BinaryExchanger extends ExchangerDecorator {
    public BinaryExchanger(Exchanger exchanger) {
        super(exchanger);
    }

    @Override
    public String exchange(int won) {
        Integer exchangedValue = Integer.valueOf(super.exchange(won));
        return Integer.toBinaryString(exchangedValue);
    }
}
