package bai_3;

import java.time.Year;

public abstract class Vehicle {
    protected String vehicleNumber;     
    protected String manufacturer;      
    protected int yearOfManufacture;  
    protected String color;
    protected Owner owner;

    public Vehicle(String vehicleNumber, String manufacturer, int yearOfManufacture, String color, Owner owner) {
        if (!vehicleNumber.matches("[A-Z0-9]{5}"))
            throw new IllegalArgumentException("Vehicle number must be 5 characters (A-Z, 0-9).");

        if (!manufacturer.matches("Honda|Yamaha|Toyota|Suzuki"))
            throw new IllegalArgumentException("Manufacturer must be one of: Honda, Yamaha, Toyota, Suzuki.");

        int currentYear = Year.now().getValue();
        if (yearOfManufacture > currentYear || yearOfManufacture <= 2000)
            throw new IllegalArgumentException("Year must be <= current year and > 2000.");

        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.owner = owner;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getManufacturer() { return manufacturer; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public String getColor() { return color; }
    public Owner getOwner() { return owner; }

    public abstract String getTypeName();

    @Override
    public String toString() {
        return String.format("%s[number=%s, manufacturer=%s, year=%d, color=%s, owner=%s]",
                getTypeName(), vehicleNumber, manufacturer, yearOfManufacture, color, owner.getFullName());
    }
}
