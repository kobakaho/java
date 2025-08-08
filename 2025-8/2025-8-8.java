import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> sa = new HashMap<>();
        // Map　「キー」を「値」に紐づけるデータ構造
        // キーと値のペアをマップに追加　マップを初期化して使えるようにしてる
        // 「キー」は値につける名前　
        // 値ひとつひとつに「キー」が存在し、「キー」と「値」がペアになっているのがMapの特徴
        // マップに対してキーを指定することで、対応する値を取得できる

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int a = sc.nextInt();

            sa.put(s, a);
            // Mapに要素を追加する
        }

        System.out.println(sa.get(sc.next()));
        // =は代入　今回は代入したいわけではない　
        // next()はScannerクラスのメソッド＆for抜けてるから使える
        // Scannerを使って文字列を入力しその文字列をキーとしてHashMapから値を取得
        // 出力できるのは「値」
    }
}


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String name = sc.next();
        }

        int attack = sc.nextInt();
        HashMap<String, Integer> sa = new HashMap<>();

        for (int i = 0; i < attack; i++) {
            String a = sc.next();
            int b = sc.nextInt();

            sa.put(a, b);
        }

        System.out.println(sa.get(sc.next()));
    }
}