// 3次元配列で複数のドット絵を表示する

public class Main {
    public static void main(String[] args) {

        // 2次元配列
        int[][] enemyImage =
            {{0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0},
             {0,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0},
             {0,0,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}};

        for (int[][] line : enemyImage) {
            for (int dot : line) {
                if (dot == 1) {
                    System.out.println("#");
                } else {
                    System.out.println(" ");
                }
            }
        }
        // 3次元配列
       int[][][] enemyImage =
            {{{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
             {0,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0},
             {0,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0}},
            {{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1},
             {1,1,0,0,0,0,1,1,0,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
             {0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0},
             {0,0,0,0,1,1,1,0,0,0,0,0,0,1,1,1}},
            {{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
             {0,0,1,1,1,0,0,0,0,0,0,1,1,1,0,0},
             {1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0}}};

        // 一つずつ取り出す
        for (int[] line : enemyImage[0]) { //　インデックスを変更すると取り出せる配列が変化する
            for (int dot : line) {
                if (dot == 1) {
                  System.out.println("#");
                } else {
                  System.out.println(" ");
                }
            }
        }
        // 全て取り出す
        for (int[][] img : enemyImage) { // 拡張forドット絵のパターンを一つずつ取り出す
            for (int[] line : img) { // ドット絵のパターンから一行ずつデータを取り出す
                for (int dot : line) { // 各行から0か1の数字を取り出す
                    if (dot == 1) {
                    System.out.println("#");
                    } else {
                    System.out.println(" ");
                    }
                }
            }
        }
    }
}

// 2次元配列で地図を表示する

public class Main {
    public static void main(String[] args) {

      // 縦10列横20行の"森"
      String[][] worldMap = new String[10][20];
      for (int i = 0; i < worldMap; i++) {
        for (int j = 0; j < worldMap[i]; j++) {
            worldMap[i][j] = "森";
            System.out.println(worldMap[i][j]);
        }
      }
      // 左上に城　右上と右下に町
      String[][] worldMap = new String[10][20];
      worldMap[0][0] = "城";
      worldMap[0][19] = "町";
      worldMap[9][19] = "町";

      for (int i = 0; i < worldMap; i++) {
        for (int j = 0; j < worldMap[i]; j++) {
            if (worldMap[i][j] = null) {
              worldMap[i][j] = "森";  //初期値が設定されていない場合のみ"森"
            }
            System.out.println(worldMap[i][j]);
        }
      }

      // 城と町の間を道でつなぐ
      // 偶数行と3で割り入れる列に＋で道を表す

      String[][] worldMap = new String[10][20];
      worldMap[0][0] = "城";
      worldMap[0][19] = "町";
      worldMap[9][19] = "町";

      for (int i = 0; i < worldMap; i++) {
        for (int j = 0; j < worldMap[i]; j++) {
            if (worldMap[i][j] == null) {
                if (i % 2 == 0 || j % 3 == 0) { // 論理和　AかつB
                  worldMap[i][j] = "+";  // 条件が成立するときの初期値
                } else {
                  worldMap[i][j] = "森";  // 初期値が設定されていない場合のみ"森"
                }
            }
        System.out.println(worldMap[i][j]);
        }
      }
    }
}

// 標準入力から2次元配列
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = next.Int();
        int m = next.Int();

        int[][] table = new int[n][m];
        // 標準入力から2次元配列に代入する
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = scan.nextInt();
                // System.out.print(table[i][j]);
            }
        }
        // 入力した複数行のデータにif文して出力
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (table[i][j] == 1) {
                  System.out.print("#");
                } else {
                  System.out.print(" ");
                }
            }
        }
    }
}

//　二次元配列で画像を配置

public class Main {
    public static void main(String[] args) {

        String[] playerImages = {
            "#/Empty.png",
            "#/Dragon.png",
            "#/Crystal.png",
            "#/Hero.png",
            "#/Heroine.png"};
        
        int[][] characterMap = {
            {1,1,1,1},
            {0,0,0,0},
            {2,3,4,2}};
        
        System.out.printLn("<table>");
        for (int[] line : characterMap) {
            System.out.printLn("<tr>");
            for (int imageId : line) {
              System.out.printLn("<td><img src='" + playerImages[imageId] + "'></td>");
            }
        System.out.printLn("</tr>");
        }
        System.out.printLn("</table>");
    }
}

// があむずい！！！！