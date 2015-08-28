package project.model;

import java.io.Serializable;

import org.slim3.datastore.Attribute;
import com.google.appengine.api.datastore.Key;

public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *  Title of the Todo.
     */
    private String title;
    /**
     *  Description of the Todo.
     */
    private String description;
    /**
     *  Total Quantity of the Todo (1-n).
     */
    private int total_quantity;
    /**
     *  Finished Quantity of the Todo (1-total_quantity).
     *  
     */
    private int finished_quantity;
    
    /**
     * @return the title
     */
    public String getTitle() {
        
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the total_quantity
     */
    public int getTotal_quantity() {
        return total_quantity;
    }

    /**
     * @param total_quantity the total_quantity to set
     */
    public void setTotal_quantity(int total_quantity) {
        this.total_quantity = total_quantity;
    }

    /**
     * @return the finished_quantity
     */
    public int getFinished_quantity() {
        return finished_quantity;
    }

    /**
     * @param finished_quantity the finished_quantity to set
     */
    public void setFinished_quantity(int finished_quantity) {
        this.finished_quantity = finished_quantity;
    }

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Todo other = (Todo) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
