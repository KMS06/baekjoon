import java.util.Arrays;
import java.util.Scanner;

public class No2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int avg = 0;
        int mid = 0;
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = scan.nextInt();
            avg += arr[i];
        }

        Arrays.sort(arr);
        mid = arr[2];

        System.out.println(avg / 5);
        System.out.println(mid);
    }
}
