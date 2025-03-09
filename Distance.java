// Distance class in Java
 class Distance {
    // Data members (attributes)
    private int feet;
    private int inches;

    // No-argument constructor (default values: 0 feet, 0 inches)
    Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    // Constructor with parameters
     Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to display distance
    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    // Main method to test the Distance class
    public static void main(String[] args) {
        // Creating a distance object using the no-argument constructor
        Distance d1 = new Distance();
        System.out.println("Default Constructor:");
        d1.display();

        // Creating a distance object using the parameterized constructor
        Distance d2 = new Distance(5, 8);
        System.out.println("\nParameterized Constructor:");
        d2.display();
    }
}

