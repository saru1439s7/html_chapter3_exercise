
public class Main {
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

	}
}
