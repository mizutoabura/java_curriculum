package selfIntroduction_1;

class Main {

	// https://engineer-curriculum.com/%E3%83%AC%E3%83%83%E3%82%B9%E3%83%B3/1-31-%e8%87%aa%e5%b7%b1%e7%b4%b9%e4%bb%8b%e3%83%97%e3%83%ad%e3%82%b0%e3%83%a9%e3%83%a0%e3%82%92%e4%bd%9c%e6%88%90%e2%91%a0-2/

	public static void main(String[] args) {

		// 自己紹介情報を持ったインスタンスを生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 名前を出力
		System.out.println(person1.name);
		// 年齢を出力
		System.out.println(person1.age);
		// 身長を出力
		System.out.println(person1.height);

		// 自己紹介を出力するメソッドを呼び出し
		person1.print();

	}
}
