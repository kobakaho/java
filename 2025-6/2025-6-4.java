// 演習問題の復習
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        String data; //文字列を格納するための変数dataを宣言
        for (int i = 0; i < count; i++) {
            data = scan.next();
            System.out.println(data);
        }
        // ⇓
        for (int i = 0; i < count; i++) {
            String data = scan.next(); // ループ処理が終わると変数dataは使えなくなる
            System.out.println(data);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        for (int seireki = 1926; seireki <= 1988; seireki++) {
          System.out.print("西暦" + seireki + "年は");
          int shouwa = seireki - 1925;
          System.out.println("昭和" + shouwa + "年です");
        }

          // ⇓

        int seirek, shouwa; //　先に変数を宣言している、ループを抜けてもデータが使える

        for (seireki = 1926; seireki <= 1988; seireki++) { // データ型を書かなくてよくなる
            System.out.print("西暦" + seireki + "年は");
            shouwa = seireki - 1925;
            System.out.println("昭和" + shouwa + "年です");
        }
    }
}

// 配列


public class Main {
    public static void main(String[] args) {
        String[] array = {"おにぎり","炒飯"}; //0から数え始める
        System.out.println(array[0]);

    }
}

// 配列から特定の要素を取り出す

public class Main {
    public static void main(String[] args) {
        int num = 0; //変数numを定義
        String[] array = {"おにぎり","炒飯"} 
        System.out.println(array[num]); // おにぎり
        System.out.println(array[num + 1]); // 炒飯

    }
}
