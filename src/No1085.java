import java.util.Scanner;

public class No1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int min1 = 0;
        int min2 = 0;

        if(x > w-x) min1 = w-x;
        else min1 = x;

        if(y > h-y) min2 = h-y;
        else min2 = y;

        if(min1 > min2) System.out.println(min2);
        else System.out.println(min1);
    }
}
