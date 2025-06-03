// ループ処理を使ってプルダウンをhtml形式で表現する

public class Main {
    public static void main(String[] args) {
        System.out.println("<select name='age'>");
        for (int i = 1; i <= 100; i++) {
            System.out.println("<option>" + i + "歳</option>"); //変数iを""で囲むと文字列と認識されるので注意
        }
        System.out.println("</select>");
    }
}

//　複数データを読み込む標準入力

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.next();
        System.out.println("hello" + data);

        data = scan.next(); //2行のデータを読み込むときnextメソッドを二回呼び出す必要がある
        System.out.println("hello" + data);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); 
        System.out.println(count);

        String data;
        for (int i = 0; i < count; i++){ //入力下整数がcount変数に代入される
          data = scan.next();
          System.out.println("hello" + data);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int seireki, heisei;
        for (seireki = 1989; seireki <= 2016; seireki++){ //入力下整数がcount変数に代入される
          System.out.print("西暦" + data + "年は");
          heisei = seireki - 1988;
          System.out.print("平成" + heisei + "年です");
        }
    }
}

//ここまで入門編３　chapter8・9の練習問題難易度あがってるからもう一回する