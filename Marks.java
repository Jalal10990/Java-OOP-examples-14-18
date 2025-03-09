// Marks class in Java
 class Marks {
    // Data members (attributes)
    private int mark1, mark2, mark3;

    // No-argument constructor (default marks = 0)
 Marks() {
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    // Constructor with parameters to initialize marks
     Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate sum of marks
    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }

    // Method to display marks and total sum
    public void display() {
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateSum());
    }

    // Main method to test the Marks class
    public static void main(String[] args) {
        // Creating an object using the no-argument constructor
        Marks student1 = new Marks();
        System.out.println("Student 1 (Default Constructor):");
        student1.display();

        System.out.println();

        // Creating an object with specified marks
        Marks student2 = new Marks(85, 90, 78);
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.display();
    }
}

