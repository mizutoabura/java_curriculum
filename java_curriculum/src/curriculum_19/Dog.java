package curriculum_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	
	// 動物の名前の変数を定義
	public String animals;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	
	// 動物の数の変数を定義
	public int animalsNum;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// 変数に「犬」を代入するコンストラクタを作成
	Dog() {
		
		// 変数に動物の名前を代入
		animals = "犬";
		
	}
	
	
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	// 変数に引数を代入するコンストラクタを作成
	Dog(int num) {
		
		// 引数に受け取った値を変数に代入
		this.animalsNum = num;
		
	}
	

}
