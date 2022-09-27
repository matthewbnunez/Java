import java.util.ArrayList;
class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 3.50);
        Item item2 = new Item("Dirp Coffee", 2.75);
        Item item3 = new Item("Latte", 4.25);
        Item item4 = new Item("Cappuccino", 3.75);
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();

        Order order2 = new Order();
        order2.addItem(item4);
        order2.addItem(item3);
        order2.display();

        Order order3 = new Order("Cindhuri", true);
        order3.addItem(item1);
        order3.addItem(item1);
        order3.display();

        Order order4 = new Order("Jim", true);
        order4.addItem(item2);
        order4.addItem(item4);
        order4.display();

        Order order5 = new Order("Sam", false);
        order5.addItem(item4);
        order5.addItem(item4);
        order5.display();
    }
}
