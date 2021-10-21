package Challange.BCG.domain;

public class DiscountRule {
    private final int itemNumber;
    private final Money forPrice;

    public DiscountRule(int itemNumber, Money forPrice) {
        this.itemNumber = itemNumber;
        this.forPrice = forPrice;
    }

    public Money discountedPriceOf(int anItemNumber, Money aUnitPrice) {
        int numberOfDiscountedItems = Math.abs(anItemNumber / itemNumber);
        int numberOfItemWithoutDiscount = Math.abs(anItemNumber % itemNumber);

        return aUnitPrice
                .multiplyBy(numberOfItemWithoutDiscount)
                .add(forPrice.multiplyBy(numberOfDiscountedItems));
    }
}
