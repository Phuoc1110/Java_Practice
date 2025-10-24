package bai_2;

import java.time.LocalDate;

public class Crockery extends Product {
    private String manufacturer;
    private LocalDate arrivalDate;
    private static final double VAT = 0.10; // 10%

    public Crockery(String productCode, String name, int quantity, double unitPrice,
                    String manufacturer, LocalDate arrivalDate) {
        super(productCode, name, Math.max(0, quantity), Math.max(0.0, unitPrice));
        this.manufacturer = manufacturer;
        this.arrivalDate = arrivalDate;
    }

    public String getManufacturer() { return manufacturer; }
    public LocalDate getArrivalDate() { return arrivalDate; }

    @Override
    public double vatRate() { return VAT; }

    @Override
    public String evaluateConsumption() {
        if (quantity > 50) {
            long daysStored = java.time.Duration.between(arrivalDate.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
            if (daysStored > 10) {
                return "Slow sale (qty>50 and stored >10 days)";
            }
        }
        return null;
    }

    @Override
    public String getTypeName() { return "Crockery"; }

    @Override
    public String toString() {
        return String.format("%s[code=%s, name=%s, qty=%d, price=%.2f, manufacturer=%s, arrival=%s]",
                getTypeName(), productCode, name, quantity, unitPrice, manufacturer, arrivalDate.format(DATE_FMT));
    }
}
