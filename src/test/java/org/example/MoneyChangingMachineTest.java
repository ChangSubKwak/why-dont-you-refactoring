package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyChangingMachineTest {
    private static MoneyChangingMachine moneyChangingMachine;
    private final static int ONE_THOUSAND_WON = 1000;

    @BeforeAll
    static void setUp() {
        moneyChangingMachine = new MoneyChangingMachine();
    }

    @Test
    void exchangeWonToDollar() {
        assertThat(moneyChangingMachine.exchangeWonToDollar(ONE_THOUSAND_WON)).isEqualTo("0.7");
    }

    @Test
    void exchangeWonToYen() {
        assertThat(moneyChangingMachine.exchangeWonToYen(ONE_THOUSAND_WON)).isEqualTo("0.9");
    }

    @Test
    void exchangeWonToYuan() {
        assertThat(moneyChangingMachine.exchangeWonToYuan(ONE_THOUSAND_WON)).isEqualTo("5.0");
    }

    @Test
    void exchangeWonToBinary() {
        assertThat(moneyChangingMachine.exchangeWonToBinary(ONE_THOUSAND_WON)).isEqualTo("1111101000");
    }

    @Test
    void exchangeWonToHex() {
        assertThat(moneyChangingMachine.exchangeWonToHex(ONE_THOUSAND_WON)).isEqualTo("3e8");
    }
}