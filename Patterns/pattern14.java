public class pattern14 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        //upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1;k<=2*i-1;k++) {
                System.out.print("*");
            }
        System.out.println(); // Move to the next line
        }
        //lower half of the diamond
        for (int i = n-1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}