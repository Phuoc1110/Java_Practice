package bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        InventoryManager mgr = new InventoryManager(200); // capacity 200
        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": addProductMenu(mgr); break;
                case "2": mgr.listAll(); break;
                case "3":
                    System.out.println("Evaluating consumption:");
                    mgr.evaluateAll();
                    break;
                case "4":
                    printStats(mgr);
                    break;
                case "0": running = false; break;
                default: System.out.println("Invalid choice");
            }
            System.out.println();
        }
        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println("=== Supermarket Inventory ===");
        System.out.println("1. Add product");
        System.out.println("2. List all products");
        System.out.println("3. Evaluate consumption");
        System.out.println("4. Show inventory totals and VAT by type");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    private static void addProductMenu(InventoryManager mgr) {
        System.out.println("Choose type to add: 1-Food, 2-Electronic, 3-Crockery");
        String t = sc.nextLine().trim();
        try {
            System.out.print("Product code: "); String code = sc.nextLine().trim();
            if (mgr.findByCode(code) != -1) {
                System.out.println("Duplicate product code. Add failed.");
                return;
            }
            System.out.print("Name: "); String name = sc.nextLine().trim();
            System.out.print("Quantity (int >=0): "); int qty = Integer.parseInt(sc.nextLine().trim());
            if (qty < 0) { System.out.println("Quantity must be >=0"); return; }
            System.out.print("Unit price (>=0): "); double price = Double.parseDouble(sc.nextLine().trim());
            if (price < 0) { System.out.println("Price must be >=0"); return; }

            switch (t) {
                case "1": // Food
                    System.out.print("Manufacture date (yyyy-MM-dd): "); 
                    LocalDate mfg = LocalDate.parse(sc.nextLine().trim(), Product.DATE_FMT);
                    System.out.print("Expiration date (yyyy-MM-dd): ");
                    LocalDate exp = LocalDate.parse(sc.nextLine().trim(), Product.DATE_FMT);
                    if (exp.isBefore(mfg)) { System.out.println("Expiration must be after manufacture."); return; }
                    System.out.print("Supplier: "); String supplier = sc.nextLine().trim();
                    Food f = new Food(code, name, qty, price, mfg, exp, supplier);
                    if (mgr.addProduct(f)) System.out.println("Food added.");
                    else System.out.println("Add failed.");
                    break;
                case "2": // Electronic
                    System.out.print("Warranty months (>=0): ");
                    int wm = Integer.parseInt(sc.nextLine().trim());
                    if (wm < 0) { System.out.println("Warranty must be >=0"); return; }
                    System.out.print("Capacity KW (>=0, e.g., 1.5): ");
                    double cap = Double.parseDouble(sc.nextLine().trim());
                    if (cap < 0) { System.out.println("Capacity must be >=0"); return; }
                    Electronic e = new Electronic(code, name, qty, price, wm, cap);
                    if (mgr.addProduct(e)) System.out.println("Electronic added.");
                    else System.out.println("Add failed.");
                    break;
                case "3": // Crockery
                    System.out.print("Manufacturer: "); String manu = sc.nextLine().trim();
                    System.out.print("Arrival date (yyyy-MM-dd): ");
                    LocalDate arr = LocalDate.parse(sc.nextLine().trim(), Product.DATE_FMT);
                    Crockery c = new Crockery(code, name, qty, price, manu, arr);
                    if (mgr.addProduct(c)) System.out.println("Crockery added.");
                    else System.out.println("Add failed.");
                    break;
                default:
                    System.out.println("Unknown type");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input: " + nfe.getMessage());
        } catch (DateTimeParseException dte) {
            System.out.println("Invalid date format. Use yyyy-MM-dd");
        } catch (IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        } catch (Exception ex) {
            System.out.println("Add failed: " + ex.getMessage());
        }
    }

    private static void printStats(InventoryManager mgr) {
        int totalFoodQty = mgr.totalQuantityByType(Food.class);
        int totalEleQty = mgr.totalQuantityByType(Electronic.class);
        int totalCrockQty = mgr.totalQuantityByType(Crockery.class);

        double vatFood = mgr.vatAmountByType(Food.class);
        double vatEle = mgr.vatAmountByType(Electronic.class);
        double vatCrock = mgr.vatAmountByType(Crockery.class);

        System.out.println("Inventory totals (by qty):");
        System.out.printf("Food: %d\n", totalFoodQty);
        System.out.printf("Electronic: %d\n", totalEleQty);
        System.out.printf("Crockery: %d\n", totalCrockQty);

        System.out.println("VAT amounts (monetary):");
        System.out.printf("Food VAT (5%%): %.2f\n", vatFood);
        System.out.printf("Electronic VAT (10%%): %.2f\n", vatEle);
        System.out.printf("Crockery VAT (10%%): %.2f\n", vatCrock);
    }
}
