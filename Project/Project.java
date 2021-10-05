//  Create a Project class that has the fields of name and description.
// Add an additional initialCost member variable that is of type double and has both getters and setters

public class Project {
    private String name = "firstname";
    private String description = "description";
    private double initialCost = 0.0;
     
     //  Create an instance method called elevatorPitch that will return the name and description separated by a colon.
    //  Add this to the elevator pitch in parentheses after the name, e.g.: name (cost): description
    public String elevatorPitch(String name, String description) {
        return this.name + " ($" + this.initialCost + "):" + this.description;

    }

    // Overload the constructor method in three different ways.
    public Project() {
        name = "firstname";
        description = "description";

    }

    public Project(String name) {
        this.name = name;
        description = "description";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public Project(String name, double cost, String description) {
        this.name = name;
        initialCost = cost;
        this.description = description;

    }

    // Create getter and setters for each field
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double cost) {
        initialCost = cost;
    }
}

