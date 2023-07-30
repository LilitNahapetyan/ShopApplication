package shop;

import shop.custom_exceptions.CanNotRemoveException;
import shop.custom_exceptions.NotEnoughQuantityException;
import shop.custom_exceptions.ProductIsNullException;

import java.util.HashMap;
import java.util.Map;

// Customer class represents a customer who can add products to a shopping cart and make purchases from a shop.
class Customer {

  private ShoppingCart shoppingCart;

  public Customer() {
    this.shoppingCart = new ShoppingCart();
  }

  // Adds the given product to the customer's shopping cart.
  public void addProductToCart(Product product) {
    if (product != null) {
      shoppingCart.addProduct(product);
    } else {
      throw new ProductIsNullException("Product cannot be null.");
    }
  }

  // Removes the given product from the customer's shopping cart.
  public void removeProductFromCart(Product product) {
    if (product != null) {
      shoppingCart.removeProduct(product);
    } else {
      throw new ProductIsNullException("Product cannot be null.");
    }
  }

  // Initiates the purchase process for the products in the shopping cart from the given shop.
  public void purchase(Shop shop) {
    if (shoppingCart.getProducts().isEmpty()) {
      System.out.println(
              "Your cart is empty. Please add products to your cart before purchasing."
      );
      return;
    }

    Map<Product, Integer> purchaseItems = new HashMap<>();

    // Check product availability and create a map of products to purchase
    for (Product product : shoppingCart.getProducts()) {
      int quantityInCart = shoppingCart.getProductQuantity(product);
      int availableQuantity = shop.getWarehouse().getProductQuantity(product);

      if (availableQuantity >= quantityInCart) {
        purchaseItems.put(product, quantityInCart);
      } else {
        System.out.println("Available quantity: " + availableQuantity);
        System.out.println("Requested quantity: " + quantityInCart);
        throw new NotEnoughQuantityException("Not enough quantity for product: " + product.getName());
      }
    }

    // Process the purchase and update the warehouse
    float totalPrice = 0;

    for (Map.Entry<Product, Integer> entry : purchaseItems.entrySet()) {
      Product product = entry.getKey();
      int quantityToPurchase = entry.getValue();

      shop.getWarehouse().removeProduct(product, quantityToPurchase);

      totalPrice += product.getPrice() * quantityToPurchase;
    }

    shoppingCart.clear();
    System.out.println("Purchase successful! Total price: $" + totalPrice);
  }
}
