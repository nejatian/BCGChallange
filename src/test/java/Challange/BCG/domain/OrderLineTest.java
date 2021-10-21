package Challange.BCG.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderLineTest {

    @Test
    void shouldCalculatePriceForAnOrderLineWithDiscountRuleSuccessfully() {
        Watch rolex = new Watch("001", "Rolex", new Money(100));
        rolex.addDiscountRule(new DiscountRule(3, new Money(200)));

        OrderLine orderLine = new OrderLine(rolex, 3);

        assertThat(orderLine.calculatedPrice()).isEqualTo(new Money(200));
    }

    @Test
    void shouldCalculatePriceForAnOrderLineSuccessfully() {
        Watch casio = new Watch("004", "Casio", new Money(30));

        OrderLine orderLine = new OrderLine(casio, 3);

        assertThat(orderLine.calculatedPrice()).isEqualTo(new Money(90));
    }
}
