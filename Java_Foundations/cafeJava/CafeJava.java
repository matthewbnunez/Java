public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dirpCoffeePrice = 2.75;
        double lattePrice = 4.25;
        double cappuccinoPrice = 3.75;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri ";
        String customer2 = "Noah ";
        String customer3 = "Sam ";
        String customer4 = "Jimmy ";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + (isReadyOrder1? "your order is ready ": "your order is being made ")); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(generalGreeting + customer2 + (isReadyOrder2? "your order is ready ": "your order is being made ") + "your total is $" + cappuccinoPrice); // Displays "Welcome to Cafe Java, Noah"
        System.out.println(generalGreeting + customer3 + (isReadyOrder3? "your order is ready ": "your order is being made ") + "your total is $" + (lattePrice * 2)); // Displays "Welcome to Cafe Java, Sam"
        isReadyOrder3 = !isReadyOrder3;
        System.out.println(generalGreeting + customer4 + (isReadyOrder4? "your order is ready ": "your order is being made ") + "your total is $" + (lattePrice - dirpCoffeePrice)); // Displays "Welcome to Cafe Java, Jimmy"
    	// ** Your customer interaction print statements will go here ** //
    }
}
