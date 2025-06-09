// 整数の0番目と3番目を加算(a)　1番目と2番目を加算(b)　aとbを文字列として合わせて出力

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArray = s.split(""); // 文字列を配列に変換する

        // 配列の何番目を取得して整数として計算したら文字列に変換して文字列変数に代入する
        String a = Integer.toString(Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[3]));
        String b = Integer.toString(Integer.parseInt(sArray[1]) + Integer.parseInt(sArray[2]));
        
        System.out.println(a + b);
    }
}

// 数字の文字数に応じて前に0を置く

// わいの回答　冗長だなあおい
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.length() == 1) {
            System.out.println("00"+ a);
        } else if (a.length() == 2){
            System.out.println("0" + a);
        } else {
            System.out.println(a);
        }
    }
}

// 回答コード　これでいけるの快感やろな

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        while (n.length() < 3) { // 3桁になるまで0を足す
            n = "0" + n;
        }
        
        System.out.println(n);
    }
}

// 時刻を表す長さ 5 の文字列 S が “XX:XX” の形式で与えられます。入力された時刻を時と分に分け、時、分の順番で改行区切りで出力

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // 部分文字列を取得し、0を含まない整数にキャストして変数に代入する
        int h = Integer.parseInt(s.substring(0, 2)); //0~1文字目
        int m = Integer.parseInt(s.substring(3, 5)); //3~4文字目
        
        System.out.println(h);
        System.out.println(m);
    }
}
// 部分文字列の取得　
// String.substring(int beginIndex, int endIndex)
// beginIndex この値を含む
// endIndex　この値を含まない


// 時刻を表す文字列に＋30分した時刻を出力する
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        
        if (m + 30 >= 60) {
            h = h + 1;
            m = m + 30 - 60; 
        } else {
            h = h;
            m = m + 30; 
        }

        String newH = Integer.toString(h);
        String newM = Integer.toString(m); 

        if (newH.length() == 1) {
            newH = "0" + newH;
        }
        
        if (newM.length() == 1) {
            newM = "0" + newM;
        }

        System.out.println(newH + ":" + newM);
    }
}