package Challange.BCG.domain;

public class OrderLine {
    private final Watch watch;
    private final int count;


    public OrderLine(Watch watch, int count) {
        this.watch = watch;
        this.count = count;
    }

    public Money calculatedPrice() {
        DiscountRule discountRule = watch.getDiscountRule();
        if (discountRule == null) {
            return watch.unitPrice().multiplyBy(count);
        }
        return discountRule.discountedPriceOf(count, watch.unitPrice());
    }
}
