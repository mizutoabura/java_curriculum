package curriculum_26_main;

import java.util.Scanner;

import curriculum_26.Animal;

public class Main {

	public static void main(String[] args) {
		/*
		 
	 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	  	
	  	コンソール出力結果
	  	
	  	コンソールに文字を入力してください
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明

	  
	  */
		
		// アニマルインスタンスを作成
		Animal animal = new Animal();
		// コンソールにお願いを出力
		System.out.println("動物の名前、体長、速度の値を:で区切って入力してください。");
		// コンソールにお願いを出力
		System.out.println("尚、複数の動物の名前を入力する場合は、速度と動物名の間を,で区切って入力してください。\n");
		// スキャナーを作成
		Scanner sc = new Scanner(System.in);
		// スキャナーで受け取った値から動物の情報を表示する処理
		animal.getStates(sc.nextLine());
		// スキャナーを閉じる
		sc.close();

	}

}
