package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String getName = sc.next();
		String[] names = getName.split("、");
		
		for (String name : names) {
			switch (name) {
				case "パソコン":
				System.out.println("パソコン" + "の残りの台数は"+ rNum() + "台です");
				break;
				case "冷蔵庫":
				System.out.println("冷蔵庫" + "の残りの台数は"+ rNum() + "台です");
				break;
				case "扇風機":
				System.out.println("扇風機" + "の残りの台数は"+ rNum() + "台です");
				break;
				case "洗濯機":
				System.out.println("洗濯機" + "の残りの台数は"+ rNum() + "台です");
				break;
				case "加湿器":
				System.out.println("加湿器" + "の残りの台数は"+ rNum() + "台です");
				break;
				case "テレビ":
				case "ディスプレイ":
				System.out.println(name + "の残りの台数は"+ rNum() + "台です");
				break;
				default:
				System.out.println("『 " + name + " 』は指定の商品ではありません");
			}
			
		}
	}
	
//	Scanner scanner = new Scanner(System.in);
//	scanner.useDelimiter("、");
//	String name = scanner.next();
	

	
	public static int rNum () {
		Random rand = new Random();
		return rand.nextInt(12);
	}
	
	
	
	//-----------------後で消す-------------------
	//----------------使いそうなやつメモ----------
	//splitメソッド
	//https://style.potepan.com/articles/32906.html#i-2
	//→splitメソッドは、対象となる文字列を指定した区切り文字によって分割し、
	//それぞれを配列の要素として格納します

}
