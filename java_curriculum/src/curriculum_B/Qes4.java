package curriculum_B;


public class Qes4 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
			int mul = i * j;
			System.out.print(String.format("%02d", i) + "*" + String.format("%02d", j) + "=" + String.format("%02d", mul));
			if (j < 9) {
				System.out.print("||");
			}
			}
			System.out.println("");
		}
		
	}
}
				



