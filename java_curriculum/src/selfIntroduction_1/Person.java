package selfIntroduction_1;

public class Person{
	// インスタンスフィールドを定義
	// 名前を格納する変数
	String name;
	// 年齢を格納する変数
	int age;
	// 身長を格納する変数
	double height;
	// 体重を格納する変数
	double weight;
	// 人数を格納する変数
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){

		// 変数に名前を代入
		this.name = name;
		// 変数に年齢を代入
		this.age = age;
		// 変数に身長を代入
		this.height = height;
		// 変数に体重を代入
		this.weight = weight;
		// インスタンスを生成するたびに人数をカウントする
		count++;

	}

	// bmiを計算するメソッド
	public double bmi() {

		// メソッド呼び出しもとにBMIの値を返す
		return weight/(height*height);

	}

	// 自己紹介の内容をコンソールに出力する処理
	public void print() {

		// 名前を出力
		System.out.println("\n名前は" + this.name + "です");
		// 年齢を出力
		System.out.println("年は" + this.age  + "才です");
		// bmiを出力
		System.out.println("BMIは" + Math.floor( bmi()) + "です");
		// 人数の合計を出力
		System.out.println("合計" + count + "人です");

	}

}
