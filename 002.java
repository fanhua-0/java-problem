import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxlen = 0;
        int start = n;
        long project = 1;
        int curlen = 1;

        for(int i = 2;i < Math.sqrt(n);i++) {
            project = 1;
            curlen = 0;

            for(int j = i; ;j++) {
                project *= j;

                if(project > n) {
                    break;
                }

                if(n % project == 0) {
                    curlen++;
                    if(curlen > maxlen) {
                        maxlen = curlen;
                        start = i;
                    }
                }
            }
        }

        if(maxlen != 0){
            System.out.println(maxlen);
            for(int i = 0;i < maxlen;i++) {
                System.out.print(start);
                if(i < maxlen - 1) {
                    System.out.print("*");
                }
                start++;
            }
        } else {
            System.out.println("1");
            System.out.println(n);
        }

    }
}
