package selfIntroduction_2;

class Person{

	// 名前を格納する変数
	public String name;
	// 年齢を格納する変数
	public int age;
	// 身長を格納する変数
	public double height;
	// 体重を格納する変数
	public double weight;
	// 人数を格納する変数
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){

		// 変数に名前を代入
		this.name = name;
		// 変数に年齢を代入
		this.age = age;
		// 変数に身長を代入
		this.height = height;
		// 変数に体重を代入
		this.weight = weight;
		// インスタンスを生成するたびに人数をカウントする
		count ++;

	}

	// bmiを計算するメソッド
	public double bmi(){

		// メソッド呼び出しもとにBMIの値を返す
		return this.weight / this.height / this.height;

	}

	// 自己紹介の内容をコンソールに出力する処理
	public void print(){

		// 名前を出力
		System.out.println("名前は" + this.name + "です");
		// 年齢を出力
		System.out.println("年は" + this.age + "です\n");

	}

	// 自己紹介した人数の合計を出力するメソッド
	public void printCount() {

		// 合計人数を表示
		System.out.println("合計" + count + "人です");

	}

}
