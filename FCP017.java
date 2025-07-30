import java.util.Scanner;
public class SecondMaxNoLogicalOps {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int secondMax;
if (a > b) {
if (a < c) {
secondMax = a;
} else {
if (b > c) {
secondMax = b;
} else {
secondMax = c;
}
}
} else {
if (b < c) {
secondMax = b;
} else {
if (a > c) {
secondMax = a;
} else {
secondMax = c;
}
}
}
System.out.println(secondMax);
}
}

