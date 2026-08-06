public class pattern10 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print("*");
            for (int k = 2*(n-i); k >=1; k--) 
                System.out.print(" ");
            for (int j = 1; j <= i; j++) 
                System.out.print("*");
            System.out.println(); // Move to the next line
}
        for (int m = n; m >= 1; m--) {
            for (int j = 1; j <= m; j++) 
                System.out.print("*");
            for (int k = 2*(n-m); k >=1; k--) 
                System.out.print(" ");
            for (int j = 1; j <= m; j++) 
                System.out.print("*");
            System.out.println(); // Move to the next line
        }
    }
}
