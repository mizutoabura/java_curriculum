package curriculum_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("生徒の人数を入力してください（2以上）:");
		
		int studentNum = sc.nextInt();
		ArrayList<Double> avgs = new ArrayList<Double>();
		double avgEn = 0;
		double avgMa = 0;
		double avgSci = 0;
		double avgSoc = 0;
		double toSc = 0;
		
		for (int i = 1; i <= studentNum; i ++) {
			System.out.print(i + "人目の『英語』の点数を入力してください :");
			double scoreEn = sc.nextInt();
			System.out.print(i + "人目の『数学』の点数を入力してください :");
			double scoreMa = sc.nextInt();
			System.out.print(i + "人目の『理科』の点数を入力してください :");
			double scoreSci = sc.nextInt();
			System.out.print(i + "人目の『社会』の点数を入力してください :");
			double scoreSoc = sc.nextInt();
			System.out.println("\n");
			
			double avg =  (scoreEn + scoreMa + scoreSci + scoreSoc) / 4;
			avgs.add(avg);
			
			avgEn += scoreEn;
			avgMa += scoreMa;
			avgSci += scoreSci;
			avgSoc += scoreSoc;
			
			if (i == studentNum) {
				toSc = (avgEn + avgMa + avgSci + avgSoc) / (studentNum * 4);
				avgEn = avgEn/studentNum;
				avgMa = avgMa/studentNum;
				avgSci = avgSci/studentNum;
				avgSoc = avgSoc/studentNum;
			}

		}
		
		for (int i = 1; i <= studentNum; i ++) {
		System.out.println(i + "人目の平均点は" +  String.format("%.2f", avgs.get(i-1)) + "点です。");
		}
		
		System.out.println("\n");
		System.out.println("英語の平均点は" + String.format("%.2f", avgEn) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", avgMa) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", avgSci) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", avgSoc) + "点です。");
		System.out.println("全体の平均点は" + String.format("%.2f", toSc) + "点です。");
	}
	


}
