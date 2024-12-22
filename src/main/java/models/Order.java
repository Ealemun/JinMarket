package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @class Order
 * @brief Represents a customer order in the system.
 */
public class Order extends BaseEntity {
    private int customerId;
    private String status;
    private Date orderDate;
    private double totalAmount;
    private List<Product> products = new ArrayList<>();

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Product> getProducts() {
        return products;
    }

    /**
     * @brief Adds a product to the order.
     * 
     * @param product The product to add.
     * @param quantity The quantity of the product.
     */
    public void addProduct(Product product, int quantity) {
        product.updateStock(quantity);
        products.add(product);
        totalAmount += product.getPrice() * quantity;
    }

    /**
     * @brief Removes a product from the order.
     * 
     * @param product The product to remove.
     */
    public void removeProduct(Product product) {
        products.remove(product);
        totalAmount -= product.getPrice();
    }

    /**
     * @brief Updates the status of the order.
     * 
     * @param newStatus The new status to set.
     */
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}

