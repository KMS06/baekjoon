import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String c = "";
        int x = 0;
        for(int i = 0; i < n; i++){
            c = br.readLine();
            StringTokenizer st = new StringTokenizer(c);
            int a = Integer.parseInt(st.nextToken());
            switch (a){
                case 1:
                    x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    continue;
                case 2:
                    if(stack.empty()) bw.write(-1 + "\n");

                    else bw.write(stack.pop() + "\n");
                    continue;
                case 3:
                    bw.write(stack.size() + "\n");
                    continue;
                case 4:
                    if(stack.empty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");

                    continue;
                case 5:
                    if(stack.empty()) bw.write(-1 + "\n");
                    else bw.write(stack.peek() + "\n");
            }
        }
        bw.close();
    }
}
