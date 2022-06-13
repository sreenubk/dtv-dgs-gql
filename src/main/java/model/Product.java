package model;

public class Product {

    private final String sku;
    private final String title;
    private final String description;

    public Product(String id, String sku, String title, String description) {
        this.id = id;
        this.sku = sku;
        this.title = title;
        this.description = description;

    }

    private final String id;

    public String getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
