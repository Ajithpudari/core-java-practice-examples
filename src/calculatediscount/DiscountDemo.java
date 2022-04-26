package calculatediscount;

public class DiscountDemo {
    public static void main(String Args[]){
        DiscountedPrice dp1 = new DiscountedPrice();
        dp1.calculateDiscount(200,30);
        DiscountedPrice dp2 = new DiscountedPrice();
        dp2.calculateDiscount(300,30);

    }
}
