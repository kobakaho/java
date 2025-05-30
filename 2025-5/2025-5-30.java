//　条件の伴うループ変数

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            System.out.println(number); // 入力(先頭がcount)"3 10 15 7" 出力"10 15 7"

            if (number == 10) {
                System.out.println(number + "は10に等しい");
            } else if (number > 10) {
                System.out.println(number + "は10より大きい");
            } else {
                System.out.println(number + "は10未満");
            } //入力した整数を変数numberで受け取って条件に合わせて出力を変化させる
        }
    }
}

// 代入

public class Main {
    public static void main(String[] args) {
        String player = "勇者"; // 代入
        System.out.println(player); // 勇者
        System.out.println(player + "が闘う") // 勇者が闘う
    }
}

// ランダムメソッド

public class Main {
    public static void main(String[] args) {
        double rand = Math.random() * 3 + 5; //*3何個の数から一つを選ぶのか　+5選ばれる数値がいくつから始まるか
        System.out.println(rand);  // 0から1未満（少数点）の値をランダムに出力する
        int number = (int)rand; // 少数点以下を切り捨て整数のみを出力
        int number = (int)(Math.random() * 3 + 1) * 100; // 1から始まる3つの整数を*100ずつランダムに出力
        System.out.println(number); 
    } //　出力結果：戻り値　メソッドに与えるデータ()の部分：引数
}

// 比較演算子

//  利用例	       意味	        真になる例
//  a < b	a が b よりも小さい	 10 < 15
//  a > b	a が b よりも大きい	 10 > 7
// a <= b	a が b 以下である	 10 <= 15
// a >= b	a が b 以上である	 10 >= 7
// a != b	a と b が等しくない	 10 != 1
