import java.util.Arrays;
import java.util.Scanner;

public class No2751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
