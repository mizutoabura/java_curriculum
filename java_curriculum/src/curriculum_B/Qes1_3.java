package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
		// Scannerインスタンスを生成し、標準入力を取得
		Scanner scanner = new Scanner(System.in);
		// キーボード入力した内容の「改行までの1行分」を取得
		String name = scanner.nextLine();

		if (Pattern.matches("^[^A-Za-z0-9]+$", name)) {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		else if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}else if (name.length() == 0) {
			System.out.println("名前を入力してください");
		}else {
			System.out.println("ユーザー名「" + name +  "」を登録しました");
			
			
			
			
			
			
			// じゃんけんを定義する
			String[] janken = {"グー","チョキ","パー"};
			// コンピュータの手を取得する
//			int pc = getPc();
			
			// ユーザの手をキーボードから入力してもらう
			int user = getUser();

			int npc = getNpc();
			// Randomインスタンスを生成
			//Random rnd = new Random();
			
			// じゃんけんの勝利数を受け取る変数
			//int npc = rnd.nextInt(3);
			
			
			
			
			System.out.println(name + "の手は「" + janken[user] + "」");
			System.out.println("相手の手は「" + janken[npc] + "」");
			
			
			
		}
		
		// ユーザの手をキーボードから入力してもらう
//		int user = getUser();
		

		
		// 勝敗の判定を行う
//		String result = jugeJanken(user,pc);
		
//		public static int getUser() {
//			Scanner stdin = new Scanner(System.in);
//		}
		

		
	
		// じゃんけんを行った回数を受け取る変数
		//int count = 0;
		
		// じゃんけん参考
		// https://ict-skillup.com/java/1107/#toc3
		
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
//		scannerNum.next();
	}

//	private static int getPc() {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
//	}



}
