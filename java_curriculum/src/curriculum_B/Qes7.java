package curriculum_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		// スキャナーインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// コンソールにお願いを出力
		System.out.print("生徒の人数を入力してください（2以上）:");
		// 生徒の人数をコンソールから受け取る
		int studentNum = sc.nextInt();
		// 配列のインスタンスを生成
		ArrayList<Double> avgs = new ArrayList<Double>();
		// 英語の平均点を受け取る変数を定義
		double avgEn = 0;
		// 数学の平均点を受け取る変数を定義
		double avgMa = 0;
		// 理科の平均点を受け取る変数を定義
		double avgSci = 0;
		// 社会の平均点を受け取る変数を定義
		double avgSoc = 0;
		// 平均点を受け取る変数を定義
		double toSc = 0;
		// 改行する処理
		System.out.println("\n");
		
		// 生徒の人数分各教科の点数をコンソールから受け取る
		for (int i = 1; i <= studentNum; i++) {
			
			// コンソールで 英語の点数入力をお願いする処理
			System.out.print(i + "人目の『英語』の点数を入力してください :");
			// 英語の点数を受け取る変数
			double scoreEn = sc.nextInt();
			// コンソールで 数学の点数入力をお願いする処理
			System.out.print(i + "人目の『数学』の点数を入力してください :");
			// 数学の点数を受け取る変数
			double scoreMa = sc.nextInt();
			// コンソールで 理科の点数入力をお願いする処理
			System.out.print(i + "人目の『理科』の点数を入力してください :");
			// 理科の点数を受け取る変数
			double scoreSci = sc.nextInt();
			// コンソールで 社会の点数入力をお願いする処理
			System.out.print(i + "人目の『社会』の点数を入力してください :");
			// 社会の点数を受け取る変数
			double scoreSoc = sc.nextInt();
			
			// 改行する処理
			System.out.println("\n");
			// 平均点を求める処理
			double avg =  (scoreEn + scoreMa + scoreSci + scoreSoc) / 4;
			// 平均点を配列に渡す
			avgs.add(avg);
			// 人数分英語の点数を足す
			avgEn += scoreEn;
			// 人数分数学の点数を足す
			avgMa += scoreMa;
			// 人数分理科の点数を足す
			avgSci += scoreSci;
			// 人数分社会の点数を足す
			avgSoc += scoreSoc;

		}
			
			// 全生徒の全ての教科の平均点
			toSc = (avgEn + avgMa + avgSci + avgSoc) / (studentNum * 4);
			// 英語の平均点
			avgEn = avgEn/studentNum;
			// 数学の平均点
			avgMa = avgMa/studentNum;
			// 理科の平均点
			avgSci = avgSci/studentNum;
			// 社会の平均点
			avgSoc = avgSoc/studentNum;
			

		
		// 生徒一人一人の平均点出力
		for (int i = 1; i <= studentNum; i++) {
		
		// 各生徒の平均点出力
		System.out.println(i + "人目の平均点は" +  String.format("%.2f", avgs.get(i-1)) + "点です。");
		
		}
		

		// 英語の平均点を出力
		System.out.println("\n英語の平均点は" + String.format("%.2f", avgEn) + "点です。");
		// 数学の平均点を出力
		System.out.println("数学の平均点は" + String.format("%.2f", avgMa) + "点です。");
		// 理科の平均点を出力
		System.out.println("理科の平均点は" + String.format("%.2f", avgSci) + "点です。");
		// 社会の平均点を出力
		System.out.println("社会の平均点は" + String.format("%.2f", avgSoc) + "点です。");
		// 全体の平均点を出力
		System.out.println("全体の平均点は" + String.format("%.2f", toSc) + "点です。");
	
		//close処理
		sc.close();
		
	}
	
	

}