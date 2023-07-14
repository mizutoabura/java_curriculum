package curriculum_29;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PrefecturesBeans implements Serializable{

	// Mapの宣言
    private Map<Integer, String> prefe = new HashMap<Integer, String>();
		
	// コンストラクタ
	public PrefecturesBeans() {
        
        // Mapにデータを格納
		// 北海道
        prefe.put( 0, "北海道:札幌市:83424");
        // 青森
        prefe.put( 1, "青森県:青森市:9646");
        // 岩手
        prefe.put( 2, "岩手県:盛岡市:15275");
        // 宮城
        prefe.put( 3,"宮城県:仙台市:7282");
        // 秋田
        prefe.put( 4, "秋田県:秋田市:11638");
        // 山形
        prefe.put( 5, "山形県:山形市:9323");
        // 福島
        prefe.put( 6, "福島県:福島市:13784");
        // 茨木
        prefe.put( 7, "茨城県:水戸市:6097");
        // 栃木
        prefe.put( 8, "栃木県:宇都宮市:6408");
        // 群馬
        prefe.put( 9, "群馬県:前橋市:6362");
        // 埼玉
        prefe.put( 10, "埼玉県:さいたま市:3798");
		
	}
		
		// メモ
		// コンソールで受け取る→nullチェック→okなら配列に,区切りで数字を格納
		// 昇順、降順をコンソールで受け取る→nullチェック→okなら受け取った数字を指示通りに並べ替える
		// 並び変えたとおりにコンソールに都道府県情報を表示
		// keyで呼び出しvalueの値をtemp[]に:区切りで仮格納する
		// その配列を使って指示通りにコンソールに都道府県情報を表示する
		// 重複があった場合に削除するメソッドを
		
		// 都道府県の情報を変数にセットする処理
		public void setPref(Integer key, String value) {
			
			// 都道府県の情報を変数に代入 
			prefe.put( key, value);
		
		}
       
	   // 都道府県の情報を変数から取得する処理
        public String getPref(Integer num) {
        
        	//メソッド呼び出しもとに都道府県の変数の値を渡す
        	return prefe.get(num);
        	
        }


}
