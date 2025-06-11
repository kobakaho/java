// 時刻に指定の整数をそれぞれ足す　24時間表示にする

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String start = sc.next();
            int h = sc.nextInt();
            int m = sc.nextInt();
            
            int startH = Integer.parseInt(start.substring(0, 2));
            int startM = Integer.parseInt(start.substring(3, 5));

            int ah = startH + h;
            int am = startM + m;

            if (am >= 60) {
                ah += 1;
                am -= 60;
            }

            if (ah >= 24) {
                ah -= 24;
            }

            String endH = Integer.toString(ah);
            String endM = Integer.toString(am); 

            if (endH.length() == 1) {
                endH = "0" + endH;
            }
            
            if (endM.length() == 1) {
                endM = "0" + endM;
            }

            System.out.println(endH + ":" + endM);
        }
    }
}