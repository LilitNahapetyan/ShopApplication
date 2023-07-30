# Shop Application

The Shop Application is a simple Java-based program that simulates a shop where customers can add products to their shopping cart and make purchases. The application is designed with a set of classes representing different components of the shop system.

## Classes

### Product
The `Product` class serves as the base class for all products in the shop. It contains common properties like name and price. Subclasses, `PhysicalProduct` and `DigitalProduct`, extend this class to represent physical and digital products, respectively.

### PhysicalProduct
The `PhysicalProduct` class extends the `Product` class and represents physical products available in the shop. It adds a property `weight`, which represents the weight of the physical product in kilograms.

### DigitalProduct
The `DigitalProduct` class also extends the `Product` class and represents digital products in the shop. It adds a property `size`, which denotes the size of the digital product in megabytes (MBs).

### Shop
The `Shop` class represents the shop itself. It contains a list of products that the shop sells and maintains a reference to the `Warehouse` where these products are stored. The `Shop` class provides methods to manage its inventory, such as `addProduct(Product product)`, `removeProduct(Product product)`, and `getProduct(String name)`.

### Warehouse
The `Warehouse` class represents the warehouse where the shop stores its products. It utilizes a map to associate each product with its quantity in the warehouse. The `Warehouse` class provides methods to manage the stock of products, such as `addProduct(Product product, int quantity)`, `removeProduct(Product product, int quantity)`, and `getProductQuantity(Product product)`.

### ShoppingCart
The `ShoppingCart` class represents a shopping cart for a customer. It contains a list of products that the customer intends to purchase. The `ShoppingCart` class provides methods to add and remove products from the cart, calculate the total price of the products, and clear the cart.

### Customer
The `Customer` class represents a customer of the shop. Each customer has their shopping cart associated with it. The `Customer` class provides methods to add and remove products from the cart and initiate the purchase process. If the customer tries to purchase products not available in the warehouse or with insufficient quantities, the purchase process is aborted with appropriate messages.

## Methods

Each class in the Shop Application may have various methods specific to its purpose:

- `Product` class may have methods like `getName()`, `getPrice()`, etc.
- `PhysicalProduct` and `DigitalProduct` classes may have additional methods specific to them, like `getShippingWeight()` for `PhysicalProduct` and `getDownloadSize()` for `DigitalProduct`.
- `Shop` class may have methods like `addProduct(Product product)`, `removeProduct(Product product)`, `getProduct(String name)`, etc.
- `Warehouse` class may have methods like `addProduct(Product product, int quantity)`, `removeProduct(Product product, int quantity)`, `getProductQuantity(Product product)`, etc.
- `ShoppingCart` class may have methods like `addProduct(Product product)`, `removeProduct(Product product)`, `getTotalPrice()`, etc.
- `Customer` class may have methods like `purchase()`, `addProductToCart(Product product)`, `removeProductFromCart(Product product)`, etc.

## Conclusion

The Shop Application is a simple and straightforward task, suitable for educational purposes, such as homework or learning exercises. It provides a basic foundation for understanding object-oriented programming concepts and class relationships.
