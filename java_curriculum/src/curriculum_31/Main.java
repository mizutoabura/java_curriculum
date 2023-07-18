package curriculum_31;

public class Main {

	public static void main(String[] args) {

		// 自己紹介情報を持ったインスタンスを生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// 自己紹介情報を持ったインスタンスを生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// Carインスタンスの作成
		Car car = new Car();
		// Bicycleインスタンスの作成
		Bicycle bicycle = new Bicycle();

		// carインスタンスの所有者の値をセットする
		car.setOwner(person1.fullName());
		// bicycleインスタンスの所有者の値をセットする
		bicycle.setOwner(person2.fullName());

		// 乗り物の所有者を表示する
		System.out.println(car.getOwner());
		// 乗り物の所有者を表示する
		System.out.println(bicycle.getOwner());

		// 購入者を表示するメソッドを呼び出し
		person1.buy(car);
		// 購入者を表示するメソッドを呼び出し
		person2.buy(bicycle);

	}

}
