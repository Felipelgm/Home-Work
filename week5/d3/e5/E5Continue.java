package week5.d3.e5;

public class E5Continue {
    public static void main(String[] args) {

        // Declare and initialize an array with sensor readings

        // Enhanced for loop to iterate through the sensor readings

        // If the current reading is negative, skip the current iteration using continue

        // If the reading is valid, print the message for the valid reading

        double [] sensors = {15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5};

        for (double sensor : sensors) {
            if (sensor < 0) {
                continue;
            }
            System.out.println("Valid reading: " + sensor + " units");

        }

    }
}
