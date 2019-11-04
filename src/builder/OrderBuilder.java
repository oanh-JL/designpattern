package builder;

import builder.type.BreadType;
import builder.type.OrderType;
import builder.type.SauceType;
import builder.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder oderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
