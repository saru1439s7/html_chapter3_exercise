import java.io.*;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {

		//この文章をコメントにしてください");

		// 「こんにちは、Java」と出力してください
		System.out.println("こんにちは、Java");
		// 数値の17を出力してください
		System.out.println(17);

		// 5に3を足した値を出力してください
		System.out.println(5 + 3);

		// 「5 + 3」を文字列として出力してください

		System.out.println("5+3");
		// 12を3で割った値を出力してください

		System.out.println(12 / 3);
		// 3に6を掛けた値を出力してください
		System.out.println(3 * 6);

		// 8を3で割った時の余りを出力してください
		System.out.println(8 % 3);
		// int型の変数numberを定義してください
		int number;

		// 変数numberに3を代入してください
		number = 3;

		// 変数numberを出力してください
		System.out.println(number);

		// String型の変数nameを定義してください

		String name;
		// 変数nameに"Wanko"を代入してください
		name = "Wanko";

		// 変数nameを出力してください
		System.out.println(name);
		int number1 = 3;

		// int型の変数number2を定義し、7を代入してください
		int number2 = 7;

		// number1 * number2を出力してください
		System.out.println(number1 * number2);

		// 変数textに「プログラミングを勉強しよう」を代入してください

		String text = "プログラミングを勉強しよう";
		// 「Progateで」と変数textを連結して出力してください

		System.out.println("Progateで" + text);
		int number = 11;
		String text = "Ruby";
		System.out.println(number);
		System.out.println(text);

		// 変数numberを9で上書きしてください
		number = 9;

		// 変数numberを出力してください
		System.out.println(number);

		// 変数textを「Java」で上書きしてください
		text = "Java";

		// 変数textを出力してください
		System.out.println(text);
		int number = 3;
		System.out.println(number);

		// 変数numberの値に7を足して、変数numberを上書きしてください
		number += 7;

		// 変数numberを出力してください
		System.out.println(number);
		int number = 8;

		// 変数numberに7をかけて、変数numberを上書きしてください
		number *= 7;

		// 変数numberを出力してください

		System.out.println(number);
		// 変数numberの値に1を足して、変数numberを上書きしてください
		number++;

		// 変数numberを出力してください
		System.out.println(number);
		int length = 6;
		int height = 8;

		// 変数rectangleAreaに、四角形の面積を代入してください
		int rectangleArea = length * height;

		// 変数rectangleAreaを出力してください
		System.out.println(rectangleArea);

		// 変数triangleAreaに、三角形の面積を代入してください
		int triangleArea = length * height / 2;

		// 変数triangleAreaを出力してください
		System.out.println(triangleArea);

		double number1 = 8.5;

		// double型の変数number2を定義し、3.4を代入してください。
		double number2 = 3.4;

		// number1にnumber2を足した値を出力してください
		System.out.println(number1 + number2);

		// number1からnumber2を引いた値を出力してください
		System.out.println(number1 - number2);
		int month = 12;
		int date = 31;

		// 「12月31日」となるように変数と文字列を連結して出力してください
		System.out.println(month + "月" + date + "日");

		// 7を2で割った値を出力してください
		System.out.println(7 / 2);

		// 7.0を2.0で割った値を出力してください
		System.out.println(7.0 / 2.0);

		// 7を2.0で割った値を出力してください
		System.out.println(7 / 2.0);
		int number1 = 7;
		int number2 = 2;
		System.out.println(number1 / number2);

		// number1をdouble型にキャストし、number2で割った値を出力してください
		System.out.println((double) number1 / number2);

		String name = "Masayuki";

		// 変数ageに、好きな年齢を代入してください
		int age = 50;

		// 変数heightに、好きな身長を代入してください（例: 1.2）
		double height = 1.8;

		// 変数weightに、好きな体重を代入してください（例: 20.0）

		double weight = 58.0;
		// 変数bmiに、BMIを計算して代入してください
		double bmi = weight / height / height;

		// 名前、年齢、身長、体重、BMIに関する情報を出力してください
		System.out.println("名前:" + name);
		System.out.println("年齢: " + age);
		System.out.println("身長:" + height);
		System.out.println("体重: " + weight);
		System.out.println("BMI:" + bmi);
		System.out.println(true);

		// 「false」を用いて、「偽」を表す真偽値を出力してください
		System.out.println(false);

		// 「==」を用いて、値を比較した結果を出力してください
		System.out.println(12 / 4 == 3);

		// 「!=」を用いて、値を比較した結果を出力してください
		System.out.println(12 / 4 != 3);

		// 変数を定義し、値を比較した結果を代入してください
		boolean bool = 3 * 9 == 27;

		// 変数boolの値を出力してください
		System.out.println(bool);
		System.out.println(4 + 2 > 6);

		// 「4 + 2」と「6」を比較し、trueとなるようにしてください
		System.out.println(4 + 2 <= 6);
		// trueと出力されるようにしてください
		System.out.println(true || false);

		// falseと出力されるようにしてください
		System.out.println(false && true);

		// 「8 < 5」かつ「3 >= 2」の結果を出力してください
		System.out.println(8 < 5 && 3 >= 2);

		// 「8 < 5」または「3 >= 2」の結果を出力してください
		System.out.println(8 < 5 || 3 >= 2);

		// 「8 < 5」でない、の結果を出力してください
		System.out.println(!(8 < 5));

		if (true) {
			System.out.println("条件式がtrueのため、出力されます");
		}

		// 条件式に直接falseをいれてください
		if (false) {
			System.out.println("条件式がfalseのため、出力されません");
		}

		int x = 5;
		// if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
		if (2 < x) {
			System.out.println("xは2より大きい");
		}
		if (x > 8) {
			System.out.println("xは8より大きい");
		}

		// if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
		int number = 12;

		// numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
		if (number < 10) {
			System.out.println("10より小さい");
		} else if (number < 20) {
			System.out.println("10以上、20より小さい");
		} else {
			System.out.println("20以上");
		}
		int number = 12;

		// switch文を用いて、numberを3で割った余りで条件分岐をしてください
		switch (number % 3) {
		case 0:
			System.out.println("3で割り切れます");
			break;
		case 1:
			System.out.println("3で割ると1余ります");
			break;
		case 2:
			System.out.println("3で割ると2余ります");
			break;
		}
		switch (number % 5) {
		case 0:
			System.out.println("大吉です");
			break;
		case 1:
			System.out.println("中吉です");
			break;
		case 4:
			System.out.println("凶です");
			break;
		default:
			System.out.println("吉です");
			break;
		}
		int number = 10;

		// while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
		while (number > 0) {
			System.out.println(number);
			number--;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "回目のループです");
		}
		int i = 1;
		while (i < 10) {
			// iが5の倍数のとき、繰り返し処理を終了してください
			if (i % 5 == 0) {
				break;
			}
			System.out.println(i);
			i++;
		}

		System.out.println("=== for文 ===");
		for (int j = 1; j < 10; j++) {
			// jが3の倍数のとき、処理をスキップしてください
			if (j % 3 == 0) {
				continue;
			}

			System.out.println(j);
		}
		String[] names = { "にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ" };

		// インデックス番号が0の要素を出力してください
		System.out.println(names[0]);

		// インデックス番号が2の要素を出力してください
		System.out.println(names[2]);
		String[] names = { "にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ" };

		// for文を用いて、「私の名前は◯◯です」と出力してください
		for (int i = 0; i < names.length; i++) {
			System.out.println("私の名前は" + names[i] + "です");
		}
		for (String name : names) {
			System.out.println("私の名前は" + name + "です");
		}

		int[] numbers = { 1, 4, 6, 9, 13, 16 };

		int oddSum = 0;
		int evenSum = 0;

		// for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
		for (int number : numbers) {
			if (number % 2 == 0) {
				evenSum += number;

			} else {
				oddSum += number;
			}
		}
		int z = 2;
		if (z % 2 == 0) {
			if (x >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if (x >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}

		//	x は y より小さく、かつ、x と y は共に偶数である。
		//	x と y は等しく、かつ、負の数である。
		//	x は y より小さい、または、x は偶数である。
		//	x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
		//	x も y も負の数である、ではない。（ x も y も負の数である、の否定）
		int y;
		if (x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}
		if (x == y && x < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		}
		if (x < y || x % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
		if (x <= 10 || x >= 100 && 10 <= y && y <= 100) {
			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
		}
		if (!(x < 0 && y < 0)) {
			System.out.println("x も y も負の数である、ではない。（ x も y も負の数である、の否定）");
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wins = 0;
		for (int i = 0; i < 10; i++) {
			int result = Integer.parseInt(br.readLine());
			if (result == 1) {
				wins += 1;
			}
			System.out.println(wins + "かち");
		}
		int max_v = 0;
		int min_v = 0;
		for (int n = 0; n < 10; n++) {
			int v = Integer.parseInt(br.readLine());
			if(n==0) {
				 max_v = v;
				 min_v = v;
			}else {
				if(v>max_v) {
					max_v=v;
				}
				if(v<min_v){
					min_v=v;
				}
					
			}
		}
		System.out.println("最小"+min_v + "最大："+max_v);
		
		
		
		 
			    printData(fullName("Kate", "Jones"), 27);
			    
			    // fullNameメソッドを用いて、printDataの引数を書き換えてください
			    printData(fullName("John", "Christopher", "Smith"), 65);
			  }

			  public static void printData(String name, int age) {
			    System.out.println("私の名前は" + name + "です");
			    System.out.println("年齢は" + age + "歳です");
			  }

			  public static String fullName(String firstName, String lastName) {
			    return firstName + " " + lastName;
			  }
			  
			  // fullNameメソッドを定義してください
			  public static String fullName(String firstName,String middleName,String lastName){
			    return firstName + " " + middleName + " " + lastName;
			  }
			  public static void main(String[] args) {
				    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
				    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
				  }

				  public static void printData(String name, int age, double height, double weight) {
				    System.out.println("私の名前は" + name + "です");
				    System.out.println("年齢は" + age + "歳です");
				    System.out.println("身長は" + height + "mです");
				    System.out.println("体重は" + weight + "kgです");
				    
				    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
				    double bmi= bmi(height,weight);
				    
				    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
				    System.out.println("BMIは"+bmi+"です");
				    
				  }

				  public static String fullName(String firstName, String lastName) {
				    return firstName + " " + lastName;
				  }
				  
				  public static String fullName(String firstName, String middleName, String lastName) {
				    return firstName + " " + middleName + " " + lastName;
				  }
				  
				  // bmiメソッドを定義してください
				  
				  public static double bmi(double height,double weight){
				    return weight / height / height;
				  }
				  Scanner scanner = new Scanner(System.in);
				    
				    System.out.print("名前： ");
				    
				    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
				    String name = scanner.next();
				    
				    // 「こんにちは◯◯さん」と出力してください
				     System.out.print("こんにちは"+name+"さん");
		

	}
}
