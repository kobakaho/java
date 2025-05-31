// 指定した西暦から平成を求める

public class Main {
    public static void main(String[] args) {
        int seireki = 2000;
        System.out.print("西暦" + seireki + "年は、"); // lnは改行する　Rubyのputsと一緒？

        // 西暦と平成年の差は1988

        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です。");
    }
}

//　現在の西暦を平成に変換する

import java.util.Calendar; //プログラミング上の部品を読み込む（Calendarクラス）

public class Main {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance(); //読み込んだカレンダー部品を使えるようにする(calenderはカレンダーに関する情報を扱うためのオブジェクト)    
        int seireki = calender.get(Calendar.YEAR); // calenderオブジェクトから現在の西暦を取得する（Calendar.YEARを引数に指定し年の情報をリクエスト）
        System.out.print("西暦" + seireki + "年は、");

        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です。");
    }
}

// AND（論理積）条件

public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        if (number1 == 1 && number2 == 2) { // AかつBを満たす
            System.out.print("スキ！");
        } else {
            System.out.print("キライ");
        } 
        int number3 = 30; 
        if (number3 >= 30 && number3 <= 60) { // 30以上60以下
        // "="は"後半"にくる
        }

    }
}

// OR（論理和）条件

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;

        if (number1 == 1 || number2 == 2) { // AまたはBを満たす |はパイプと読む
            System.out.print("スキ！");
        } else {
            System.out.print("キライ");
        } 
    }
}

//　論理演算(boolean)

public class Main {
    public static void main(String[] args) {
        int number = 0;
        boolean flag = number == 1; // boolean 論理型を表すデータ型(true || false)
        // "=="は"="より先に処理する
        if (flag) { 
            System.out.print("スキ！");
        } else {
            System.out.print("キライ");
        } 
        System.out.println(flag)
    }
}

// データ型


public class Main {
    public static void main(String[] args) {
        System.out.println(10 / 3); // 3 整数同士の計算結果は整数
        System.out.println(10 / 3.0); // 3.333333333335　整数と少数の計算結果は少数
        
        // データのキャスト(データ型を変換する)
        double number1 = 3.14;
        System.out.println(number1); // 3.14
        System.out.println((int)number1); // 3 少数点を切り捨てて整数に変換する
        
        int number2 = 3;
        System.out.println((double)number2); // 3.0 整数を小数点のある実数に変換する
        
        String text = "123";
        System.out.println(Integer.parseInt(text) * 10); // 1230 parseInt　文字列を整数に変換する
        System.out.println(Double.parseDouble(text)); // 123.0 文字列を小数点のある実数に変換する
    }
}
