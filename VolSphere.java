import java.util.Scanner;

/**
 * Calculates the volume of a sphere based on user input.
 */
public final class VolSphere {

    /**
     * For utility class.
     */
    private VolSphere() {
    }

    /**
     * To run program.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of sphere (cm): ");
        double radius = scanner.nextDouble();

        // Calculates radius and ensures the number is positive
        if (radius <= 0) {
            System.out.println("Error: Radius must be positive.");
        } else {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String formatted = String.format("%.3f", volume);

            System.out.println("Volume of sphere: " + formatted + " cm^3");
        }

        scanner.close();
    }
}
