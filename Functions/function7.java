public class function7 {
    public int greater(int N1,int N2) {
        return Math.max(N1,N2);
    }

    public static void main(String[] args) {
        function7 obj = new function7();
        int result = obj.greater(10,20);
        System.out.println("Greater number: " + result);
    }
}
