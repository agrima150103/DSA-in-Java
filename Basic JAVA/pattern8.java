public class pattern8 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int counter = 1; // Initialize the counter
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(); // Move to the next line
        }
    }
}
