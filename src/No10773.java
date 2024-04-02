import java.io.*;
import java.util.Stack;

public class No10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> s = new Stack<>();

        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int k = 0;

        for(int i = 0; i < n; i++){
            k = Integer.parseInt(br.readLine());
            if(k != 0) {
                s.push(k);
                result += k;
            }
            else result -= s.pop();

        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
