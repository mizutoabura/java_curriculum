package curriculum_B;


public class Qes5 {

	public static void main(String[] args) {
		// 1×20までの掛け算を出力する処理
		for(int i = 1; i <= 9; i++) {
			
			// 20までの掛け算を繰り返す
			for(int j = 1; j <= 20; j++) {
				
				// 掛け算の結果を格納する
				int mul = i * j;
				// 掛け算の式と結果をコンソールに出力する
				System.out.print(String.format("%03d", j) + "*" + String.format("%03d", i) + "=" + String.format("%03d", mul));
				// 掛け算19回めまで||をコンソールに出力
				if (j < 20) {
					
					System.out.print("||");
					
				}
				
			}
			
			// 掛け算9回行うと改行する
			System.out.println("");
			
		}
		
	}
}