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


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] ab = new String[n];

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.length() == 1) {
                a = "0" + a;
            }
            
            if (b.length() == 1) {
                b = "0" + b;
            }

            ab[i] = a + b;
        }

        Arrays.sort(ab, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.println(Integer.parseInt(ab[i].substring(0,2)) + " " + Integer.parseInt(ab[i].substring(2,4)));
        }
    }
}