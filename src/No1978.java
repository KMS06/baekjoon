import java.io.*;
import java.util.StringTokenizer;

public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] arr = new boolean[1001];
        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i <= Math.sqrt(1000); i++) {

            if(arr[i] == true) {
                continue;
            }

            for(int j = i * i; j < arr.length; j = j+i) {
                arr[j] = true;
            }
        }

        for(int i = 0; i < n; i++){
            if(!arr[Integer.parseInt(st.nextToken())]) result++;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
