package curriculum_19;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		// Dogクラスを呼び出して変数に代入
		Dog dog = new Dog();
		// 動物の名前をコンソールに出力
		System.out.println(dog.animals + "\n");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// Dogクラスを呼び出して変数に代入
		Dog dog2 = new Dog(2);
		// 動物の数をコンソールに出力
		System.out.println(dog2.animalsNum);
		
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在の日時を取得
		Calendar calendar = Calendar.getInstance();
		// 日時の形式を指定
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 指定形式に変換した日時をコンソールに出力
        System.out.println("\n" + format.format(calendar.getTime()));
		
	}

}
