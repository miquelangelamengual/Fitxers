package es.hulk.fitxers.types;

public class Article {

    private String name;
    private String description;
    private double price;
    private int stock;

    public Article() {}

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

    /*
     * SETTERS
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
