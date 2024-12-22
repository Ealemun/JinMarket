package models;

import java.io.File;
import java.util.Date;

/**
 * @class Invoice
 * @brief Represents an invoice for an order.
 */
public class Invoice extends BaseEntity {
    private int orderId;
    private double totalAmount;
    private Date date;
    private String paymentMethod;
    private boolean paid;

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    /**
     * @brief Marks the invoice as paid.
     */
    public void markAsPaid() {
        this.paid = true;
    }

    /**
     * @brief Generates a PDF of the invoice.
     * 
     * @return A File object representing the PDF.
     */
    public File generatePDF() {
        // TODO Logic to generate a PDF file
        return new File("invoice.pdf");
    }
}
