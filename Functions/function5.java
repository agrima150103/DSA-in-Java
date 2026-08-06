import java.util.*;
public class function5 {
    public double avgNum(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static void main(String[] args) {
        function5 obj = new function5();
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        double average = obj.avgNum(i, j, k);
        System.out.println("Average: " + average);
    }
}
