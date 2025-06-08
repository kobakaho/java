// メソッド

public class Main {
    public static void main(String[] args) {
        System.out.println("hello";)
        sayHello(); // hello 定義したメソッドの呼び出し
    }

    // メソッド名　最初の文字は慣習として小文字！！動詞と名詞を組み合わせると良い
    public static void sayHello() { // {}ブロック
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        sum(); 
        sum1(30); // 引数があるときsum1(x)に渡される
        sum2(10,20); 
        int num1 = sum3(3, 2);
        System.out.println(num1); // 5
    }

    // void 戻り値を戻さないときに指定する
    public static void sum() {
        System.out.println(10 + 20);
    }
    public static void sum1(int x) { // 引数のデータ型を追加
        System.out.println(x + 20);
    }
    public static void sum2(int x, int y) {
        System.out.println(x + y);
    }
    
    // メソッドで戻り値を返すときはメソッド定義のvoidをデータ型に合わせる
    // sum3メソッドを呼び出して引数を使って計算し、計算結果を戻り値にしてnum1変数に代入しptintlnメソッドで出力
    public static int sum3(int x, int y) {
        return x + y;
    }
}

// 九九の票を出力する

public class Main {
    public static void main(String[] args) {
        for (int num1 = 1; num1 <= 9; num1++) { 
            for (int num = 1; num <= 9; num++) {
                System.out.print(multi(num1,num));
                if (num < 9) {
                    System.out.print(", ");
                } else {
                    System.out.println("");
                }
            }
        }
    }
    public static int multi(int x, int y) {
        return x * y;
    }
}


// スコープ　変数の有効範囲のこと
// あるメソッド定義と別のメソッド定義では、変数のスコープは分離しており、同じ名前の変数であっても独立して利用できる
// ローカル変数　ブロックの中で定義された変数のこと

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int num = sum(a, b);
        System.out.println(num); // 30
        System.out.println("hello" + a); // hello 10
    }
    
    //　有効な変数はブロックごとに独立している
    public static int sum(int x, int y) {
        int a = 5;
        System.out.println("hello" + a); // hello 5
        return x + y;
    }    
}

// RPGの攻撃シーンを作ろう

public class Main {
    public static void main(String[] args) {
      String[] enemies = {"スライム", "モンスター", "ドラゴン"};
      for (String enemy : enemies) {
        attack(enemy)
      }
    }

    public static void attack(String target) {
      System.out.println(target + "を攻撃した"); 
      int hit = (int)(Math.rondom()* 10 + 1);
      if (hit < 6) {
        System.out.println(target + "に"+ hit + "のダメージを与えた"); 
      } else {
        System.out.println(target + "に100のダメージを与えた"); 
      }  
    }
}

// 演習問題　メソッド呼び出してどの引数が戻り値になってるか等々がむずい！！！

public class Main {
    public static void main(String[] args) {
        String[] team = {"勇者", "戦士", "魔法使い"};
        int enemy_hp = 300;
        for (String person : team) {
            // 以下の行を、敵の体力を減少させるコードに書き換える
            int hit = attack(person);
            enemy_hp = enemy_hp - hit;
            System.out.println("敵のHPは残り" + enemy_hp + "です");
        }
    }

    public static int attack(String player) {
        System.out.println(player + "はスライムを攻撃した");
        int hit = (int) (Math.random() * 10 + 1) * 10;
        System.out.println(hit + "のダメージを与えた");
        return hit;
    }
}
// ここまでCランク相当
