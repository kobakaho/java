// ソート
// 1. 持っている銀が多い方が財産が多い
// 2. 持っている銀が同じなら、持っている金が多い方が財産が多い
// 財産を多い順に並び替えて出力

// 入力例1
// 2
// 2 1
// 1 2

// 出力例1
// 1 2
// 2 1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] sg = new String[n]; //文字列で配列を作成

        for (int i = 0; i < n; i++) {
            String g = sc.next();
            String s = sc.next();

            if (g.length() == 1) {
                g = "0" + g;
            }

            if (s.length() == 1) {
                s = "0" + s;
            }
            
            sg[i] = s + g; //入力された数字をそれぞれ10ケタの値にして合体　i番目の配列として格納
        }

        Arrays.sort(sg, Collections.reverseOrder()); // 配列を取得し降順にソート

        for (int i = 0; i < n; i++) { 
            System.out.println(Integer.parseInt(sg[i].substring(2,4)) + " " + Integer.parseInt(sg[i].substring(0,2)));
        } //　配列の何番目の文字を取得し整数に変換して出力
    }
}