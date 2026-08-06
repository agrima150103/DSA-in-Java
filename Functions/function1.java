import java.util.*;
public class function1 { 
     public void printName(String name) { 
         System.out.println(name); 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Variable changed to lowercase
        function1 obj = new function1();
        obj.printName(name);
        }
}
