package es.hulk.fitxers.types;

public class Stock {

    private boolean isActive;
    private int quantity;

    public Stock(boolean isActive, int quantity) {
        this.isActive = isActive;
        this.quantity = quantity;
    }

    /*
     * SETTERS
     */

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*
     * GETTERS
     */

    public boolean isActive() {
        return isActive;
    }

    public int getQuantity() {
        return quantity;
    }
}
