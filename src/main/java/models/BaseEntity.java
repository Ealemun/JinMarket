package models;

/**
 * @class BaseEntity
 * @brief Base class for all entities in the system.
 * 
 * Provides a common ID attribute and methods to get and set the ID.
 */
public abstract class BaseEntity {
    /**
     * @brief The unique identifier for the entity.
     */
    protected int id;

    /**
     * @brief Gets the ID of the entity.
     * 
     * @return The ID of the entity.
     */
    public int getId() {
        return id;
    }

    /**
     * @brief Sets the ID of the entity.
     * 
     * @param id The ID to be set.
     */
    public void setId(int id) {
        this.id = id;
    }
}

