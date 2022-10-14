package org.example.refactoring;

public class ExchangerDecorator implements Exchanger {
    protected Exchanger exchanger;

    public ExchangerDecorator(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public String exchange(int won) {
        return exchanger.exchange(won);
    }
}
