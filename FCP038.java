import java.util.Scanner;
public class FCP038{
  public static void armstrong(int N){
    int S = N;
    int sum = 0;
    int R=0,C = 0;
    while(N>0){
        R=N%10;
        C=C+1;
        N=N/10;
    }
    int K = S;
    while(S>0){
      R=S%10;
      sum= sum + (int)Math.pow(R, C);
      S=S/10;
    }
    if(sum==K){
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
 }
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   armstrong(N);
}
}
