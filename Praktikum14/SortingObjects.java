package Praktikum14;
import java.util.ArrayList;

public class SortingObjects {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Fajar"));
        customers.add(new Customer(2, "Andi"));
        customers.add(new Customer(3, "Dina"));

        customers.sort((c1,c2)->c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
