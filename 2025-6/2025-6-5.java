// 配列から特定の要素を取り出す

public class Main {
    public static void main(String[] args) {
        String[] array;
        array = new String[2]; // 配列の長さ
        array[0] = "おにぎり";
        array[1] = "炒飯";
        System.out.println(array[0]); // おにぎり
        System.out.println(array[1]); // 炒飯
        System.out.println(array[10]); // 配列の範囲外はエラーを吐く
        // どのくらいの配列を用意しておくかあらかじめ考えておく必要がある

    }
}

//  ループ処理を使って配列を処理する

public class Main {
    public static void main(String[] args) {
        String[] array = {"犬","猿","キジ"};
        System.out.println(array[0]); 
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array.length);// length 配列の長さ　末尾に()が要らないので注意

        for (int i = 0; i < 5; i++) {
          System.out.println(i) //犬猿キジ301234
        }

        // ⇓　ループで配列の要素を取得する

        String[] array = {"犬","猿","キジ"};
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]) //3犬猿キジ
        }
    }
}

// 拡張for文

public class Main {
    public static void main(String[] args) {
        String[] array = {"犬","猿","キジ"};
        // 配列と取り出す変数のみを指定
        for (String member : array) { // 配列を一つずつ取り出しmember変数に代入
          System.out.println(member) //犬猿キジ member変数を出力
        }

        //プルダウンにしてみる

        System.out.println("<select name='job'>");
        for (String member : array) { // 配列を一つずつ取り出しmember変数に代入
          System.out.println("<option>"+member+"</option>") //犬猿キジ member変数を出力
        }
        System.out.println("</select>");
    }
}
 
// ArrayListクラス  とは　配列の要素を後から変更することができるなど　便利らしい

import java util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(); //　array配列の宣言　ArrayListクラス

        array.add("猿"); // addメソッド　要素を追加
        array.add("犬");
        System.out.println(array.get(1)); //猿　getメソッド配列から要素を取得　取得したいインデックスを指定できる
        System.out.println(array.size()); //2 sizeメソッド配列の長さを取得
        array.set(1,"キジ");  //猿キジ setメソッド配列の要素を更新　インデックスを指定して更新する
        array.remove(1); //猿 removeメソッド配列の要素を削除　インデックスの指定のみで可能
        
        for (String member : array) {
          System.out.println(member);
        }

    }
}

// splitで文字列を分割する

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine(); //入力　タツ,トリ,バッタ
        System.out.println(data);  //出力　タツ,トリ,バッタ

        String[] array = data.split(","); //引数で指定した文字で分割して配列に格納
        System.out.println(array[1]);  //出力　タツ
        System.out.println(array.length);  //出力　3

        for (String belt : array) {
          System.out.println(belt + "!"));  //出力　タツ! トリ! バッタ!
        }

    }
}

// 複数行の標準入力を読み込む

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>(); //ArrayListクラスを準備

        while (scan.hasNextLine()) { // hasNextLineメソッド　入力する行がまだあるか確認する　空の行も出力する
            String data = scan.nextLine(); //入力　桃太郎さん　どんぶらこゆうて（改行）
            array.add(data) //arrayに入力されたdata変数を追加
            // System.out.println(data);  //出力　桃太郎さん　どんぶらこゆうて（改行）
        } //複数行の読み込みが終了したらループも終了

        for (String str : array) {
            System.out.println(str);  //出力　桃太郎さん　どんぶらこゆうて（改行）
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine(); //入力　タツ,トリ,バッタ

        String[] array = data.split(",");

        for (String belt : array) {
          System.out.println(belt + "が現れた"));  //出力　タツが現れた トリが現れた バッタが現れた
        }

        int num = belt.length; //belt配列の長さ
        double rand = Math.random() * num;
        int attack = (int)rand;
        System.out.println(array[attack]+"が会心の一撃！"); //タツ(ココがランダムに変化)が会心の一撃！
    }
}

//ここまで入門編４