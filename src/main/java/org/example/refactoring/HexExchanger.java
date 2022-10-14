package org.example.refactoring;

public class HexExchanger extends ExchangerDecorator {
    public HexExchanger(Exchanger exchanger) {
        super(exchanger);
    }

    @Override
    public String exchange(int won) {
        Integer exchangedValue = Integer.valueOf(super.exchange(won));
        return Integer.toHexString(exchangedValue);
    }
}
