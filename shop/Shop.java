package shop;

import shop.custom_exceptions.ProductIsNullException;
import shop.custom_exceptions.ThereIsNotSuchProductException;

import java.util.HashMap;
import java.util.Map;

// Shop class represents a shop that sells products and manages its inventory through a warehouse.
class Shop {

  private Map<String, Product> products;
  private Warehouse warehouse; 

  public Shop(Warehouse warehouse) {
    this.products = new HashMap<>();
    this.warehouse = warehouse;

     // Add the products from the warehouse to the shop's inventory
     for (Product product : warehouse.getProducts()) {
        products.put(product.getName(), product);
      }
  }

  // Returns the associated warehouse of the shop.
  public Warehouse getWarehouse() {
    return warehouse;
  }

  // Adds the given product to the shop and warehouse.
  public void addProduct(Product product) {
    if (product != null) {
      products.put(product.getName(), product); 
      warehouse.addProduct(product, 1); 
    }else{
      throw new ProductIsNullException();
    }
  }

  // Removes the given product from the shop's inventory and warehouse.
  public void removeProduct(Product product) {
    if (product != null) {
      products.remove(product.getName());
      warehouse.removeProduct(product, warehouse.getProductQuantity(product)); 
    }else{
      throw new ProductIsNullException();
    }
  }

  // Returns the product with the given name from the shop's inventory.
  public Product getProduct(String name) {
    if(products.get(name) == null){
      throw new ThereIsNotSuchProductException();
    }
    return products.get(name); 
  }
}
