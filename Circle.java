public class Circle {
    private double radius;

    Circle(){
       this.radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    //method yo  calculate circumferance

    public double calculateCirf(){
return 2 * Math.PI * radius;
    }

    public void displayInfo() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + calculateCirf());
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 (Default Constructor):");
        circle1.displayInfo();
    }
}
