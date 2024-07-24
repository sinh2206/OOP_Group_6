public class Robot {
    private String id;
    private String name;
    private String type;

    public Robot(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
}
