import java.util.Scanner;
public class ThirdMaxFinder {
public static void findThirdMax(int N, Scanner sc) {
int[] arr = new int[N];
for (int i = 0; i < N; i++) {
arr[i] = sc.nextInt();
}
for (int i = 0; i < N - 1; i++) {
for (int j = 0; j < N - i - 1; j++) {
if (arr[j] < arr[j + 1]) {
int temp = arr[j];
  rr[j] = arr[j + 1];
  arr[j + 1] = temp;
 }
}
}
System.out.println(arr[2]);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N < 3) {
      System.out.println("Not enough numbers");
    } else {
      findThirdMax(N, sc);
    }
  }
}
