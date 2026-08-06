import java.util.*;
public class function3 {
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        function3 obj = new function3();
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int product = obj.multiplyNumbers(i, j);
        System.out.println("Product: " + product);
    }
}
