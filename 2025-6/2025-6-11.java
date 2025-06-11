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

// 3の倍数の数をカウントする

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 3の倍数があったらansに+1する　それが数と見なせる
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a % 3 == 0) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}

// 7がある？YES/NO

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        // 論地演算　true||false
        //　条件が揃ったら旗上げて上がったかどうかを結果として出力する

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            
            if (a == 7) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}