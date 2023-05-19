package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String getName = sc.next();
		String[] names = getName.split("、");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
//	Scanner scanner = new Scanner(System.in);
//	scanner.useDelimiter("、");
//	String name = scanner.next();
	

	
//	public static int mNum () {
//		Random rand = new Random();
//		return rand.nextInt(12);
//	}
	
	
	
	//-----------------後で消す-------------------
	//----------------使いそうなやつメモ----------
	//splitメソッド
	//https://style.potepan.com/articles/32906.html#i-2
	//→splitメソッドは、対象となる文字列を指定した区切り文字によって分割し、
	//それぞれを配列の要素として格納します

}
