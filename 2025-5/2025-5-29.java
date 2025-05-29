public class Main {
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println(text);  // Hello world
        System.out.println("hoge " + text);  // hoge Hello world
    }
}

// 入出力

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //　入力されるデータを受け取る準備
        int number = scan.nextInt(); // 入力されたint(整数)を受け取る
        // String text = scan.next();  空白で区切られた単語を受け取る
        // String text = scan.nextLine();  一行の文字列を受け取る
        System.out.println(number); //　入力100の場合　出力100
    }
}

// 条件
// Int
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);

        if (number == 10){ 
        // 代入に使う"="と区別するための"=="
            System.out.println("Hello");
        } else { 
        // Rubyの"elsif"はjavaでは"else if"
            System.out.println("World");
        }
    }
}

// String

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting  = scan.nextInt();

        if (greeting.equals("Hello")){ 
        // 文字列の場合"=="でなく"equals"
            System.out.println("Hello");
        } else { 
            System.out.println("World");
        }
    }
}

// ループ変数

public class Main {
    public static void main(String[] agrs) {
        String greeting = "Hello World";

        for (int i = 0; i < 5; i++) {
        // 初期値 iは0; iを4まで;　iに1ずつ足す
            System.out.println(greeting);
        }
        // i=0 ~ i=4まで5回"Hello World"と出力
    }
}

//　入出力の伴うループ変数

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); // 入力された整数をカウントとして受け取る

        for (int i = 0; i < count; i++) {
            String name = scan.next();
            System.out.println("hello " + name);
        }
        // 入力　3 あ　い　う
        // 出力  hello あ
        //       hello い
        //       hello う
        // 繰り返し条件に満たす回数分入力された文字列を出力する
    }
}