import java.util.*;
public class bitwiseop1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Bitwise NOT of first number: "+(~a));
        System.out.println("Bitwise NOT of second number: "+(~b));
    }
}