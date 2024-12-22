package models;

/**
 * @class Product
 * @brief Represents a product in the system.
 * 
 * Inherits from BaseEntity and includes product-specific attributes and methods.
 */
public class Product extends BaseEntity {
    private String name;
    private double price;
    private String category;
    private int stock;
    private String description;
    private String imageUrl;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @brief Checks if the product is available in stock.
     * 
     * @return True if stock > 0, false otherwise.
     */
    public boolean isAvailable() {
        return stock > 0;
    }

    /**
     * @brief Updates the stock of the product.
     * 
     * @param quantity The amount to decrease the stock by.
     */
    public void updateStock(int quantity) {
        this.stock -= quantity;
    }
}
