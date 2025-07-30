import java.util.Scanner;
public class FCP014{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int m = 0;
int n = 0;
if (a > b){
m = a;
}
else{
m = b;
}
if (c > d){
n = c;
}
else{
n=d;
}
if (m > n) {
System.out.println(m);
}
else{
System.out.println(n);
}
}
}

