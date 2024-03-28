import java.util.Scanner;

public class No2798 {
    static int result = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        dfs(n, m, arr, 0, 0, 0);

        System.out.println(result);
    }

    static void dfs(int n, int m, int[] arr, int sum, int i, int count){
        if(sum > m) return;
        if(count == 3){
            if(sum > result){
                result = sum;
            }
            return;
        }

        if(i >= n) return;
        dfs(n, m, arr, sum+arr[i],i+1, count+1);
        dfs(n, m, arr, sum, i+1, count);
    }
}
