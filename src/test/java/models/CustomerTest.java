package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Date;

/**
 * @class CustomerTest
 * @brief Unit tests for the Customer class.
 */
public class CustomerTest {

    private Customer customer;

    /**
     * @brief Sets up a sample customer before each test.
     */
    @BeforeEach
    public void setUp() {
        customer = new Customer();
        customer.setId(1);
        customer.setName("John Doe");
        customer.setEmail("johndoe@example.com");
        customer.setAddress("123 Main Street");
        customer.setPhoneNumber("123-456-7890");
        customer.setCreatedAt(new Date());
    }

    /**
     * @brief Tests getters for customer attributes.
     */
    @Test
    public void testGetters() {
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals("johndoe@example.com", customer.getEmail());
        assertEquals("123 Main Street", customer.getAddress());
        assertEquals("123-456-7890", customer.getPhoneNumber());
        assertNotNull(customer.getCreatedAt());
    }

    /**
     * @brief Tests setters for customer attributes.
     */
    @Test
    public void testSetters() {
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());

        customer.setEmail("janedoe@example.com");
        assertEquals("janedoe@example.com", customer.getEmail());
    }
}
