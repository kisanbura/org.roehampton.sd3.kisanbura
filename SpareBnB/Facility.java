public class Facility {
    private String name; //stores the name of the facility
    private String description; //stores a short explanation of the facility

    public Facility(String name, String description) { //constructor runs when a facility object is created.
        this.name = name; //saves the given name of the object
        this.description = description;
    }

    public String getName() {
        return name; //returns the facility name
    }

    public String getDescription() {
        return description; //returns the description
    }
}
