// Time class in Java
 class Time2 {
    // Data members (attributes)
    private int hr, min, sec;

    // No-argument constructor (default time = 00:00:00)
    Time2() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    // Constructor with parameters (validates input values)
     Time2(int hr, int min, int sec) {
        if (isValidTime(hr, min, sec)) {
            this.hr = hr;
            this.min = min;
            this.sec = sec;
        } else {
            System.out.println("Invalid time! Setting to default (00:00:00)");
            this.hr = 0;
            this.min = 0;
            this.sec = 0;
        }
    }

    // Method to check if given time is valid
    private boolean isValidTime(int hr, int min, int sec) {
        return (hr >= 0 && hr < 24) && (min >= 0 && min < 60) && (sec >= 0 && sec < 60);
    }

    // Method to display time in HH:MM:SS format
    public void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", hr, min, sec);
    }

    // Main method to test the Time class
    public static void main(String[] args) {
        // Creating an object using the no-argument constructor
        Time2 t1 = new Time2();
        System.out.println("Default Constructor:");
        t1.display();

        System.out.println();

        // Creating an object with valid time
        Time2 t2 = new Time2(14, 30, 45);
        System.out.println("Valid Time:");
        t2.display();

        System.out.println();

        // Creating an object with invalid time
        Time2 t3 = new Time2(25, 65, 80);
        System.out.println("Invalid Time (Auto-corrected):");
        t3.display();
    }
}
