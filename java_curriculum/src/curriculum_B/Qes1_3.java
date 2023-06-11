package curriculum_B;

import java.util.Objects;
//import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		
		// 入力された名前を格納する変数
		String name = "";
		// 条件チェック
		boolean okCheck = false;
		// Scannerインスタンスを生成し、標準入力を取得
		Scanner scanner = scanner();
		
		// 正しい名前が入力されて、じゃんけんに勝てるまで繰り返す
		while (!okCheck) {
			
			// コンソールにお願いを出力
			System.out.println("ユーザー名を入力してください");
			
			// Stringとして一行取得
			name = scanner.nextLine();
			
			// nullと空の時の処理
			if (Objects.isNull(name) || name.isEmpty()) {
				
				// コンソールにメッセージを出力
				System.out.println("nullです！名前を入力してください\n");
				// エラーが出たとき終わる処理
				System.exit(0);
				
			}
			// nameの値が有効(半角英数字)かどうか判定する
			if (Pattern.matches("[^A-Za-z0-9]+$", name)) {
				
				// コンソールにお願いを出力
				System.out.println("半角英数字のみで名前を入力してください\n");
			
			}
			// ユーザーネームが10文字を超えた時の処理
			else if (name.length() >= 10) {
				
				// コンソールにお願いを出力
				System.out.println("名前を9文字以内にしてください\n");
			
			} 
			// 上の条件に当てはまらなかった際の処理
			else {
				
				// コンソールにユーザーネーム登録完了の旨を出力
				System.out.println("\nユーザー名「" + name +  "」を登録しました");
				// ループから抜ける処理
				okCheck = true;
				
			}
			
		}
		
		// コンソールにお願いを出力
		System.out.print("\nじゃんけんの手を入力してください" ) ;
		// じゃんけんの処理を呼び出し
		judgeJanken(name);
		// スキャナーを閉じる
		scanner.close();
		
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
	 * 標準入力取得できるようにする
	 ****************************/
	public static Scanner scanner () {
		
		// スキャナーインスタンスを作成して標準入力で値を受け取る
		Scanner scanner = new Scanner(System.in);
		// スキャナーの値をメゾット呼び出しもとに渡す
		return scanner;
		
	}


	/****************************
	 * 入力されたじゃんけんの値が有効な値になるまで値を受け取る
	 ****************************/
	public static int getUser() {
		
		// ユーザーからうけっとた値が正しい場合数字を格納する変数　※初期化の際0だと都合が悪いため、好きな数字を入れました
		int returnNum = 0;
		
		// 条件チェック
		boolean okCheck = false;
		
		// 正しい値を受け取るまで入力を繰り返す
		while (!okCheck) {
			
			// スキャナーで受け取った値を変数に格納
			Scanner scanner = scanner();
			// Stringとして一行取得
			String userNum =scanner.nextLine();
			
				// nullと空の時の処理
				if (Objects.isNull(userNum) || userNum.isEmpty()) {
					
					// コンソールにメッセージを出力
					System.out.println("nullか空です");
					// エラーが出たとき終わる処理
					System.exit(0);
					
				}
				// 受け取った値が0,1,2の時の処理
				else if(Pattern.matches("[0-2]", userNum)) {
					
					// 0～2以外の文字を空白に置き換え
					String intStr = userNum.replaceAll("[^0-2]", "");
					// 文字から数値に変換して変数に格納
					returnNum = Integer.parseInt(intStr);
					// 処理を終える
					okCheck = true;
					
				}
				// それ以外の場合の処理
				else {

					System.out.println("文字が入っている、改行または0～2じゃないよ\n");

				}

		}

		// 受け取った値を返す
		return returnNum;
		
	}
	
	
	/****************************
	 * じゃんけんの勝ち負けを判定する処理
	 ****************************/
	public static void judgeJanken(String name) {
		
		// じゃんけんの手を初期化
		int user = 0;
		// じゃんけんの手を初期化
		int npc = 0;
		
		// 勝つまでにかかった回数を受け取る変数
		int counter = 1;
		
		// 条件チェック
		boolean okCheck = false;
		
		// じゃんけんの手を配列に格納
		String[] janken = {"グー","チョキ","パー"};
		
		// じゃんけんのコメントを配列に格納
		String[] coment = {"俺の勝ち\n負けは次につながるチャンスです！\nネバーギブアップ！"
							,"俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ"
							,"俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです"
		};
			
		// 勝つまでじゃんけんの処理を繰り返す
		while(okCheck == false) {
			
			// ユーザーの手を受け取る
			user = getUser();
			// pcでランダムに生成された手を受け取る
			npc = getNpc();
			
			// ユーザーの手をコンソールに出力
			System.out.println("\n" + name + "の手は「" + janken[user] + "」");
			// pcの手をコンソールに出力
			System.out.println("相手の手は「" + janken[npc] + "」\n");
			
			// あいこの時の処理
			if (user == npc) {
				
				// コンソールにメッセージを出力
				System.out.println("DRAW あいこ もう一回しましょう！\n");
				// じゃんけんした回数を増やす
				counter ++;
				
			}
			// 自分がじゃんけんで負けた場合の処理
			else if ((user == 0 && npc == 2) || (user == 1 && npc == 0) || (user == 2 && npc == 1)) {
				
				// コンソールにメッセージを出力
				System.out.println(coment[npc] + "\n");
				// じゃんけんした回数を増やす
				counter ++;
				
			}
			// じゃんけんに勝った時の処理
			else {
				
				// コンソールにメッセージを出力
				System.out.println("やるやん。\n次は俺にリベンジさせて\n\n勝つまでにかかった回数は" + counter + "回です");
				// 処理を終える
				okCheck = true;

			}
			
		}
			
	}
	
}


