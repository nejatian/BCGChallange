package Challange.BCG.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void shouldSuccessAddTwoMoney() {
        Money moneyOne = new Money(80);
        Money moneyTwo = new Money(120);

        Money addedResult = new Money(200);

        assertThat(moneyOne.add(moneyTwo)).isEqualTo(addedResult);
    }

    @Test
    void shouldSuccessfullyMultiplyAMoneyByAnInt() {
        Money moneyOne = new Money(80);
        int multiplyFactor = 3;

        Money result = new Money(240);

        assertThat(moneyOne.multiplyBy(multiplyFactor)).isEqualTo(result);
    }
}
