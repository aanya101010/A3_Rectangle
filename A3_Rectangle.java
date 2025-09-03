import java.util.Scanner;

public class A3_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prompts
        System.out.println("Enter the length (whole number):");
        int length = scanner.nextInt();

        System.out.println("Enter the width (whole number):");
        int width = scanner.nextInt();

        // Calculations
        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println(); // blank line
        System.out.println("Rectangle properties:");
        System.out.printf("%-9s - %d%n", "Length", length);
        System.out.printf("%-9s - %d%n", "Width", width);
        System.out.printf("%-9s - %d%n", "Perimeter", perimeter);
        System.out.printf("%-9s - %d%n", "Area", area);

        scanner.close();
    }
}