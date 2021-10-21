package Challange.BCG.domain;

import java.util.Objects;

public class Money {
    private final Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer amount() {
        return amount;
    }

    public Money add(Money aMoney) {
        return new Money(this.amount() + aMoney.amount());
    }

    public Money multiplyBy(int aNumber) {
        return new Money(this.amount() * aNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
