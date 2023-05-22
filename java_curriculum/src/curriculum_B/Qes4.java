package curriculum_B;


public class Qes4 {

	public static void main(String[] args) {
		// 九九を出力する処理
		for(int i = 1; i <= 9; i++) {
			
			// 9回処理を繰り返す
			for(int j = 1; j <= 9; j++) {
				
				// 掛け算の結果を格納する
				int mul = i * j;
				// 掛け算の式と結果をコンソールに出力する
				System.out.print(String.format("%02d", i) + "*" + String.format("%02d", j) + "=" + String.format("%02d", mul));
				// 掛け算8回めまで||をコンソールに出力
				if (j < 9) {
					
					System.out.print("||");
					
				}
			
			}
			// 掛け算9回行うと改行する
			System.out.println("");
		}
		
	}
}
				



