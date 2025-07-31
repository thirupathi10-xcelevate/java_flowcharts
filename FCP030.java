import java.util.Scanner;
public class FCP030 {
    public static void perfectSquare(int N) {
        for (int i = 1; i * i <= N; i++) {
            if (N == i * i) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        perfectSquare(N);
    }
}
