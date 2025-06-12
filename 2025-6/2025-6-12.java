// 末尾の整数に一致する整数のインデックスを取得する

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n]; //配列を作成する

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); //i番目のarrayに入力された整数を格納する
        }

        int j = sc.nextInt(); // 末尾の整数

        for (int i = 0; i < n; i++) {
            if (array[i] == j) {
                System.out.println(i+1);
                break; //特定の条件が満たされたらループを抜ける
            }
        }
        
    }
}

// 多重ループ

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        String[] c = new String[m];
        // 配列をループ買いに定義しておくとループを抜けても配列が使える

        for (int i = 0; i < m; i++) {
            c[i] = sc.next();
        }

        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        // 配列が二つある状態→二次元配列で要素を取り出せる
        // cが一つ目の要素　sが二つ目の要素　cにはsが含まれるか

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s[j].contains(c[i])) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}


// n人の参加者
// m個の数字を提出できる
// kと一致する数をカウントする

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int[] a = new int[m]; //配列の長さはm個

            for (int j = 0; j < m; j++) {
                a[j] = sc.nextInt(); //m個の整数を配列に代入
                //3 2 1
                //2 "2"この整数を取り込むため
                //1 "2"
                //1 "1"
            }

            int ans = 0;

            for (int j = 0; j < m; j++) {
                if (a[j] == k) {
                    ans += 1;
                }
            }
            
            System.out.println(ans);
        }
    }
}