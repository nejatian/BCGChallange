package Challange.BCG.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {
    @Test
    void shouldCreateAnOrderSuccessfully() {
        Watch rolex = new Watch("001", "Rolex", new Money(100));
        rolex.addDiscountRule(new DiscountRule(3, new Money(200)));

        Watch mk = new Watch("002", "Michael Kors", new Money(80));
        mk.addDiscountRule(new DiscountRule(2, new Money(120)));

        Order order = new Order();
        order.addOrderLine(rolex, 7);
        order.addOrderLine(mk, 3);

        assertThat(order.orderTotalPrice().amount()).isEqualTo(new Money(700).amount());
    }
}
