import java.util.Scanner;
public class FCP026 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int result = rangeSum(M, N);
        System.out.println(result);
    }
    public static int rangeSum(int M, int N) {
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum = sum + i;
        }
        return sum;
     }
}
