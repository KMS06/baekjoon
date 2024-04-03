import java.io.*;

public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int ok = 0;

        for(int i = 0; i < n; i++){
            sb.append(br.readLine());
            for(int j = 0; j < sb.length(); j++){
                if(sb.charAt(j) == '(') ok++;
                else ok--;

                if(ok < 0) {
                    bw.write("NO\n");
                    break;
                }
            }
            if(ok == 0) bw.write("YES\n");
            else if(ok > 0) bw.write("NO\n");
            sb.delete(0, sb.length());
            ok = 0;

        }
        bw.close();
    }
}
