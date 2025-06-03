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

