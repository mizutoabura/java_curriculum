package curriculum_18;

import java.util.ArrayList;
import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	/****************************
	 * 「Hello JavaSE 11」を出力するメソッド
	 ****************************/
	public static void message (String message , int num) {
		
		// 受け取った引数をコンソールに出力
		System.out.println(message + "\s" + num + "\n");
		
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	/****************************
	 * 乗算した値を出力するメソッド
	 ****************************/
	public static void calculation (int mul1 , int mul2) {
		
		// 乗算した値をコンソールに出力
		System.out.println(mul1 * mul2 + "\n");
		
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	/****************************
	 * 受け取った値を順番にコンソールに出力するメソッド
	 ****************************/
	public static void numbers (int[] nums) {
		
		// 受け取った値全てコンソールに出力する処理
		for (int num : nums) {
			
			// 受け取った値全てコンソールに出力
			System.out.print(num + "\s");
			
		}
		
	}
			

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	/****************************
	 * 引数同士を和算しコンソールに出力するメソッド
	 ****************************/
	public static void calculation (double sum1 , double sum2) {
		
		// 受け取った値の合計を変数に格納
		double sum = sum1 + sum2;
		// コンソールに和算した値を出力
		System.out.println("\n" + "\n" + sum + "\n");
		
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	/****************************
	 * 引数同士を和算しコンソールに出力するメソッド
	 ****************************/
	public static ArrayList<Integer> randomNum (int num ) {
		Random rand = new Random();
		int rNum = rand.nextInt(100) + 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			rNum = rand.nextInt(100) + 1;
			if (!(rNum == 0)) {	
				list.add(rNum);
			}
		}
		
		System.out.println(list + "\n");
		return list;
		
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double avg () {
		
		ArrayList<Integer> list = randomNum(20);
		
		int sum = 0;
		
		for (int num : list) {
			
			sum += num;
			
		}
		
		double avg = (double) sum / list.size();
		System.out.println(avg);
		return avg;
		
	}
	

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void judgment () {
		
		double num = avg ();
		boolean judge = num >= 50;
		System.out.println("" + judge);
	}
	
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		message("Hello JavaSE",11); 
		
		calculation(2 , 5);
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		numbers(num);

		calculation(2.5,7.8);
		
		randomNum(20);
		
		avg();
		
		judgment();
	
	}

}
