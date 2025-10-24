package bai_3;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static TransportManager manager = new TransportManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": addVehicleMenu(); break;
                case "2": findByNumber(); break;
                case "3": findByOwner(); break;
                case "4": deleteByManufacturer(); break;
                case "5": mostManufacturer(); break;
                case "6": sortVehicles(); break;
                case "7": statistics(); break;
                case "8": manager.listAll(); break;
                case "0": running = false; break;
                default: System.out.println("Invalid choice!");
            }
            System.out.println();
        }
        System.out.println("Goodbye!");
    }

    static void printMenu() {
        System.out.println("=== Vehicle Management ===");
        System.out.println("1. Add vehicle");
        System.out.println("2. Search by vehicle number");
        System.out.println("3. Find vehicles by owner's CMND");
        System.out.println("4. Delete all vehicles by manufacturer");
        System.out.println("5. Manufacturer with most vehicles");
        System.out.println("6. Sort vehicles by year descending");
        System.out.println("7. Statistics by type");
        System.out.println("8. Show all vehicles");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    static Owner inputOwner() {
        System.out.print("CMND (12 digits): ");
        String cmnd = sc.nextLine().trim();
        System.out.print("Full name: ");
        String name = sc.nextLine().trim();
        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        return new Owner(cmnd, name, email);
    }

    static void addVehicleMenu() {
        try {
            System.out.println("Choose type: 1-Car  2-Motorbike  3-Truck");
            String t = sc.nextLine().trim();

            System.out.print("Vehicle number (5 chars): ");
            String num = sc.nextLine().trim();
            System.out.print("Manufacturer (Honda/Yamaha/Toyota/Suzuki): ");
            String manu = sc.nextLine().trim();
            System.out.print("Year of manufacture: ");
            int year = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Color: ");
            String color = sc.nextLine().trim();

            Owner owner = inputOwner();

            Vehicle v = null;
            switch (t) {
                case "1":
                    System.out.print("Number of seats: ");
                    int seats = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Engine type: ");
                    String eng = sc.nextLine().trim();
                    v = new Car(num, manu, year, color, owner, seats, eng);
                    break;
                case "2":
                    System.out.print("Capacity (cc): ");
                    double cap = Double.parseDouble(sc.nextLine().trim());
                    v = new Motorbike(num, manu, year, color, owner, cap);
                    break;
                case "3":
                    System.out.print("Tonnage: ");
                    double ton = Double.parseDouble(sc.nextLine().trim());
                    v = new Truck(num, manu, year, color, owner, ton);
                    break;
                default:
                    System.out.println("Invalid type!");
                    return;
            }

            if (manager.addVehicle(v))
                System.out.println("Added successfully!");
            else
                System.out.println("Duplicate vehicle number!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void findByNumber() {
        System.out.print("Enter vehicle number: ");
        String num = sc.nextLine().trim();
        Vehicle v = manager.findByNumber(num);
        if (v == null) System.out.println("Not found.");
        else System.out.println(v);
    }

    static void findByOwner() {
        System.out.print("Enter owner's CMND: ");
        String cmnd = sc.nextLine().trim();
        var list = manager.findByOwner(cmnd);
        if (list.isEmpty()) System.out.println("No vehicles found for this owner.");
        else list.forEach(System.out::println);
    }

    static void deleteByManufacturer() {
        System.out.print("Enter manufacturer: ");
        String manu = sc.nextLine().trim();
        manager.deleteByManufacturer(manu);
        System.out.println("Deleted all vehicles from manufacturer: " + manu);
    }

    static void mostManufacturer() {
        String manu = manager.manufacturerWithMostVehicles();
        if (manu == null) System.out.println("No vehicles in system.");
        else System.out.println("Manufacturer with most vehicles: " + manu);
    }

    static void sortVehicles() {
        manager.sortByYearDesc();
        System.out.println("Sorted by year descending.");
        manager.listAll();
    }

    static void statistics() {
        var stats = manager.statisticsByType();
        System.out.println("Vehicle type statistics:");
        stats.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
    }
}
