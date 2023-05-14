package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		
		
		
		// Scannerインスタンスを生成し、標準入力を取得
		Scanner scanner = new Scanner(System.in);
		// キーボード入力した内容の「改行までの1行分」を取得
		String name = scanner.nextLine();
		// nameの値が有効かどうか判定する
		if (Pattern.matches("^[^A-Za-z0-9]+$", name)) {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		else if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}else if (name.length() == 0) {
			System.out.println("名前を入力してください");
		}else {
			System.out.println("ユーザー名「" + name +  "」を登録しました");
			
			judgeJanken(name);
			
		}	
	}

	public static int  getNpc() {
		Random rand = new Random();
		return rand.nextInt(3);	
	}
	
	public static int getUser() {
		Scanner scannerNum = new Scanner(System.in);
		
		while(true) {
		// 入力されたデータが整数かどうかのチェック
		if (scannerNum.hasNextInt()) {
			// 入力されたデータを整数として読み込む
			int userNum = scannerNum.nextInt();
			if(userNum >= 0 &&  userNum <= 2) {
				// 0,1,2の場合、メソッドの結果として返す
				return userNum;
			}else {
				scannerNum.next();
			}
		}else {
			scannerNum.next();
		}
		}
	}
	
	public static void judgeJanken(String name) { 
		int counter = 1;
		String[] janken = {"グー","チョキ","パー"};
			while(true) {
				int user = getUser();
				int npc = getNpc();
				if ((user == 0 && npc == 1) || (user == 1 && npc == 2) || (user == 2 && npc == 0)) {
					System.out.println(name + "の手は「" + janken[user] + "」");
					System.out.println("相手の手は「" + janken[npc] + "」");
					System.out.println("次は俺にリベンジさせて\n");
					System.out.println("勝つまでにかかった回数は" + counter + "回です");
					break;
				}else if ((user == 0 && npc == 2)) {
					System.out.println(name + "の手は「" + janken[user] + "」");
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					System.out.println("俺の勝ち\n負けは次につながるチャンスです！/nネバーギブアップ！");
					counter ++;

				}else if ((user == 1 && npc == 0)) {
					System.out.println(name + "の手は「" + janken[user] + "」");
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					counter ++;
				}else if ((user == 2 && npc == 1)) {
					System.out.println(name + "の手は「" + janken[user] + "」");
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					counter ++;
				}else {
					System.out.println(name + "の手は「" + janken[user] + "」");
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					System.out.println("DRAW あいこ もう一回しましょう！");
					counter ++;
				}
			}
		}
	
	}



