import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AmazonOrders orders = AmazonOrders.getInstance();
        Scanner entrada = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("""
                    Welcome to your account. What would you like to do?
                    1. Place new order
                    2. Delete an order
                    3. List your recent orders
                    4. Log out""");
            option = entrada.nextInt();
            entrada.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter order number: ");
                    int orderNumber = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Enter order details: ");
                    String orderDetails = entrada.nextLine();
                    orders.placeNewOrder(orderNumber, orderDetails);
                    break;
                case 2:
                    System.out.print("Enter order number to delete: ");
                    int orderToDelete = entrada.nextInt();
                    entrada.nextLine();
                    orders.deleteOrder(orderToDelete);
                    break;
                case 3:
                    orders.listOrders();
                    break;
                case 4:
                    System.out.println("See you next time!");
                    break;
                default: System.out.println("Please try again.");
            }
        } while (option != 4);

        }
    }


