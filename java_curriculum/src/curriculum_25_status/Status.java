package curriculum_25_status;

import java.util.Random;

public class Status {


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
		
		// 名前を格納する変数
		private String name;
		// 体力を格納する変数
		private int hp;
		// 魔力を格納する変数
		private int mp;
		// 攻撃力を格納する変数
		private int power;
		// 素早さを格納する変数
		private int agility;
		// 防御力を格納する変数
		private int defense;
		
		// 名前以外の値を入力
		public Status() {
			
			// ランダムインスタンスを生成
			Random rnd = new Random();
			// 体力に0～999までの値をランダムで代入
			this.hp = rnd.nextInt(1000);
			// 魔力に0～999までの値をランダムで代入
			this.mp = rnd.nextInt(1000);
			// 攻撃力に0～999までの値をランダムで代入
			this.power = rnd.nextInt(1000);
			// 素早さに0～999までの値をランダムで代入
			this.agility = rnd.nextInt(1000);
			// 防御力に0～999までの値をランダムで代入
			this.defense = rnd.nextInt(1000);
			
		}
		
		// 名前の値を取得
		public String getName() {
			
			// 名前の値を返す
			return this.name;
			
		}
		
		// 体力の値を取得
		public int getHp() {
			
			// 体力の値を返す
			return this.hp;
			
		}
		
		// 魔力の値を取得
		public int getMp() {
			
			// 魔力の値を返す
			return this.mp;
			
		}
		
		// 攻撃力の値を取得
		public int getPower() {
			
			// 攻撃力の値を返す
			return this.power;
			
		}
		
		// 素早さの値を取得
		public int getAgility() {
			
			// 素早さの値を返す
			return this.agility;
			
		}
		
		// 防御力の値を取得
		public int getDefense() {
			
			// 防御力の値を返す
			return this.defense;
			
		}
		
		
		
		// 名前の値を代入
		public void setName(String name) {
			
			// 名前に引数の値を代入
			this.name = name;
			
		}
		
		// 体力の値を代入
		public void setHp (int hp) {
			
			// 体力に引数の値を代入
			this.hp = hp;
			
		}
		
		// 魔力の値を代入
		public void setMp (int mp) {
			
			// 魔力に引数の値を代入
			this.mp = mp;
			
		}
		
		// 攻撃力の値を代入
		public void setPower (int power) {
			
			// 攻撃力に引数の値を代入
			this.power = power;
			
		}
		
		// 素早さの値を代入
		public void setAgility(int agility) {
			
			// 素早さに引数の値を代入
			this.agility = agility;
			
		}
		
		// 防御力の値を代入
		public void setDefense (int defense) {
			
			// 防御力に引数の値を代入
			this.defense = defense;
			
		}


}
