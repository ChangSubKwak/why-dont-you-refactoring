package org.example.refactoring;

public class DollarExchanger extends ExchangerDecorator {
    public DollarExchanger(Exchanger exchanger) {
        super(exchanger);
    }

    @Override
    public String exchange(int won) {
        Integer exchangedValue = Integer.valueOf(super.exchange(won));
        return String.valueOf((int)(Math.round((exchangedValue / 1434.0))));
    }
}
