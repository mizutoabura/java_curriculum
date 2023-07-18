package selfIntroduction_3;

class Main{

	public static void main(String[] args){

		// 自己紹介情報を持ったインスタンスを生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// 自己紹介文を出力するメソッド呼び出し
		person1.print();

		// 自己紹介情報を持ったインスタンスを生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// 自己紹介文を出力するメソッド呼び出し
		person2.print();

		// 合計人数をカウントするメソッドを呼び出し
		person2.printCount();

	}

}
