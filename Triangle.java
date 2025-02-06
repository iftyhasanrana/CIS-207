public class Triangle {
    public static void main(String[] args) {
        int rows = 6;  // Total number of rows in the triangle

        // Loop to print each row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces to center the triangle
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the "T" characters
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("T");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
