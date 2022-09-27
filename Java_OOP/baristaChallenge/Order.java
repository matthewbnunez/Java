import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name, boolean ready){
        this.name = name;
        this.ready = ready;
    }
    
    // ORDER METHODS
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        return ready ? "Your order is ready" : "Thank you for waiting";
    }

    public double getOrderTotal(){
        double sum = 0;
        for(Item i: this.items){
            sum += i.getItemPrice();
        }
        return sum;
    }

    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item i: this.items){
            System.out.println(i.getItemName() + " - $" + i.getItemPrice());
        }
        System.out.println(getStatusMessage());
        System.out.println("Total: $" + getOrderTotal());
    }

    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
    
}

