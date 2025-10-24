package bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Food extends Product {
    private LocalDate mfgDate;
    private LocalDate expDate;
    private String supplier;
    private static final double VAT = 0.05; 

    public Food(String productCode, String name, int quantity, double unitPrice,
                LocalDate mfgDate, LocalDate expDate, String supplier) {
        super(productCode, name, quantity, unitPrice);
        if (expDate.isBefore(mfgDate)) {
            throw new IllegalArgumentException("Expiration date must be after or equal manufacture date.");
        }
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.supplier = supplier;
    }

    public LocalDate getMfgDate() { return mfgDate; }
    public LocalDate getExpDate() { return expDate; }
    public String getSupplier() { return supplier; }

    @Override
    public double vatRate() { return VAT; }

    @Override
    public String evaluateConsumption() {
        
        if (quantity > 0 && expDate.isBefore(LocalDate.now())) {
            return "Hard to sell (expired)";
        }
        return null; 
    }

    @Override
    public String getTypeName() { return "Food"; }

    @Override
    public String toString() {
        return String.format("%s[code=%s, name=%s, qty=%d, price=%.2f, mfg=%s, exp=%s, supplier=%s]",
                getTypeName(), productCode, name, quantity, unitPrice, 
                mfgDate.format(DATE_FMT), expDate.format(DATE_FMT), supplier);
    }
}
