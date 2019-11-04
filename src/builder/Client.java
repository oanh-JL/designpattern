package builder;

import builder.type.BreadType;
import builder.type.OrderType;
import builder.type.SauceType;
import builder.type.VegetableType;

public class Client {
    public static void main(String[] args) {
        Order order = new FoodOrderBuilder().oderType(OrderType.ON_SITE).orderBread(BreadType.FRIED_EGG)
                .orderSauce(SauceType.SOY_SAUCE).orderVegetable(VegetableType.SALAD).build();
        System.out.println(order);
    }
}
