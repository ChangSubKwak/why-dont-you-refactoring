package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyChangingMachineTest {
    private static MoneyChangingMachine moneyChangingMachine;
    private final static int TEN_THOUSAND_WON = 10000;

    @BeforeAll
    static void setUp() {
        moneyChangingMachine = new MoneyChangingMachine();
    }


    @Test
    void exchangeWonToDecimal() {
        assertThat(moneyChangingMachine.exchangeWonToDecimal(TEN_THOUSAND_WON)).isEqualTo("10000");
    }

    @Test
    void exchangeWonToBinary() {
        assertThat(moneyChangingMachine.exchangeWonToBinary(TEN_THOUSAND_WON)).isEqualTo("10011100010000");
    }

    @Test
    void exchangeWonToHex() {
        assertThat(moneyChangingMachine.exchangeWonToHex(TEN_THOUSAND_WON)).isEqualTo("2710");
    }

    @Test
    void exchangeWonToDollarToDecimal() {
        assertThat(moneyChangingMachine.exchangeWonToDollarToDecimal(TEN_THOUSAND_WON)).isEqualTo("7");
    }

    @Test
    void exchangeWonToDollarToBinary() {
        assertThat(moneyChangingMachine.exchangeWonToDollarToBinary(TEN_THOUSAND_WON)).isEqualTo("111");
    }

    @Test
    void exchangeWonToDollarToHex() {
        assertThat(moneyChangingMachine.exchangeWonToDollarToHex(TEN_THOUSAND_WON)).isEqualTo("7");
    }
}