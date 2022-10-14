package org.example;

public class MoneyChangingMachine {
    public String exchangeWonToDecimal(int won) {
        return String.valueOf(won);
    }

    public String exchangeWonToBinary(int won) {
        return Integer.toBinaryString(won);
    }

    public String exchangeWonToHex(int won) {
        return Integer.toHexString(won);
    }

    public String exchangeWonToDollarToDecimal(int won) {
        return String.valueOf((int)(Math.round((won / 1434.0))));
    }

    public String exchangeWonToDollarToBinary(int won) {
        return Integer.toBinaryString((int)(Math.round(won / 1434.0)));
    }
    public String exchangeWonToDollarToHex(int won) {
        return Integer.toHexString((int)(Math.round(won / 1434.0)));
    }
}
