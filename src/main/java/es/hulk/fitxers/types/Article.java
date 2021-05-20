package es.hulk.fitxers.types;

public class Article {

    private String name;
    private String description;
    private boolean active;
    private double price;
    private int stock;

    private static int MAX_STRING_NAME = 20;
    private static int MAX_STRING_DESC = 120;

    public Article() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAdjustedName() {
        String adjustedName = getName();
        if (adjustedName.length() > MAX_STRING_NAME) {
            adjustedName = adjustedName.substring(0, MAX_STRING_NAME);
            return adjustedName;
        }
        for (int i = getName().length();i < MAX_STRING_NAME; i++) {
            adjustedName += " ";
        }
        return adjustedName;
    }

    public String getAdjustedDescription() {
        String adjustedDescription = getDescription();
        if (adjustedDescription.length() > MAX_STRING_DESC) {
            adjustedDescription = adjustedDescription.substring(0, MAX_STRING_DESC);
            return adjustedDescription;
        }
        for (int i = getName().length();i < MAX_STRING_DESC; i++) {
            adjustedDescription += " ";
        }
        return adjustedDescription;
    }
}
