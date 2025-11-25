




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] infoMap = new String[1001];

        for(int i = 0;i < N;i++) {
            String line = br.readLine();

            String[] parts = line.split(" ");

            String id = parts[0];
            int trailSeat = Integer.parseInt(parts[1]);
            String examSeat = parts[2];

            infoMap[trailSeat] = id + " " + examSeat;
        }

        int M = Integer.parseInt(br.readLine());

        String lastLine = br.readLine();

        String[] querySeat = lastLine.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < M;i++) {
            sb.append(infoMap[Integer.parseInt(querySeat[i])]).append("\n");
        }

        System.out.print(sb.toString());


    }
}
