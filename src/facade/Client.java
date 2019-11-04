package facade;

public class Client {

    public static void main(String[] args) {
        String email = "Oanhpham99x@gmail.com";
        String phoneNumber = "0989280740";
        ShopFacade.getInstance().buyProductByCashWithFreeShipping(email);
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping(email,phoneNumber);
    }
}
