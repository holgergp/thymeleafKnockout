package hello;

/**
 * @author Holger Grosse-Plankermann (xd98714)
 */
public class BurgerEntry {
    String id;

    String description;

    public BurgerEntry(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
