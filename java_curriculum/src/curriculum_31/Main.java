package curriculum_31;

public class Main {

	public static void main(String[] args) {
		
		// 自己紹介情報を持ったインスタンスを生成
		// Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Car pelson1 = new Car();
		Bicycle pelson2 = new Bicycle();
		

		// 自己紹介を出力するメソッドを呼び出し
		// person1.print();
		
		pelson1.setOwner("中原中也");
		pelson2.setOwner("鈴木太郎");

		System.out.println(pelson1.getOwner());
		System.out.println(pelson2.getOwner());

	}

}
