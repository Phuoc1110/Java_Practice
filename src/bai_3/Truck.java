package bai_3;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String vehicleNumber, String manufacturer, int yearOfManufacture,
                 String color, Owner owner, double tonnage) {
        super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
        if (tonnage <= 0)
            throw new IllegalArgumentException("Tonnage must be > 0");
        this.tonnage = tonnage;
    }

    public double getTonnage() { return tonnage; }

    @Override
    public String getTypeName() { return "Truck"; }

    @Override
    public String toString() {
        return super.toString() + String.format(", tonnage=%.1f tons", tonnage);
    }
}
