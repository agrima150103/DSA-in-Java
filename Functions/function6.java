public class function6 {
    public int addOdd(int N)
    {
        int sum = 0;
        for(int i=1;i<=N;i++)
        {
            if(i%2!=0)
                sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        function6 obj = new function6();
        int result = obj.addOdd(10);
        System.out.println("Sum of odd numbers: " + result);
    }
}
