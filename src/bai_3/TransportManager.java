package bai_3;

import java.util.*;

public class TransportManager {
    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        for (Vehicle x : vehicles) {
            if (x.getVehicleNumber().equalsIgnoreCase(v.getVehicleNumber()))
                return false; // duplicate
        }
        vehicles.add(v);
        return true;
    }

    public Vehicle findByNumber(String number) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(number))
                return v;
        }
        return null;
    }

    public List<Vehicle> findByOwner(String cmnd) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getOwner().getCmnd().equals(cmnd))
                result.add(v);
        }
        return result;
    }

    public void deleteByManufacturer(String manufacturer) {
        vehicles.removeIf(v -> v.getManufacturer().equalsIgnoreCase(manufacturer));
    }

    public String manufacturerWithMostVehicles() {
        if (vehicles.isEmpty()) return null;
        Map<String, Long> counts = vehicles.stream()
                .collect(java.util.stream.Collectors.groupingBy(Vehicle::getManufacturer, java.util.stream.Collectors.counting()));
        return counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    public void sortByYearDesc() {
        vehicles.sort(Comparator.comparing(Vehicle::getYearOfManufacture).reversed());
    }

    public Map<String, Long> statisticsByType() {
        return vehicles.stream()
                .collect(java.util.stream.Collectors.groupingBy(Vehicle::getTypeName, java.util.stream.Collectors.counting()));
    }

    public void listAll() {
        if (vehicles.isEmpty()) System.out.println("No vehicles in system.");
        else vehicles.forEach(System.out::println);
    }
}
