import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonOrders {
    private final Map<Integer,String> orders;
    private static final AmazonOrders instance = new AmazonOrders();

    private AmazonOrders() {
        orders = new HashMap<>();
    }

    public static AmazonOrders getInstance(){
        return instance;
    }

    public void placeNewOrder(int orderNumber, String orderDetails) {
        if (orders.containsKey(orderNumber)) {
            System.out.println("Order number " + orderNumber + " already exists.");
        } else {
            orders.put(orderNumber, orderDetails);
            System.out.println("Order placed: #" + orderNumber + " - " + orderDetails);
        }
    }

    public void deleteOrder(int orderNumber) {
        if (orders.containsKey(orderNumber)) {
            String removedOrder = orders.remove(orderNumber);
            System.out.println("Order removed: #" + orderNumber + " - " + removedOrder);
        } else {
            System.out.println("Order number " + orderNumber + " not found.");
        }
    }

    public void listOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders in the system.");
        } else {
            System.out.println("Most recent orders:");
            orders.entrySet().stream()
                    .sorted((a, b) -> b.getKey().compareTo(a.getKey()))
                    .forEach(entry -> System.out.println("Order #" + entry.getKey() + ": " + entry.getValue()));
        }
    }
}


