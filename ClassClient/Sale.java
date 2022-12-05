package ClassClient;

public class Sale {
    private int invoice;
    private String date;
    private Client client;
    private Product product;
    private int quantity;
    private double totalAmount;
    
    Sale (int invoice, String date, Client client, Product product, int quantity) {
      this.invoice = invoice;
      this.date = date;
      this.client = client;
      this.product = product;
      this.quantity = quantity;    
      calculateAmount();
    }
    
    public int getInvoice () {
      return this.invoice;
    }
    public String getDate () {
      return this.date;
    }
    public Client getClient () {
      return this.client;
    }
    public Product getProduct  () {
      return this.product;
    }
    public int getQuantity  () {
      return this.quantity;
    }
    public double getTotalAmount () {
      return totalAmount;  
    }
    
    public void setInvoice (int invoice) {
      this.invoice = invoice;
    }
    public void setDate (String date) {
      this.date = date;
    }
    public void setClient  (Client client) {
      this.client = client;
    }
    public void setProduct (Product product) {
      this.product = product;
    }
    public void setQuantity (int quantity) {
      this.quantity = quantity;
    }
    
    public void calculateAmount () {
      this.totalAmount = this.product.getPrice() * this.quantity; 
    }
    
    public String toString (String override) {
      return "Invoice data: " +
      "\n-------------" + 
      "\nNumber: " + this.invoice +
      "\nDate: " + this.date + 
      "\nClient name: " + this.client.getName() + 
      "\nProduct name: " + this.product.getDescription() +
      "\nTotal amount: " + this.totalAmount;  
    }
}
