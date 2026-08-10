import java.util.*;
class arrays1
{
    public static void main(String args[])
    { int size;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
int numbers[]=new int[size];
        System.out.println("Enter the array");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("The number to search is:");
        int N=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(N==numbers[i])
                
                System.out.println("The number is found at index:"+i);
            }
    
    }}