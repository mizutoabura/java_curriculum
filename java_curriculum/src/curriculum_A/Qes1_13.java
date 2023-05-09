package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		

		
		//		重要			
		//		フォルダ構成の指定			
		//		パッケージ「curriculum_A」の作成後、直下に下記のクラスファイルを作成			
		//		クラス「Qes1_13」			
		//					
		//		プログラミング作成後に下記URLのリンクから理解度テストを実施してください			
		//		https://forms.gle/mfLqQuPBj5jSaxFu7			
		//					
		//	1				
		//		下記9個をローカル変数として宣言のみしてください			
		//		・バイト型・短整数型・整数型・長整数型			
		//		・単精度浮動小数点数型・倍精度浮動小数点数型			
		//		・文字型・文字列型			
		//		・ブーリアン型	
		
				// バイト型の変数宣言
				byte by;
				// 短整数型の変数宣言
				short sh;
				// 整数型の変数宣言
				int in;
				// 長整数型の変数宣言
				long lo;
				// 単精度浮動小数点数型の変数宣言
				float fl;
				// 倍精度浮動小数点数型の変数宣言
				double dou;
				// 文字型の変数宣言
				char ch;
				// 文字列型の変数宣言
				String st;
				// ブーリアン型の変数宣言
				boolean bo;
		
		
		
		//	2				
		//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
				// バイト型の初期値を代入
				by = 0;
				// 短整数型の初期値を代入
				sh = 0;
				// 整数型の初期値を代入
				in = 0;
				// 長整数型の初期値を代入
				lo = 0L;
				// 単精度浮動小数点数型の初期値を代入
				fl = 0.0f;
				// 倍精度浮動小数点数を代入
				dou =0.0d;
				// 短整数型の初期値を代入
				ch = '\u0000';
				// 文字型の初期値を代入
				st = null;
				// ブーリアン型の初期値を代入
				bo = false;
				
		//	3				
		//		初期化をしたそれぞれの変数に下記の値を代入してください			
		//		・バイト型		10	
		//		・短整数型		100	
		//		・整数型		1000	
		//		・長整数型		10000	
		//		・単精度浮動小数点数型		9.5	
		//		・倍精度浮動小数点数型		10.5	
		//		・文字型		a	
		//		・文字列型		ハロー	
		//		・ブーリアン型		true	
				
				// バイト型10を代入
				by = 10;
				// 短整数型100を代入
				sh = 100;
				// 整数型1000を代入
				in = 1000;
				// 長整数型10000を代入
				lo = 10000L;
				// 単精度浮動小数点数型9.5を代入	
				fl = 9.5f;
				// 倍精度浮動小数点数型10.5を代入
				dou =10.5d;
				// 文字型aを代入
				ch = 'a';
				// 文字列型ハローを代入
				st = "ハロー";
				// ブーリアン型trueを代入
				bo = true;
				
				
				
				
				
				
				
		//			//	4				
		//		下記の通りにコンソール出力されるようにしてください			
		//		上記で作成した変数を必ず使用すること			
		//		11110		11110	
		//		20		20	
		//		a ハロー true		a ハロー true	
		//		11130		11130	数字を全て足す
		//		10000000000		10000000000	小数点以外の数字を全てかける
		//		0.105		0.105	10.5割る100をする
		//		-90		-90	10引く100をする
				// 整数すべてを足す
				System.out.println(by + sh + in + lo);
				// 10を2回い足す
				System.out.println(by + by);
				// a ハロー true	
				System.out.println(ch + " "  + st + " " + bo);
				// 数字を全て足す
				System.out.println(by + sh + in + lo + fl + dou);
				// 小数点以外の数字を全てかける
				System.out.println(by * sh * in * lo);
				// 10.5割る100をする
				System.out.println(dou / sh);
				// 10引く100をする
				System.out.println(by - sh);
				// 改行
				System.out.println("");
				
		//					
		//	5				
		//		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		//		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
		//		　String num="20";			
		//		　int num1=23;			
		//		　System.out.println("ハローJAVA"+(num+num1));	
				// 全角スペースを削除
				// Stringからint型に変更
				int num=20;			
				int num1=23;			
				System.out.println("ハローJAVA"+(num+num1));
				//改行
				System.out.println("");
		//					
		//	6				
		//		『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください			
		//		ローカル変数に代入し○○に入れてください			
		//		『山田太郎 18歳 170.5cm 62.2kg 寿司』			
		//					
		//		↓↓format↓↓			
		//		「初めまして○○です」			
		//		「年齢は○○歳です」			
		//		「身長は○○cmです」			
		//		「体重は○○kgです」			
		//		「好きな食べ物は○○です」	
				// Stringに名前を代入
				String name = "山田太郎";
				//intに年齢を代入
				int age = 18;
				// doubleに身長を代入
				double height = 170.5;
				// doubleに体重を代入
				double weight = 62.2;
				// Stringに好きな食べ物を代入
				String food = "寿司";
				
				// コンソールに名前を出力
				System.out.println("初めまして" + name + "です");
				// コンソールに年齢を出力
				System.out.println("年齢は" +age + "です");
				// コンソールに身長を出力
				System.out.println("身長は" + height + "cmです");
				// コンソールに体重を出力
				System.out.println("体重は" + weight + "kgです");
				// コンソールに好きな食べ物を出力
				System.out.println("好きな食べ物は" + food + "です");
				// 改行
				System.out.println("");
				
		//	7				
		//		6で作成した自己紹介に続いてBMIが出力されるようにしてください			
		//		「BMIは○○です」			
		//		ただし計算は数値を直書きせず、全て変数を使ってすること	
				// heightをMになおす
				double heightM = height/100;
				// bmiにbmiの計算式を代入
				double bmi = weight / heightM / heightM;
				// コンソールにBMIを出力 bmiの値を少数第一位まで表示
				System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
				// 改行
				System.out.println("");
		//					
		//	8				
		//		6で宣言した変数に再代入し下記の通りコンソールに出力してください			
		//		　初めまして鈴木一郎です			
		//		　年齢は24歳です			
		//		　身長168.5cmです			
		//		　体重は64.2kgです			
		//		　好きな食べ物はオムライスです			
		//		　BMIは22.6です		
				// nameに名前を再代入
				name = "鈴木一郎";
				// ageに年齢を再代入
				age = 24;
				// heightに身長を再代入
				height = 168.5;
				// weightに体重を再代入
				weight = 64.2;
				// foodに好きな食べ物をを再代入
				food = "オムライス";
				// bmiに数値を再代入
				bmi = 22.6;
				// コンソールに名前を出力
				System.out.println("初めまして" + name + "です");
				// コンソールに年齢を出力
				System.out.println("年齢は" +age + "歳です");
				// コンソールに身長を出力
				System.out.println("身長は" + height + "cmです");
				// コンソールに体重を出力
				System.out.println("体重は" + weight + "kgです");
				// コンソールに好きな食べ物を出力
				System.out.println("好きな食べ物は" + food + "です");
				// コンソールにBMIを出力
				System.out.println("BMIは" + bmi + "です");
				// 改行
				System.out.println("");
				
				
		//	9				
		//		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください			
		//		　初めまして鈴木一郎です			
		//		　年齢は48歳です			
		//		　身長337.0cmです			
		//		　体重は128.4kgです			
		//		　好きな食べ物はオムライスです			
		//		　BMIは11.31です	
				//ageに自己代入
				age += 24;
				// heightに自己代入
				height += 168.5;
				// weightに自己代入
				weight += 64.2;
				// bmiに再代入
				bmi = 11.31;
				// コンソールに名前を出力
				System.out.println("初めまして" + name + "です");
				// コンソールに年齢を出力
				System.out.println("年齢は" +age + "歳です");
				// コンソールに身長を出力
				System.out.println("身長は" + height + "cmです");
				// コンソールに体重を出力
				System.out.println("体重は" + weight + "kgです");
				// コンソールに好きな食べ物を出力
				System.out.println("好きな食べ物は" + food + "です");
				// コンソールにBMIを出力
				System.out.println("BMIは" + bmi + "です");
				// 改行
				System.out.println("");
				
		//					
		//	10				
		//		8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません	
				// ageに再代入
				age = 24;
				// jugementに年齢が25歳以上ならtrueになる式を代入
				boolean  jugement = age >= 25;
				// コンソールにjugementの結果を出力
				System.out.println(jugement);
				// 改行
				System.out.println("");
		//					
		//	11				
		//		8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください	
				// heightに8で使用した値を再代入
				height = 168.5;
				// weightに8で使用した値を再代入
				weight = 64.2;
				// ageを文字列型に型変換しageStrに代入
				String ageStr = String.valueOf(age);
				// heightを文字列型に型変換しheightStrに代入
				String heightStr = String.valueOf(height);
				// weightを文字列型に型変換しweightStrに代入
				String weightStr = String.valueOf(weight);
				// コンソールに【年齢・身長・体重】を文字列型に型変換し繋げて出力
				System.out.println(ageStr + heightStr + weightStr);
				// 改行
				System.out.println("");
				
		//					
		//	12				
		//		11で変換した【年齢・身長】を整数型に変換して出力してください	
//				Integer ageInt = Integer.valueOf(ageStr);
//				Integer heightInt = Integer.valueOf(heightStr);
				// ageStrを整数型に変換
				int ageInt = Integer.parseInt(ageStr);
				// heightStrをdouble型にしてキャストでint型に変換
				int heightInt = (int) Double.parseDouble(heightStr);
				// ageIntをコンソールに出力
				System.out.println(ageInt);
				// heighIntをコンソールに出力
				System.out.println(heightInt);
				
				// 改行
				System.out.println("");
				
		//					
		//	13				
		//		12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		//		ただしif文は使わないでください			
				
				// jagement13に12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueになる四季を代入
				boolean jagement13 = ageInt == 25 || heightInt >= 160;
				// jagement13の結果をコンソールに出力
				System.out.println(jagement13);
				

		
		
		
		
		
		
		
		
		
		
		

	}

}
