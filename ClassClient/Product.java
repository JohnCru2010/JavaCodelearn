package ClassClient;

public class Product {
  private int code;
  private String description;
  private double price;
  
  Product (int code, String description, double price) {
    this.code = code;
    this.description = description;
    this.price = price;
  }
  
  public int getCode () {
    return this.code;
  }
  public String getDescription () {
    return this.description;
  }
  public double getPrice () {
    return this.price;
  }
  
  public void setCode (int code) {
    this.code = code;
  }
  public void setDescription (String description) {
    this.description = description;
  }
  public void setPrice (double price) {
    this.price = price;
  }
}
