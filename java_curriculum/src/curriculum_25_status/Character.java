package curriculum_25_status;

import java.util.Objects;
import java.util.Random;
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
	public Character(){}
	
	// コンソールにキャラクターのステータスを出力
	public void statusOpen() {
		
		setStatus();
		
		if(Objects.isNull(super.getName()) ||  super.getName().isEmpty()) {
			
			System.out.println("ステータスの表示には名前の入力が必要です。");
			
		}else {
			
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

		
	}
	
	// キャラクターの名前をコンソールから受け取り値を返すメソッド
	public String myName(Scanner scanner) {
		
		// 変数に受け取った値を代入
		String myName = scanner.nextLine();
		
		if(Objects.isNull(myName) ||  myName.isEmpty()) {
			
			System.out.println("\n名前が入力されていません。");
			
		}
		
		//呼び出しもとに名前を返す
		return myName;
		
	}
	
	public void setStatus() {
		
		// ランダムインスタンスを生成
		Random rnd = new Random();
		// 体力に0～999までの値をランダムで代入
		setHp(rnd.nextInt(1000));
		// 魔力に0～999までの値をランダムで代入
		setMp(rnd.nextInt(1000));
		// 攻撃力に0～999までの値をランダムで代入
		setPower(rnd.nextInt(1000));
		// 素早さに0～999までの値をランダムで代入
		setAgility(rnd.nextInt(1000));
		// 防御力に0～999までの値をランダムで代入
		setDefense(rnd.nextInt(1000));
		
	}


}
