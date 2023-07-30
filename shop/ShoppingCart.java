package shop;

import java.util.ArrayList;
import java.util.List;

// ShoppingCart class represents a shopping cart that can hold a list of products.
class ShoppingCart {

  private List<Product> products; 

  public ShoppingCart() {
    this.products = new ArrayList<>();
  }

  // Adds the given product to the shopping cart.
  public void addProduct(Product product) {
    if (product != null) {
      products.add(product); 
    }
  }

  // Removes the given product from the shopping cart if it exists in the cart.
  public void removeProduct(Product product) {
    if (product != null) {
      products.remove(product);
    }
  }

  // Returns the list of products currently in the shopping cart.
  public List<Product> getProducts() {
    return products;
  }

  // Calculates and returns the total price of all products in the shopping cart.
  public float getTotalPrice() {
    float totalPrice = 0;
    for (Product product : products) {
      totalPrice += product.getPrice();
    }
    return totalPrice;
  }

  // Returns the quantity of a specific product present in the shopping cart.
  public int getProductQuantity(Product product) {
    int quantity = 0;
    for (Product p : products) {
      if (p.equals(product)) {
        quantity++;
      }
    }
    return quantity;
  }

  // Clears the shopping cart by removing all products from it.
  public void clear() {
    products.clear();
  }
}
