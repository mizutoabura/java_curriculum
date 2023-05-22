package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// スキャナーインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// コンソールに入力された値を受け取る
		String getName = sc.next();
		// コンソールで受け取った値を、で区切って配列で受け取る
		String[] names = getName.split("、");
		// 拡張for文で配列に受け取った値の在庫数を出力する処理
		for (String name : names) {
			
			// 値ごとの処理
			switch (name) {
			
			 	// 値がパソコンの時の処理
				case "パソコン":
				// パソコンの在庫数をコンソールに出力
				System.out.println("パソコン" + "の残りの台数は"+ rNum() + "台です");
				break;
				// 値が冷蔵庫の時の処理
				case "冷蔵庫":
				// 冷蔵庫の在庫数をコンソールに出力
				System.out.println("冷蔵庫" + "の残りの台数は"+ rNum() + "台です");
				break;
				// 値が扇風機の時の処理
				case "扇風機":
				// 扇風機の在庫数をコンソールに出力
				System.out.println("扇風機" + "の残りの台数は"+ rNum() + "台です");
				break;
				// 値が洗濯機の時の処理
				case "洗濯機":
				// 洗濯機の在庫数をコンソールに出力
				System.out.println("洗濯機" + "の残りの台数は"+ rNum() + "台です");
				break;
				// 値が加湿器の時の処理
				case "加湿器":
				// 加湿器の在庫数をコンソールに出力
				System.out.println("加湿器" + "の残りの台数は"+ rNum() + "台です");
				break;
				// 値がテレビの時とディスプレイの時の処理
				case "テレビ":
				case "ディスプレイ":
				// テレビとディスプレイの在庫数をコンソールに出力
				System.out.println(name + "の残りの台数は"+ rNum() + "台です");
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
