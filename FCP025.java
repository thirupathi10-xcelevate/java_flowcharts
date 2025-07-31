import java.util.Scanner;
public class FCP0025 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sumOddNumbers(N);
        System.out.println(result);
    }
    public static int sumOddNumbers(int N) {
        int S = 0;
        int C = 0;
        for (int i = 1; C < N; i += 2) {
            S = S + i;
            C = C + 1;
        }
       return S;
 }
}
