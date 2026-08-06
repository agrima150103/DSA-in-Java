public class pattern3 {
    public static void main(String[] args) {
        int n=4; // Number of rows
        int m=5; // Number of columns
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i==1||i==n||j==1||j==m)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            System.out.println(); // Move to the next line
        }
    }
}

