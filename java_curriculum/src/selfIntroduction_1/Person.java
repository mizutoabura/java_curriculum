package selfIntroduction_1;

public class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
		
	}
	
	public double bmi() {
		
		 return weight/(height*height);
		
	}
	
	public void print() {
		
		System.out.println("\n名前は" + this.name + "です");
		System.out.println("年は" + this.age  + "才です");
		System.out.println("BMIは" + bmi() + "です");
		System.out.println("合計" + count + "人です");
		
	}
	
}
