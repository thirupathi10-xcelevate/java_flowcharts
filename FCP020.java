import java.util.Scanner;
public class FCP020 {
    public static void secondMax_4(int a, int b, int c, int d) {
        int max, second;
        if (a > b) {
            max = a;
            second = b;
        } else {
            max = b;
            second = a;
        }
        if (c > max) {
            second = max;
            max = c;
        } else if (c > second) {
            second = c;
        }
        if (d > max) {
            second = max;
            max = d;
        } else if (d > second) {
            second = d;
        }
        System.out.println(second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        secondMax_4(a, b, c, d);
    }
}


     