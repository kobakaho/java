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

