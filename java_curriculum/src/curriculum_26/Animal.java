package curriculum_26;

import java.util.Objects;


public class Animal {

	
	// やりたいことに近いこと
	// https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q14213218399
	// 多次元配列
	// https://www.javadrive.jp/start/array/index7.html
	Beans beans = new Beans();
	// 学名を格納するための変数
	//private String scName;
	// スキャナーで受け取った動物の情報格納する配列


	// 配列にスキャナーで受け取った値を分割して格納する処理
	public void setStatesList(String text) {
		
		// nullと空のチェック
		if(Objects.isNull(text) || text.isEmpty()) {
			
			// 空の場合のチェック
			System.out.println("入力欄が空っぽです。");
		
		}
		// 値を受けとった際の処理
		else {
			
				// カンマで区切る
				String[] animals = text.split(","); 
				
				// カンマ区切りのデータをループ
				for (String animal : animals) { 
					
					// コロンで区切ったものをリストに突っ込む	
					beans.addList(animal.split(":"));
				
				}
			
		}
		
	}
	
	// スキャナーで受け取った値を形式にあてはめて表示
	public void getStates(String text) {
		
		// スキャナーで受け取った値を配列に格納する処理を呼び出し
		setStatesList(text);
		
		// 表示する項目を格納する変数
		String[] items = {"動物名:", "体長:", "速度:","学名:"};
		// 単位を格納する変数
		String[] units = {"","m","km/h",""};
		
		// 動物の情報を格納する配列を一つずつ取り出してコンソールに出力できる形にする
		for (int i = 0, size = beans.getList().size(); i < size; i++) {
			
			// 配列の中身を順番に格納する配列
			String[] tmp = beans.getList().get(i);
			
			// 動物の情報を格納する配列を一つずつ取り出してコンソールに出力できる形にする
			for (int j = 0; j < tmp.length; j++) {
				
				// 項目と値をコンソールに出力
				System.out.println(items[j] + tmp[j] + units[j]);
				
				// 動物名の名前を受け取ったときの処理
				if(j == 0) {
					
					// 名前から学名を割り振る
					switch ( tmp[j]) {
						
						// ライオンの時
						case "ライオン":
							// ライオンの学名を変数に代入
							beans.setScName("パンテラ レオ");
							// 処理を終わる
							break;
						
						// ゾウの時
						case "ゾウ":
							// ゾウの学名を変数に代入
							beans.setScName("ロキソドンタ・サイクロティス");
							// 処理を終わる
							break;
							
						// パンダの時
						case "パンダ":
							// パンダの学名を変数に代入
							beans.setScName("アイルロポダ・メラノレウカ");
							// 処理を終わる
							break;
							
						// チンパンジーの時
						case "チンパンジー":
							// チンパンジーの学名
							beans.setScName("パン・トゥログロディテス");
							// 処理を終わる
							break;
							
						// シマウマの時
						case "シマウマ":
							// シマウマの学名を変数に代入
							beans.setScName("チャップマンシマウマ");
							// 処理を終わる
							break;
							
						// 上記に当てはまらないの時
						default:
							// 学名がわからない
							beans.setScName("不明");
							// 処理を終わる
							break;
					
					}
					
				}

			}
			
			// 学名をコンソールに出力
			System.out.println(items[3]+ beans.getScName() + "\n");
			
		}
		
	}
	
	
}
	