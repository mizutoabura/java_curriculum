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
				byte by;
				short sh;
				int in;
				long lo;
				float fl;
				double dou;
				char ch;
				String st;
				boolean bo;
		
		
		
		//	2				
		//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください			
				by = 0;
				sh = 0;
				in = 0;
				lo = 0;
				fl = 0.0f;
				dou =0.0d;
				ch = '\u0000';
				st = null;
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
				by = 10;
				sh = 100;
				in = 1000;
				lo = 10000;
				fl = 9.5f;
				dou =10.5d;
				ch = 'a';
				st = "ハロー";
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
				System.out.println(by + sh + in + lo);
				System.out.println(by + by);
				System.out.println(ch + st + bo);
				System.out.println(by + sh + in + lo + fl + dou);
				System.out.println(by * sh * in * lo);
				System.out.println(dou / sh);
				System.out.println(by - sh);
				System.out.println("");
				
		//					
		//	5				
		//		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		//		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
		//		　String num="20";			
		//		　int num1=23;			
		//		　System.out.println("ハローJAVA"+(num+num1));	
				String num="20";			
				int num1=23;			
				System.out.println("ハローJAVA"+(num+num1));
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
				String name = "山田太郎";
				int age = 18;
				double height = 170.5;
				double weight = 62.2;
				String food = "寿司";
				
				System.out.println("初めまして" + name + "です");
				System.out.println("年齢は" +age + "です");
				System.out.println("身長は" + height + "cmです");
				System.out.println("体重は" + weight + "kgです");
				System.out.println("好きな食べ物は" + food + "です");
				System.out.println("");
				
		//	7				
		//		6で作成した自己紹介に続いてBMIが出力されるようにしてください			
		//		「BMIは○○です」			
		//		ただし計算は数値を直書きせず、全て変数を使ってすること	
				double heightM = height/100;
				double bmi = weight / heightM / heightM;
				System.out.println("BMIは" + bmi + "です");
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
				name = "鈴木一郎";
				age = 24;
				height = 168.5;
				weight = 64.2;
				food = "オムライス";
				bmi = 22.6;
				System.out.println("初めまして" + name + "です");
				System.out.println("年齢は" +age + "です");
				System.out.println("身長は" + height + "cmです");
				System.out.println("体重は" + weight + "kgです");
				System.out.println("好きな食べ物は" + food + "です");
				System.out.println("BMIは" + bmi + "です");
				System.out.println("");
				
				
		//	9				
		//		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください			
		//		　初めまして鈴木一郎です			
		//		　年齢は48歳です			
		//		　身長337.0cmです			
		//		　体重は128.4kgです			
		//		　好きな食べ物はオムライスです			
		//		　BMIは11.31です	
				age += 24;
				height += 168.5;
				weight += 64.2;
				bmi = 11.31;
				System.out.println("初めまして" + name + "です");
				System.out.println("年齢は" +age + "です");
				System.out.println("身長は" + height + "cmです");
				System.out.println("体重は" + weight + "kgです");
				System.out.println("好きな食べ物は" + food + "です");
				System.out.println("BMIは" + bmi + "です");
				System.out.println("");
				
		//					
		//	10				
		//		8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません	
				age = 24;
				boolean  jugement = age >= 24;
				System.out.println(jugement);
				System.out.println("");
		//					
		//	11				
		//		8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください	
				height = 168.5;
				weight = 64.2;
				String ageStr = String.valueOf(age);
				String heightStr = String.valueOf(height);
				String weightStr = String.valueOf(weight);
				System.out.println(ageStr + heightStr + weightStr);
				System.out.println("");
				
		//					
		//	12				
		//		11で変換した【年齢・身長】を整数型に変換して出力してください	
//				Integer ageInt = Integer.valueOf(ageStr);
//				Integer heightInt = Integer.valueOf(heightStr);
				int ageInt = Integer.parseInt(ageStr);
				double heightInt = Double.parseDouble(heightStr);
//				 Integer heightInt = Integer.valueOf(heightStr);
//				int heightInt = (int)ageStr;
				System.out.println(ageInt);
				System.out.println((int)heightInt);
				System.out.println("");
				
		//					
		//	13				
		//		12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		//		ただしif文は使わないでください			

		boolean jagement13 = ageInt == 25 && heightInt >= 160;
		System.out.println(jagement13);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
