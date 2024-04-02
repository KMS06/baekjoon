import java.util.Scanner;

public class No3009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int n = 0;
        int m = 0;
        if(a == c) n = e;
        else if(c == e) n = a;
        else n = c;

        if(b == d) m = f;
        else if(d == f) m = b;
        else m = d;

        System.out.println(n + " " + m);
    }
}
