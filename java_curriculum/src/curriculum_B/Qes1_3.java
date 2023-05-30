package curriculum_B;

import java.util.InputMismatchException;
//import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		
		boolean stopFlag = false;
				
		while (true) {
			System.out.println("ユーザー名を入力してください");
			// Scannerインスタンスを生成し、標準入力を取得
			Scanner scanner = new Scanner(System.in);
			// キーボード入力した内容の「改行までの1行分」を取得
			String name = scanner.nextLine();
			// nameの値が有効(半角英数字)かどうか判定する
			if (Pattern.matches("^[^A-Za-z0-9]+$", name)) {
				
				// コンソールにお願いを出力
				System.out.println("半角英数字のみで名前を入力してください");
			
			}
			// ユーザーネームが10文字を超えた時の処理
			else if (name.length() > 10) {
				
				// コンソールにお願いを出力
				System.out.println("名前を10文字以内にしてください");
			
			
			} 
			// ユーザーネームが入力されなかった際の処理
			else if (name.length() == 0 || name == null) {
			
				// コンソールにお願いを出力
				System.out.println("名前を入力してください");
			
			
			} 
			// 上の条件に当てはまらなかった際の処理
			else {
				
				// コンソールにユーザーネーム登録完了の旨を出力
				System.out.println("ユーザー名「" + name +  "」を登録しました");
				System.out.print("じゃんけんの手を入力してください" ) ;
				// じゃんけんの処理を呼び出し
				judgeJanken(name);
				break;
				
			}	
		}
	}
	/****************************
	 * pcのじゃんけんの手をランダムで生成する
	 ****************************/
	public static int  getNpc() {
		
		// ランダムインスタンスを作成
		Random rand = new Random();
		//0～2までの数字を呼び出しもとに返す
		return rand.nextInt(3);	
	
	}
	
	/****************************
	 * pcのじゃんけんの手をランダムで生成する
	 ****************************/


	
		/****************************
		 * 入力されたじゃんけんの値が有効な値になるまで値を受け取る
		 ****************************/
	
//	public static int getUser() {
//
//	while (true){
//		Scanner scannerNum = new Scanner(System.in);
//		String userNum = scannerNum.nextLine();
//		if (userNum.isEmpty()) {
//			continue;
//		} else if (scannerNum.hasNextInt()) {
//			int returnNum = Integer.parseInt(userNum);
//			if (returnNum >= 0 &&  returnNum <= 2) {
//			return returnNum;
//			}else {
//				continue;
//			}
//		}else {
//			continue;
//		}
//			
//	}
//}
	
	public static int getUser() {
		Scanner scannerNum = new Scanner(System.in);
		while (true) {
			int inputNum = scannerNum.nextInt();
			if ((inputNum > 2 )||( inputNum < 0)) {
				// throwで例外(NullPointerException)を投げる
				throw new InputMismatchException();
				}
		}
	}
	
	
	/****************************
	 * じゃんけんの勝ち負けを判定する処理
	 ****************************/
	public static void judgeJanken(String name) { 
		
		// 勝つまでにかかった回数を受け取る変数
		int counter = 1;
		// じゃんけんの手を配列に格納
		String[] janken = {"グー","チョキ","パー"};
			// 勝つまでじゃんけんの処理を繰り返す
			while(true) {
				
				// ユーザーの手を受け取る
				int user = getUser();
				// pcでランダムに生成された手を受け取る
				int npc = getNpc();
				// じゃんけんに勝った時の処理
				if ((user == 0 && npc == 1) || (user == 1 && npc == 2) || (user == 2 && npc == 0)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println("\n" + name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("次は俺にリベンジさせて\n");
					// 勝つまでにかかった回数をコンソールに出力
					System.out.println("勝つまでにかかった回数は" + counter + "回です");
					//ループから抜ける(じゃんけん終わり)
					break;
				
				// グーで勝った時の処理
				}else if ((user == 0 && npc == 2)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println("\n" + name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち\n負けは次につながるチャンスです！\nネバーギブアップ！");
					counter ++;
					
				// チョキで勝った時の処理
				}else if ((user == 1 && npc == 0)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println("\n" + name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					// じゃんけんした回数を増やす
					counter ++;
					
				// パーで勝った時の処理
				}else if ((user == 2 && npc == 1)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println("\n" + name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					// じゃんけんした回数を増やす
					counter ++;
					
				// あいこの時の処理
				}else {
					
					// ユーザーの手をコンソールに出力
					System.out.println("\n" + name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("DRAW あいこ もう一回しましょう！");
					// じゃんけんした回数を増やす
					counter ++;
					
				}
				
			}
			
		}
	
	}



