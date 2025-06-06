// 2次元配列 
// とは　2つのインデックスで要素を指定する配列　ゲームの盤面　表形式データ等々　便利ちゃん

public class Main {
    public static void main(String[] args) {
        String player = "忍者";
        String[] teamA = {player, "戦士", "魔法使い"};
        String[] teamB = {teamA[0], teamA[1], teamA[2]}; //インデックスを指定して新しい配列に代入できる

        String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "商人"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};

        String[][] teams = {teamC, teamD, teamE}; // 2次元配列に配列を代入
        String[][] teams1 = {{"勇者", "戦士"},{"盗賊", "忍者", "商人"},{"スライム", "ドラゴン", "魔王"}} // 2次元配列を直接作成できる
        
        System.out.println(teams[0][0]); // 勇者
        System.out.println(teams[1][2]); // 商人
        System.out.println(teams[2][1]); // ドラゴン

        teams[0][0] = "魔導士"; // 要素を更新
        System.out.println(teams.length); // 3 teams配列の要素数
        System.out.println(teams[0].length); // 2 teams配列のインデックス0の要素数
    }
}

// 2次元配列をループで処理する

public class Main {
    public static void main(String[] args) {
        String[][] teams = {{"勇者", "戦士", "魔法使い"},{"盗賊", "忍者", "商人"},{"スライム", "ドラゴン", "魔王"}} // 2次元配列を直接作成できる
        
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.print(teams(i)); //teams配列のインデックスの値
                System.out.print(teams(j)); //teams配列のインデックスiのインデックスの値
                // 00 01 02
                // 10 11 12
                // 20 21 22
                System.out.print(teams[i][j]); //teams配列の各要素を出力
                // 勇者 戦士 魔法使い
                // 盗賊 忍者 商人
                // スライム ドラゴン 魔王
            }
        }
        // 拡張for文
        for (String[] team : teams) {
            for (String player : team) {
                System.out.print(player);
                // 勇者 戦士 魔法使い
                // 盗賊 忍者 商人
                // スライム ドラゴン 魔王
            }
        }
    }
}

// 2次元配列をnewメソッドで作成する　新しい配列を作る
// これムズイぞ！！！！

public class Main {
    public static void main(String[] args) {
        int[] numberA = new int[10];
        
        for (int i = 0; i < numberA.length; i++) {
            numberA[i] = i;
            System.out.println(numberA[i]); // 0123456789
        }
        System.out.println(numberA.length); // 10

        int[][] numberB = new int[3][4];
        for (int i = 0; i < numberB.length; i++) {
            for (int j = 0; j < numberB[i].length; j++) {
                numberB[i][j] = i * 10 + j;
                System.out.println(numberB[i][j]);
            }
        }
        // 縦3行 横4列の2次元配列
        // 0 1 2 3
        // 10 11 12 13
        // 20 21 22 23
    }
}

// 初期値を設定する

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0;  j < array[i].length; j++) {
                //この下で、初期値を指定する
                array[i][j] = 1;

                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
