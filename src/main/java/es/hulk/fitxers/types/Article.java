package es.hulk.fitxers.types;

public class Article {

    private String name;
    private String description;
    private double price;
    private int stock;
    private boolean isActive;

    private static final int MAX_STRING_NAME = 20;
    private static final int MAX_STRING_DESC = 120;

    public Article() {}

    /*
     * SETTERS
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    /*
     * GETTERS
     */

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getAdjustedName() {
        StringBuilder adjustedName = new StringBuilder(getName());
        if (adjustedName.length() > MAX_STRING_NAME) {
            adjustedName = new StringBuilder(adjustedName.substring(0, MAX_STRING_NAME));
            return adjustedName.toString();
        }
        for (int i = getName().length();i < MAX_STRING_NAME; i++) {
            adjustedName.append(" ");
        }
        return adjustedName.toString();
    }

    public String getAdjustedDescription() {
        StringBuilder adjustedDescription = new StringBuilder(getDescription());
        if (adjustedDescription.length() > MAX_STRING_DESC) {
            adjustedDescription = new StringBuilder(adjustedDescription.substring(0, MAX_STRING_DESC));
            return adjustedDescription.toString();
        }
        for (int i = getName().length();i < MAX_STRING_DESC; i++) {
            adjustedDescription.append(" ");
        }
        return adjustedDescription.toString();
    }
}
