import java.util.*;
public class arrays3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns of the array");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        System.out.println("enter the number to search");
        int x=sc.nextInt();
        System.out.println("enter the elements of the array");
        int numbers[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                numbers[i][j]=sc.nextInt();
        }
    }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            { if(numbers[i][j]==x)
                System.out.println("The number is found at index:"+i+","+j);
            }
        }
    }

}