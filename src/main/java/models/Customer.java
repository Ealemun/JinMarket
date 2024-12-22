package models;
import java.util.Date;

/**
 * @class Customer
 * @brief Represents a customer in the system.
 * 
 * Inherits from BaseEntity and includes customer-specific attributes and methods.
 */
public class Customer extends BaseEntity {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Date createdAt;

    // Getters and setters for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
