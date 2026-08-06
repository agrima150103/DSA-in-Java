import java.util.*;
public class function4 {
    public int factorial(int N) {
        int Num = 1;
        for(int i=1;i<=N;i++)
            Num=Num*i;
            return Num;
    }
    public static void main(String[] args) {
        function4 obj = new function4();
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int result = obj.factorial(Number);
        System.out.println("Factorial: " + result);
    }
}
