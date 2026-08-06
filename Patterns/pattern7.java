public class pattern7 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = n; i>=1; i--) //i=1;i<=n;i++
            {
            for (int j = 1; j <=i; j++) //j<=n-i+1 
                 {
                System.out.print(j);
            }
             System.out.println(); // Move to the next line
        }
    }
}
