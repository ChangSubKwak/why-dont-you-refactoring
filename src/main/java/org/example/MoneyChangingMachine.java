package org.example;

// 7. 뒤엉킨 변경
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

    public static void main(String[] args) {
        MoneyChangingMachine moneyChangingMachine = new MoneyChangingMachine();
        System.out.println("moneyChangingMachine.exchangeWonToDollar(1000) = " + moneyChangingMachine.exchangeWonToDollar(1000));
        System.out.println("moneyChangingMachine.exchangeWonToDollar(1000) = " + moneyChangingMachine.exchangeWonToYen(1000));
        System.out.println("moneyChangingMachine.exchangeWonToDollar(1000) = " + moneyChangingMachine.exchangeWonToYuan(1000));
        System.out.println("moneyChangingMachine.exchangeWonToDollar(1000) = " + moneyChangingMachine.exchangeWonToBinary(1000));
        System.out.println("moneyChangingMachine.exchangeWonToDollar(1000) = " + moneyChangingMachine.exchangeWonToHex(1000));
    }
}
