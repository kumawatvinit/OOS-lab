import java.util.*;


interface User {
    String getUsername();
    String getEmail();
    void displayProfile();
}

interface Purchasable {
    String getName();
    double getPrice();
    void displayProductInfo();
}

class CustomerImpl implements User, Purchasable {
    private String username;
    private String email;
    private String name;
    private double price;

    public CustomerImpl(String username, String email, String name, double price) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void displayProfile() {
        System.out.println("User Profile:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Name: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product Information:");
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}

public class Q10 {
    public static void main(String[] args) {
        CustomerImpl customer = new CustomerImpl("john_doe", "john@example.com", "John Doe", 49.99);

       
        customer.displayProfile();

        
        customer.displayProductInfo();
    }
}
