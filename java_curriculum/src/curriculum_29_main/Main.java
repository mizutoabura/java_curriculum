package curriculum_29_main;

import java.util.Scanner;

import curriculum_29.Sort;

public class Main {

	public static void main(String[] args) {
		// 参考サイト
		
		// 配列を一度リストに変換してから検索
		// https://magazine.techacademy.jp/magazine/22166
		// https://sejuku.net/blog/14166
		// https://style.potepan.com/articles/27478.html#Javalist
		
		// ソート
		// https://www.javadrive.jp/start/array/index14.html
		
		// Map(連想配列)
		// https://sejuku.net/blog/16055
		
		// 連想配列でソート
		// https://sejuku.net/blog/16176
		// https://www.techiedelight.com/ja/sort-map-by-keys-java/
		
		// エラー処理
		// https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q11220144656
		// https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q13184099648
		// https://uxmilk.jp/48686
		
		// 配列型変換
		// https://www.javadrive.jp/start/array/index2.html#section1
		
		// 正規表現
		// https://www-creators.com/archives/5154#i-2
		
		// 重複削除
		
		/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください
	   	
	   	例:
	   	8,5,9,.....
	   	と入力された場合（昇順）
	   	
	   	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	   	
	   	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2

	   	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
	 */
//		String text = "a,g,e,10,1d1";
//		System.out.println(text);
//		text = text.replaceAll("[^0-9,]+", "");
//		System.out.println(text);
		 Sort sort = new Sort();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("0～10までの数字をカンマで区切って入力してください。\n改行後、降順の昇順のどちらかを入力してください。");
		 sort.separateNum(sc.nextLine(),sc.nextLine());
		sc.close();

	}


}
