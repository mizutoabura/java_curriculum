package curriculum_25_status;

import java.util.Scanner;

public class Character extends Status{
	
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

		さあ冒険に出かけよう！
	 
	 */
	
	// 名前を入力してもらって値を格納するコンストラクタ
	public Character(Scanner scanner) {
		
		// 名前を変数に代入
		super.setName(myName(scanner));
		
	}
	
	// コンソールにキャラクターのステータスを出力
	public void statusOpen() {
		
		// コンソールに名前を出力
		System.out.println("\nこんにちは 「 "+ super.getName() + " 」 さん");
		// コンソールにステータスを出力
		System.out.println("ステータス");
		// コンソールに体力を出力
		System.out.println("HP:" + getHp());
		// コンソールに魔力を出力
		System.out.println("MP:" + getMp());
		// コンソールに攻撃力を出力
		System.out.println("攻撃力:" + getPower());
		// コンソールに素早さを出力
		System.out.println("素早さ:" + getAgility());
		// コンソールに防御力を出力
		System.out.println("防御力:" + getDefense());
		// コンソールに鼓舞する言葉を出力
		System.out.println("\nさあ冒険に出かけよう！");
		
	}
	
	// キャラクターの名前をコンソールから受け取り値を返すメソッド
	public String myName(Scanner scanner) {
		
		// 変数に受け取った値を代入
		String myName = scanner.nextLine();
		//呼び出しもとに名前を返す
		return myName;
		
	}


}
