package bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Product {
    protected String productCode;
    protected String name;
    protected int quantity; 
    protected double unitPrice; 

    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Product(String productCode, String name, int quantity, double unitPrice) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = Math.max(0, quantity);
        this.unitPrice = Math.max(0.0, unitPrice);
    }

    public String getProductCode() { return productCode; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }

    public void setQuantity(int q) { this.quantity = Math.max(0, q); }

    public abstract double vatRate();

    public abstract String evaluateConsumption();

    public abstract String getTypeName();

    @Override
    public String toString() {
        return String.format("%s[code=%s, name=%s, qty=%d, price=%.2f]", 
            getTypeName(), productCode, name, quantity, unitPrice);
    }

    public double totalValue() {
        return unitPrice * quantity;
    }
}
