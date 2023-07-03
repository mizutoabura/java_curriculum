package curriculum_25;

import java.util.Scanner;

import curriculum_25_status.Character;


public class Main {

	public static void main(String[] args) {
		
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！j
		 
		 */
		
		// コンストラクタにお願いを出力
		System.out.println("名前を入力してください");
		// 標準入力で名前を受け取る
		Scanner scanner = new Scanner(System.in);
		// キャラクターのインスタンスを生成
		Character character = new Character();
		// 名前を変数に代入
		character.setName(character.myName(scanner));
		// キャラクターステータスを呼び出し
		character.statusOpen();
		// スキャナーを閉じる
		scanner.close();

	}
	

}
