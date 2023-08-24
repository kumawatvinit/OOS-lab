import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class InventoryItem {
    private int id;
    private String name;
    private double unitPrice;

    public InventoryItem(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}

class InvoiceItem {
    private InventoryItem inventoryItem;
    private int quantity;

    public InvoiceItem(InventoryItem inventoryItem, int quantity) {
        this.inventoryItem = inventoryItem;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return inventoryItem.getUnitPrice() * quantity;
    }

    @Override
    public String toString() {
        return inventoryItem.getId() + "," + inventoryItem.getName() + "," +
                inventoryItem.getUnitPrice() + "," + quantity;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<InventoryItem> inventoryItems = new ArrayList<>();
        Map<Integer, InventoryItem> inventoryMap = new HashMap<>();

        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("OKAY")) {
                break;
            }
            String[] parts = line.split(" ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double unitPrice = Double.parseDouble(parts[2]);
            InventoryItem item = new InventoryItem(id, name, unitPrice);
            inventoryItems.add(item);
            inventoryMap.put(id, item);
        }

        List<InvoiceItem> invoiceItems = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Invoice\n2.Exit\nChoice:");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                char addMore;
                do {
                    System.out.println("\nAdd Invoice Item(Y/N)");
                    addMore = scanner.nextLine().charAt(0);

                    if (addMore == 'Y' || addMore == 'y') {
                        System.out.println(
                                "Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                        while (true) {
                            String line = scanner.nextLine();
                            if (line.equals("OKAY")) {
                                break;
                            }
                            String[] parts = line.split(" ");
                            int id = Integer.parseInt(parts[0]);
                            int quantity = Integer.parseInt(parts[1]);
                            InventoryItem item = inventoryMap.get(id);
                            if (item != null) {
                                invoiceItems.add(new InvoiceItem(item, quantity));
                            } else {
                                System.out.println("Inventory item with ID " + id + " not found.");
                            }
                        }
                    }
                } while (addMore == 'Y' || addMore == 'y');

                // Calculate and display the invoice
                double totalAmount = 0;
                System.out.println("\n****INVOICE****");
                for (InvoiceItem item : invoiceItems) {
                    System.out.println(item.toString());
                    totalAmount += item.getTotalPrice();
                }
                System.out.println("Total:" + totalAmount);
                System.out.println("********\n\n");

                invoiceItems.clear(); // Clear the invoice items for the next invoice
            } else if (choice == 2) {
                break;
            }
        }
    }
}
