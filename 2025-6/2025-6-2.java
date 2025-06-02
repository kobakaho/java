// 税抜き計算

public class Main {
    public static void main(String[] args) {
        int price = 3500;
        // 少数の計算結果は実数になるので整数にキャストする
        int discountPrince(int)(price * 0.85); // 15%割引価格　
        int amount = (int)(price * 1.10); // 税込み10%
        int person = 5;
        int amountPerPerson = amount / person; // 一人当たり
        int remainder = amount % person; // 一人当たりの余り
    }
}

// whileによるループ処理

public class Main {
    public static void main(String[] args) {
        int i = 0; // カウンタ変数を初期化
        while (i <= 5) { // この条件が成立している間繰り返す処理を実行する
            System.out.println("hello" +  i); //　どんな処理を繰り返すか
            i++; // カウンタ変数を更新　i変数に代入する　更新しないと無限ループになるので処理不可になる
        }
        System.out.println("last" + i); // i=5までのwhileのループを抜けて残ったi=6が出力される
    }
}

public class Main {
    public static void main(String[] args) {
        int hp = 30;
        int hit;
        while (hp > 0) {
            hit = (int)(Math.rondom() * 10 + 1);
            System.out.println(hit+ "のダメージを与えた"); 
            hp == hit
        }
        System.out.println("倒した！");
    }
}

// forによるループ処理
public class Main {
    public static void main(String[] args) {
        // int = i;　forの外でもiを使いたいときは外に出す
        for (int i = 0; i <= 2; i++) { 
            System.out.println("hello" +  i);
        }
        System.out.println("last" + i); //forの中に条件を書いてるのでその外で変数iは使えない
    }
}
