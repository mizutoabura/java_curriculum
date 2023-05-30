package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// スキャナーインスタンスを作成
		Scanner sc = new Scanner(System.in);
		
		// コンソールで受け取った値を、で区切って配列で受け取る
		String[] names = sc.next().split("、");
		
		int tv = rNum();
		int dp = 11 - tv;
		

		// 拡張for文で配列に受け取った値の在庫数を出力する処理
		for (String name : names) {
			
			// 値ごとの処理
			switch (name) {
			
			 	// 値がパソコンの時の処理
				case "パソコン":
				
				// 値が冷蔵庫の時の処理
				case "冷蔵庫":
					
				// 値が扇風機の時の処理
				case "扇風機":
					
				// 値が洗濯機の時の処理
				case "洗濯機":
					
				// 値が加湿器の時の処理
				case "加湿器":
					
					// 入力された家電のの在庫数をコンソールに出力
					System.out.println(name + "の残りの台数は"+ rNum() + "台です" + "\n");
					break;

				// 値がテレビの時とディスプレイの時の処理
				case "テレビ": 
				case "ディスプレイ":
					int num = name.equals( "テレビ") ? tv : dp;
					System.out.println(name + "の残りの台数は"+ num  + "台です" + "\n");
					break;
					
				// その他の場合の処理
				default:
					// コンソールにコメントを出力
					System.out.println("『 " + name + " 』は指定の商品ではありません");
			
			}
			
		}
		
	}
	
	/****************************
	 * 在庫数を0～11までの数字でランダムで生成
	 ****************************/
	public static int rNum () {
		
		// ランダムインスタンスを生成
		Random rand = new Random();
		// ランダムで生成した値を呼び出しもとに返す
		return rand.nextInt(12);
		
	}

}
