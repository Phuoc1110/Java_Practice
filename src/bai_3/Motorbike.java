package bai_3;

public class Motorbike extends Vehicle {
    private double capacity;

    public Motorbike(String vehicleNumber, String manufacturer, int yearOfManufacture,
                     String color, Owner owner, double capacity) {
        super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be > 0");
        this.capacity = capacity;
    }

    public double getCapacity() { return capacity; }

    @Override
    public String getTypeName() { return "Motorbike"; }

    @Override
    public String toString() {
        return super.toString() + String.format(", capacity=%.1fcc", capacity);
    }
}
