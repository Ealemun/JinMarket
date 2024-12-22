package models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @class ProductTest
 * @brief Unit tests for the Product class.
 */
public class ProductTest {

    private Product product;

    /**
     * @brief Sets up a sample product before each test.
     */
    @BeforeEach
    public void setUp() {
        product = new Product();
        product.setId(1);
        product.setName("Test Product");
        product.setPrice(99.99);
        product.setCategory("Electronics");
        product.setStock(10);
        product.setDescription("This is a test product.");
        product.setImageUrl("http://example.com/image.png");
    }

    /**
     * @brief Tests the isAvailable() method.
     */
    @Test
    public void testIsAvailable() {
        assertTrue(product.isAvailable());
        product.setStock(0);
        assertFalse(product.isAvailable());
    }

    /**
     * @brief Tests the updateStock() method.
     */
    @Test
    public void testUpdateStock() {
        product.updateStock(5);
        assertEquals(5, product.getStock());
    }

    /**
     * @brief Tests getters for product attributes.
     */
    @Test
    public void testGetters() {
        assertEquals(1, product.getId());
        assertEquals("Test Product", product.getName());
        assertEquals(99.99, product.getPrice());
        assertEquals("Electronics", product.getCategory());
        assertEquals("This is a test product.", product.getDescription());
        assertEquals("http://example.com/image.png", product.getImageUrl());
    }
}
