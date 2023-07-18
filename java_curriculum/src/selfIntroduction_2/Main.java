package selfIntroduction_2;

class Main{
	
	public static void main(String[] argos){
	
	// 自己紹介情報を持ったインスタンスを生成
	Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	// 自己紹介文を出力するメソッド呼び出し
	person1.print();
	
	// 自己紹介情報を持ったインスタンスを生成
	Person person2 = new Person("山田花子", 22, 1.5, 40);
	// 自己紹介文を出力するメソッド呼び出し
	person2.print();
	
	// 合計人数を表示
	System.out.println("合計" + Person.count + "人です");
	
	// 合計人数をカウントするメソッドを呼び出し
	person2.printCount();
	
	}

}
