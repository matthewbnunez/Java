public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item() {}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    public String getItemName() {
        return this.name;
    }
    public void setItemName(String name) {
         this.name = name;
    }
    public double getItemPrice() {
        return this.price;
    }
    public void setItemPrice(int price) {
         this.price = price;
    }
}
