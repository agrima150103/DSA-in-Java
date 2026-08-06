import java.util.*;
public class function2 {
    public int addNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        function2 obj = new function2();
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int sum = obj.addNumbers(i, j);
        System.out.println("Sum: " + sum);
    }
}
