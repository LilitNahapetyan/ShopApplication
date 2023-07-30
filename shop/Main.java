package shop;
public class Main {

    public static void main(String[] args) {

        DigitalProduct digitalProduct = new DigitalProduct("E-book", 9.99f, 50.0f);
        PhysicalProduct physicalProduct = new PhysicalProduct("T-shirt", 19.99f, 0.5f);

        System.out.println(digitalProduct);
        System.out.println(physicalProduct);

        PhysicalProduct milk = new PhysicalProduct("Milk", 5f, 1f);
        PhysicalProduct coffee = new PhysicalProduct("Kaffa coffee", 2f, 0.5f);
        PhysicalProduct apple = new PhysicalProduct("Apple", 5, 3);
        PhysicalProduct mango = new PhysicalProduct("Mango", 10f, 1f);
        PhysicalProduct juice = new PhysicalProduct("Juice", 3f, 0.7f);

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(milk, 4);
        warehouse.addProduct(coffee, 3);
        warehouse.addProduct(apple, 25);
        warehouse.addProduct(mango, 12);

        System.out.println("Milk quantity in warehouse: " + warehouse.getProductQuantity(milk));

        warehouse.removeProduct(milk, 2);

        System.out.println("Milk quantity in warehouse after removal: " + warehouse.getProductQuantity(milk));

        Shop shop = new Shop(warehouse);
        System.out.println(shop.getProduct("Milk"));

        System.out.println(warehouse.getProducts());

        System.out.println("--------------------------------------------------------");
        Customer customer = new Customer();

        customer.addProductToCart(milk);
        customer.addProductToCart(coffee);
        customer.purchase(shop);
        System.out.println("Milk quantity in warehouse after purchase: " + warehouse.getProductQuantity(milk));

        System.out.println("--------------------------------------------------------");

        // There is no juice in the shop
        customer.addProductToCart(juice);
        customer.purchase(shop);
    }
}
