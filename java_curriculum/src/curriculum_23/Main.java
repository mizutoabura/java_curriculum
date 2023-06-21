package curriculum_23;


public class Main {

	public static void main(String[] args) {
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		
		// 動物の情報を持ったインスタンスを作成
		Animal animal = new Animal();
		// 動物の情報を変数に格納
		animal.setInfo("ライオン", 2.1, 80);
		
		// 動物名をコンソールに出力
		System.out.println("動物名:" + animal.getName());
		// 体長をコンソールに出力
		System.out.println("体重:" + animal.getHeight() + "m");
		// 速度をコンソールに出力
		System.out.println("速度:" + animal.getSpeed() + "km/h");

	}

}
