package org.example.refactoring;

public class BasicExchanger implements Exchanger {
    @Override
    public String exchange(int won) {
        return String.valueOf(won);
    }
}
