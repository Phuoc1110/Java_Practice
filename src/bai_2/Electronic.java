package bai_2;

public class Electronic extends Product {
    private int warrantyMonths; 
    private double capacityKW; 
    private static final double VAT = 0.10; 

    public Electronic(String productCode, String name, int quantity, double unitPrice,
                      int warrantyMonths, double capacityKW) {
        super(productCode, name, Math.max(0, quantity), Math.max(0.0, unitPrice));
        if (warrantyMonths < 0) throw new IllegalArgumentException("Warranty months must be >= 0");
        if (capacityKW < 0) throw new IllegalArgumentException("Capacity must be >= 0");
        this.warrantyMonths = warrantyMonths;
        this.capacityKW = capacityKW;
    }

    public int getWarrantyMonths() { return warrantyMonths; }
    public double getCapacityKW() { return capacityKW; }

    @Override
    public double vatRate() { return VAT; }

    @Override
    public String evaluateConsumption() {
        if (quantity < 3) {
            return "Considered sold (low inventory < 3)";
        }
        return null;
    }

    @Override
    public String getTypeName() { return "Electronic"; }

    @Override
    public String toString() {
        return String.format("%s[code=%s, name=%s, qty=%d, price=%.2f, warranty=%d months, cap=%.2f KW]",
                getTypeName(), productCode, name, quantity, unitPrice, warrantyMonths, capacityKW);
    }
}
