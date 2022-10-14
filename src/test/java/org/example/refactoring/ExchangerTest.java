package org.example.refactoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExchangerTest {

    private final static int TEN_THOUSAND_WON = 10000;

    @Test
    void exchangeWonToDecimal() {
        Exchanger exchanger = new BasicExchanger();
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("10000");
    }

    @Test
    void exchangeWonToBinary() {
        Exchanger exchanger = new BinaryExchanger(new BasicExchanger());
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("10011100010000");
    }

    @Test
    void exchangeWonToHex() {
        Exchanger exchanger = new HexExchanger(new BasicExchanger());
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("2710");
    }

    @Test
    void exchangeWonToDollarToDecimal() {
        Exchanger exchanger = new DollarExchanger(new BasicExchanger());
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("7");
    }

    @Test
    void exchangeWonToDollarToBinary() {
        Exchanger exchanger = new BinaryExchanger(new DollarExchanger(new BasicExchanger()));
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("111");
    }

    @Test
    void exchangeWonToDollarToHex() {
        Exchanger exchanger = new HexExchanger(new DollarExchanger(new BasicExchanger()));
        assertThat(exchanger.exchange(TEN_THOUSAND_WON)).isEqualTo("7");
    }
}