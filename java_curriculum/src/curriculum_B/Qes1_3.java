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
		// nameの値が有効(半角英数字)かどうか判定する
		if (Pattern.matches("^[^A-Za-z0-9]+$", name)) {
			
			// コンソールにお願いを出力
			System.out.println("半角英数字のみで名前を入力してください");
		
		}
		// ユーザーネームが10文字を超えた時の処理
		else if (name.length() > 10) {
			
			// コンソールにお願いを出力
			System.out.println("名前を10文字以内にしてください");
		// ユーザーネームが入力されなかった際の処理
		
		}else if (name.length() == 0 || name == null) {
		
			// コンソールにお願いを出力
			System.out.println("名前を入力してください");
		// 上の条件に当てはまらなかった際の処理
		
		}else {
			
			// コンソールにユーザーネーム登録完了の旨を出力
			System.out.println("ユーザー名「" + name +  "」を登録しました");
			// じゃんけんの処理を呼び出し
			judgeJanken(name);
			
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
	public static int getUser() {
		
		// スキャナーインスタンスを作成
		Scanner scannerNum = new Scanner(System.in);
		
		/****************************
		 * 入力されたじゃんけんの値が有効な値になるまで値を受け取る
		 ****************************/
		while(true) {
				
				// 入力されたデータが整数かどうかのチェック
				if (scannerNum.hasNextInt()) {
					
					// 入力されたデータを整数として読み込む
					int userNum = scannerNum.nextInt();
					// 入力された値が0以上2以下の場合
					if(userNum >= 0 &&  userNum <= 2) {
						
						// 0,1,2の場合、メソッドの結果として返す
						return userNum;
						
					// 入力された内容を消す
					}else {
						
						scannerNum.next();
						
					}
				// 入力された内容を消す
				}else {
					
					scannerNum.next();
					
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
					System.out.println(name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」");
					// コンソールにメッセージを出力
					System.out.println("次は俺にリベンジさせて\n");
					// 勝つまでにかかった回数をコンソールに出力
					System.out.println("勝つまでにかかった回数は" + counter + "回です");
					//ループから抜ける(じゃんけん終わり)
					break;
				
				// グーで勝った時の処理
				}else if ((user == 0 && npc == 2)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println(name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち\n負けは次につながるチャンスです！/nネバーギブアップ！");
					counter ++;
					
				// チョキで勝った時の処理
				}else if ((user == 1 && npc == 0)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println(name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					// じゃんけんした回数を増やす
					counter ++;
					
				// パーで勝った時の処理
				}else if ((user == 2 && npc == 1)) {
					
					// ユーザーの手をコンソールに出力
					System.out.println(name + "の手は「" + janken[user] + "」");
					// pcの手をコンソールに出力
					System.out.println("相手の手は「" + janken[npc] + "」\n");
					// コンソールにメッセージを出力
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					// じゃんけんした回数を増やす
					counter ++;
					
				// あいこの時の処理
				}else {
					
					// ユーザーの手をコンソールに出力
					System.out.println(name + "の手は「" + janken[user] + "」");
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



