import java.util.Scanner;
public class FCP036{
  public static void hcfLcm(int a, int b){
    int hcf = 0;
    int lcm = 0;
    int min = (a < b) ? a : b; 
    for(int i=1; i<=min; i++){
       if(a%i==0){
          if(b%i==0){
            hcf=i;
          }
        }
    }
    lcm = (a*b)/hcf;
    System.out.println(hcf);
    System.out.println(lcm);
   }
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     hcfLcm(a,b);
  }
 
}   