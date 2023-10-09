
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double total = lineItems[0] + lineItems[1] + lineItems[2] + lineItems[3];
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }


    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(username);
        System.out.println(customers);
    }
}
