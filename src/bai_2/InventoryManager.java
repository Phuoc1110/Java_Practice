package bai_2;

import java.util.Locale;

public class InventoryManager {
    private Product[] products;
    private int size;

    public InventoryManager(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public boolean addProduct(Product p) {
        if (p == null) return false;
        if (size >= products.length) return false;
        if (findByCode(p.getProductCode()) != -1) return false;
        products[size++] = p;
        return true;
    }

    public int findByCode(String code) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductCode().equalsIgnoreCase(code)) return i;
        }
        return -1;
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= size) return null;
        return products[index];
    }

    public int getSize() { return size; }

    public void listAll() {
        if (size == 0) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d. %s\n", i+1, products[i].toString());
        }
    }

    public int totalQuantityByType(Class<?> cls) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (cls.isInstance(products[i])) sum += products[i].getQuantity();
        }
        return sum;
    }

    public double vatAmountByType(Class<?> cls) {
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            if (cls.isInstance(products[i])) {
                sum += products[i].totalValue() * products[i].vatRate();
            }
        }
        return sum;
    }

    public void evaluateAll() {
        boolean any = false;
        for (int i = 0; i < size; i++) {
            String eval = products[i].evaluateConsumption();
            if (eval != null) {
                any = true;
                System.out.printf("%s -> %s\n", products[i].toString(), eval);
            }
        }
        if (!any) System.out.println("No items evaluated (none meet evaluation rules).");
    }
}
