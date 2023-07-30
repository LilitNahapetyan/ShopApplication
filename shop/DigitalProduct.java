package shop;

class DigitalProduct extends Product {

  private float size;

  public DigitalProduct(String name, float price, float size) {
    super(name, price);
    this.size = size;
  }

  public float getDownloadSize() {
    return size;
  }

}
