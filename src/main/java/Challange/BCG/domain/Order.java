package Challange.BCG.domain;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private final Set<OrderLine> orderLines = new HashSet<OrderLine>();

    public Order() {
    }

    public void addOrderLine(Watch aWatch, int aCount) {
        this.orderLines.add(new OrderLine(aWatch, aCount));
    }

    public Money orderTotalPrice(){
        Money total = new Money(0);

        for (OrderLine orderLine : orderLines) {
            total = total.add(orderLine.calculatedPrice());
        }

        return total;
    }
}
