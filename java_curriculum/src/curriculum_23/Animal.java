package curriculum_23;

public class Animal {

/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

	// 動物の名前を格納する変数
	private String name;
	// 動物の体長を格納する変数
	private double height;
	// 動物の速度を格納する変数
	private int speed;
	
	// 動物の名前を呼び出すメソッド
	public String getName() {
		
		// 動物の名前を返す
		return this.name;
		
	}
	
	// 動物の体調を呼び出すメソッド
	public double getHeight() {
		
		// 動物の体調を返す
		return this.height;
		
	}
	
	// 動物の速度を呼び出すメソッド
	public int getSpeed() {
		
		// 動物の速度を返す
		return this.speed;
		
	}
	
	// 動物の情報を変数に代入するメソッド
	public void setInfo(String name, double height, int speed) {
		
		// 動物の名前を変数に代入
		this.name = name;
		// 動物の体長を変数に代入
		this.height = height;
		// 動物の速度を変数に代入
		this.speed = speed;
		
	}

}
