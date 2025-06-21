// ソート　昇順

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);// Arraysクラス

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]); // 配列を順番に出力する
        }
    }
}

// ソート　降順
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Integer[] a = new Integer[n]; // intだとエラー

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}