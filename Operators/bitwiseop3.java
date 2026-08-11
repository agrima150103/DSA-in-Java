import java.util.*;
public class bitwiseop3 {
    public static void main(String args[]) {
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;
    
    if((bitmask&n)==0)//AND property
    
        System.out.println("bit is off");//zero
    
    else
    
        System.out.println("bit is on");//one
    
    
}
}
