package selfIntroduction_3;

class Person{

	// 人数を格納する変数
	public static int count = 0;
	// 名前を格納する変数
	public String firstName,lastName ;
	// 年齢を格納する変数
	public int age;
	// 身長と体重を格納する変数
	public double height, weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット ラストネーム無し
	Person(String firstName, int age, double height, double weight){

		// インスタンスを生成するたびに人数をカウントする
		Person.count++;
		// 変数にファーストネームを代入
		this.firstName = firstName;
		// 変数に年齢を代入
		this.age = age;
		// 変数に身長を代入
		this.height = height;
		// 変数に体重を代入
		this.weight = weight;

	}

	// コンストラクタを定義しインスタンスフィールドに値をセット ラストネーム有り
	Person(String firstName, String lastName, int age, double height, double weight){

		// インスタンスを生成するたびに人数をカウントする
		Person.count++;
		// 変数にファーストネームを代入
		this.firstName = firstName;
		// 変数にラストネームを代入
		this.lastName = lastName;
		// 変数に年齢を代入
		this.age = age;
		// 変数に身長を代入
		this.height = height;
		// 変数に体重を代入
		this.weight = weight;

	}

	// フルネームを呼び出すメソッド
	public String fullName(){

		// フルネームを返す
		return this.firstName + this.lastName;

	}

	// 自己紹介文を出力するメソッド
	public void print(){

		// 名前を出力
		System.out.println("名前は" + this.fullName() + "です");
		// 年齢を出力
		System.out.println("年は" + this.age + "です\n");

	}

	// BMIの値を算出し値を返すメソッド
	public double bmi(){

		// BMIの値を算出し値を返す
		return this.weight / this.height / this.height;

	}

	// 自己紹介した人数の合計を出力するメソッド
	public void printCount(){

		// 合計人数を表示
		System.out.println("合計" + Person.count + "人です");

	}

}
