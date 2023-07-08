package curriculum_26;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Beans implements Serializable{


	// 学名を格納するための変数
	private String scName;
	// スキャナーで受け取った動物の情報格納する配列
	private List<String[]> list = new ArrayList<String[]>();
	
	// コンストラクタ
	public Beans() {
	}
	
	// 学名を呼び出す
	public String getScName() {
		
		// 学名を呼び出す
		return scName;
		
	}
	
	// 学名を変数に代入する
	public void setScName(String scName) {
		
		// 学名を変数に代入する
		this.scName = scName;
		
	}
	
	// 動物の情報を呼び出す
	public List<String[]> getList(){
		
		// 動物の情報を呼び出す
		return list;
		
	}
	
	// 動物の情報を代入する
	public void setList( List<String[]> list) {
		
		// 動物の情報を代入する
		this.list =list;
		
	}
	
	// 動物の情報を格納する配列に値を追加する
	public void addList(String[] items) {
		
		// 動物の情報を格納する配列に値を追加する
		list.add(items); 
		
	}
	
	
}
