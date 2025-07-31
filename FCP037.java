import java.util.Scanner;
public class FCP037{
  public static void perfectNum(int N){
    int S = 0;
    for(int i =1;i<N;i++){
      if(N % i == 0){
         S = S + i;
      }
    }
    if(S==N){
      System.out.println("Yes");
    }  
    else{
      System.out.println("No");
    }
   }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    perfectNum(N);
  }
}
    

       