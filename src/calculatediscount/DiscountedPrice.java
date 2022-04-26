package calculatediscount;

public class DiscountedPrice {
    public void calculateDiscount(double actualPrice,double discountPrice){
        double discount = actualPrice * (discountPrice/100);
        double priceAfterDiscount = actualPrice - discount;
        System.out.println("price is " +actualPrice);
        System.out.println("aftee discount price is " +priceAfterDiscount);


    }
}
