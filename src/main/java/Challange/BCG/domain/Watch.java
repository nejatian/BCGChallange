package Challange.BCG.domain;

public class Watch {

    private final String id;
    private final String name;
    private final Money unitPrice;
    private DiscountRule discountRule;

    public Watch(String id, String name, Money unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public void addDiscountRule(DiscountRule discountRule) {
        this.discountRule = discountRule;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Money unitPrice() {
        return unitPrice;
    }

    public DiscountRule getDiscountRule() {
        return discountRule;
    }
}
