package curriculum_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Sort {
	
	// 都道府県並べ替えクラスのインスタンスを作成
	PrefecturesBeans pB = new PrefecturesBeans();
	
	// メインクラスのコンソールから受け取った値をカンマで区切って格納する配列
	String[] nums;
	// 値を数値で受け取る配列
	List<Integer> numsIntCheck = new ArrayList<>();
	// 重複をなくした値を受け取る配列
	List<Integer> numsInt ;
	
	// コンソールから受け取った値を配列に格納する処理
	public void numCheck(String textNum) {
		
		// コンソールから受け取った値が空かどうかチェックする
		if(Objects.isNull(textNum) ||  textNum.isEmpty()) {
			
			// コンソールにメッセージを表示
			System.out.println("何も入力されていません。");
			
		}
		// コンソールから受け取った値が空以外の処理
		else {
			
			// コンソールから受け取った値を,で区切って配列に格納する
			nums = textNum.split(",");
			
			// 配列に格納した値それぞれが数字かどうかチェックする
			for(String num: nums) {
				
				// 配列の値が数字だけの場合の処理
				if(Pattern.matches("[0-9]+$", num)) {
					
					// int型に変換
					int numInt = Integer.parseInt(num);
					
					// 0-10の場合に値に配列を足す
					if(0 < numInt && numInt < 11) {
						
						// 0-10の値であれば配列に格納
						numsIntCheck.add(numInt);
					
					}
					
					// 上記の配列から重複を取り除いた配列
					numsInt = new ArrayList<>(new HashSet<>(numsIntCheck));
					
				}
				// 文字など数字以外が入力された場合の処理
				else{
					
					// メッセージの表示
					System.out.println("数字以外が入力されました。");
					// 処理を終了させる
					System.exit(0);
					
				}
				
			}

		}
		
	}
	
	// 昇順降順に配列を並び替える処理
	public void sortText(String text) {
		
		// コンソールから受け取った値が空かどうかチェックする
		if(Objects.isNull(text) ||  text.isEmpty()) {
			
			// コンソールにメッセージを表示
			System.out.println("昇順か降順を入力してください");
			
		}
		// コンソールから受け取った値が空以外の処理
		else {
			
			// 受け取った値ごとの処理
			switch(text) {
			
			// 昇順の場合
			case "昇順" -> {
				
				// 配列を昇順に並び替える
				Collections.sort(numsInt);
				
			}
			// 降順の場合
			case "降順" -> {
				
				// 配列を昇順に並び替える
				Collections.sort(numsInt);
				// 配列を逆順(降順)に並び替える
		        Collections.reverse(numsInt);
		        
			}
			
			// その他の処理
			default -> System.out.println("昇順か降順を入力してください。");
			
			}
		
		}
		
	}
	
	// 都道府県の情報を昇順または降順で並べ替えて表示する処理
	public void showPref(String textNum,String sortText) {
		
		// コンソールから受け取った値を配列に格納
		numCheck(textNum);
		// 数字を昇順または降順に並び替える
		sortText(sortText);
		
		// 配列の値に対応した都道府県の情報を表示する
		for (Integer num : numsInt) {
			
			// 都道府県の情報を取得する
			String preInfo = pB.getPref(num);
			// :で区切って配列に格納
			String temp[] = preInfo.split(":");
			
			// 都道府県名を出力
			System.out.println("都道府県名：" + temp[0]);
			// 県庁所在地を出力
			System.out.println("県庁所在地：" + temp[1]);
			// 面積を出力
			System.out.println("面積：" + temp[2] + "km2\n");
			
        }
		
	}

}
