package shop;

class PhysicalProduct extends Product {

  private float weight;

  public PhysicalProduct(String name, float price, float weight) {
    super(name, price);
    this.weight = weight;
  }

  public float getShippingWeight() {
    return weight;
  }

  public String toString(){
    return super.toString() + " " + weight + " kg";
  }
}
