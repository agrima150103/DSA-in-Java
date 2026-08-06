public class pattern13 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int i,j,k;
        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j <= n - i; j++) 
                System.out.print(" ");
            
            for (k=i;k>=1;k--)
                System.out.print(k);
            for (int l = 2; l <= i; l++) {
               
                System.out.print(l);
            }
            System.out.println(); // Move to the next line
        }
    }
}
