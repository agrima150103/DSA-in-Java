public class pattern12 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j>=1; j--) 
                System.out.print(" "); 
            for (int k = 1; k <= i; k++)
             System.out.print(i+" ");
            
              System.out.println(); // Move to the next line
    }
}
}  
