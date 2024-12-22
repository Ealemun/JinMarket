package models;


import models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @class OrderTest
 * @brief Unit tests for the Order class.
 */
public class OrderTest {

    private Order order;
    private Product product;

    /**
     * @brief Sets up a sample order and product before each test.
     */
    @BeforeEach
    public void setUp() {
        order = new Order();
        order.setId(1);
        order.setCustomerId(101);
        order.setStatus("Pending");
        order.setOrderDate(new Date());
        order.setTotalAmount(0.0);

        product = new Product();
        product.setId(1);
        product.setName("Test Product");
        product.setPrice(50.0);
        product.setStock(20);
    }

    /**
     * @brief Tests adding a product to the order.
     */
    @Test
    public void testAddProduct() {
        order.addProduct(product, 2);
        assertEquals(1, order.getProducts().size());
        assertEquals(100.0, order.getTotalAmount());
    }

    /**
     * @brief Tests removing a product from the order.
     */
    @Test
    public void testRemoveProduct() {
        order.addProduct(product, 2);
        order.removeProduct(product);
        assertEquals(0, order.getProducts().size());
        assertEquals(0.0, order.getTotalAmount());
    }

    /**
     * @brief Tests updating the status of the order.
     */
    @Test
    public void testUpdateStatus() {
        order.updateStatus("Shipped");
        assertEquals("Shipped", order.getStatus());
    }
}

