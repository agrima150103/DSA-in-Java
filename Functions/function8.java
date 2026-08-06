import java.util.*;
public class function8 {
    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        function8 obj = new function8();
        Scanner sc = new Scanner(System.in);
        double r=sc.nextDouble();
        double circle= obj.circumference(r);
        System.out.println("Circumference: " + circle);
    }
}
