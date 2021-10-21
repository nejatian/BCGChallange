package Challange.BCG.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscountRuleTest {
    @Test
    void shouldSuccessfullyCalculateDiscount() {
        Money unitPrice = new Money(80);
        int itemNumber = 3;

        DiscountRule discountRule = new DiscountRule(2, new Money(120));

        Money discountedPrice = discountRule.discountedPriceOf(itemNumber, unitPrice);

        assertThat(discountedPrice.amount()).isEqualTo(200);
    }

    @Test
    void shouldSuccessfullyCalculateDiscountAgain() {
        Money unitPrice = new Money(100);
        int itemNumber = 7;

        DiscountRule discountRule = new DiscountRule(3, new Money(200));

        Money discountedPrice = discountRule.discountedPriceOf(itemNumber, unitPrice);

        assertThat(discountedPrice.amount()).isEqualTo(500);
    }
}
