package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import shop.custom_exceptions.NotEnoughQuantityException;

// Warehouse class represents a warehouse that stores products and their quantities.
class Warehouse {

  private Map<Product, Integer> productsCount;

  public Warehouse() {
    this.productsCount = new HashMap<>();
  }

  // Adds the given quantity of the product to the warehouse.
  public void addProduct(Product product, int quantity) {
    if (product != null && quantity > 0) {
      int currentQuantity = productsCount.getOrDefault(product, 0);
      productsCount.put(product, currentQuantity + quantity);
    }
  }

  // Removes the given quantity of the product from the warehouse.
  public void removeProduct(Product product, int quantity) {
    if (product != null && quantity > 0) {
      int currentQuantity = productsCount.getOrDefault(product, 0);

      // Validate if the warehouse has enough quantity to remove.
      if (quantity <= currentQuantity) {
        int newQuantity = currentQuantity - quantity;
        productsCount.put(product, newQuantity);
        System.out.println(
                "Successfully removed " +
                        quantity +
                        " units of " +
                        product.getName() +
                        " from the warehouse."
        );
      } else {
        throw new NotEnoughQuantityException(
                "Unable to remove " +
                        quantity +
                        " units of " +
                        product.getName() +
                        " from the warehouse. The warehouse does not have enough " +
                        product.getName() +
                        " to remove."
        );
      }
    }
  }

  // Returns the quantity of the given product available in the warehouse.
  public Integer getProductQuantity(Product product) {
    return productsCount.getOrDefault(product, 0);
  }

  // Returns the list of products available in the warehouse.
  public List<Product> getProducts() {
    return new ArrayList<>(productsCount.keySet());
  }
}
