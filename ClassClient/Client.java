package ClassClient;

class Client { 
    private int number;
    private String name;
    private String address;
    private String phone;
    
    Client (int number, String name, String address, String phone) {
      this.number = number;
      this.name = name;
      this.address = address;
      this.phone = phone;
    }
    
    public int getNumber() {
      return this.number; 
    }
    public String getName() {
      return this.name; 
    }
    public String getAddress() {
      return this.address; 
    }
    public String getPhone() {
      return this.phone; 
    }
    
    public void setNumber(int number) {
      this.number = number;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public void setPhone(String phone) {
      this.phone = phone;
    }
  }