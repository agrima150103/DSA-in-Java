import java.util.*;
public class bitwiseop2 {
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number n");
        n=sc.nextInt();
        int bitmask=n<<2;
        System.out.println("Bitmask after left shift by 2: "+bitmask);
                  System.out.println("Bitmask AND n: "+(bitmask&n));
}

}