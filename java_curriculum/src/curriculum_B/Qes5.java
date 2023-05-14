package curriculum_B;


public class Qes5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 20; j++) {
			int mul = i * j;
			System.out.print(String.format("%03d", j) + "*" + String.format("%03d", i) + "=" + String.format("%03d", mul));
			if (j < 20) {
				System.out.print("||");
			}
			}
			System.out.println("");
		}
	}

}
