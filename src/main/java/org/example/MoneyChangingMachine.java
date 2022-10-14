package org.example;

public class MoneyChangingMachine {
    public String exchangeWonToDollar(int won) {
        return String.valueOf(Math.round((won / 1434.0) * 10) / 10.0);
    }

    public String exchangeWonToYen(int won) {
        return String.valueOf(Math.round((won / 984.0) * 10) / 10.0);
    }

    public String exchangeWonToYuan(int won) {
        return String.valueOf(Math.round((won / 199.0) * 10) / 10.0);
    }

    public String exchangeWonToBinary(int won) {
        return Integer.toBinaryString(won);
    }

    public String exchangeWonToHex(int won) {
        return Integer.toHexString(won);
    }

}
