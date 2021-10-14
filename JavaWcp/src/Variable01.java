
public class Variable01 {
	public static void main(String[] args) {
		int number = 10;

		// while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
		while (number > 0) {
			System.out.println(number);
			number--;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "回目のループです");
		}

		System.out.println("=== while文 ===");
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

		// for文を用いて、「私の名前は◯◯です」と出力してください
		//		for (int i = 0; i < names.length; i++) {
		//			System.out.println("私の名前は" + names[i] + "です");
		//		}

//		int[] numbers = { 1, 4, 6, 9, 13, 16 };
//
//		int oddSum = 0;
//		int evenSum = 0;
//
//		// for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
//		for (int number : numbers) {
//			if (number % 2 == 0) {
//				evenSum += number;
//			} else {
//				oddSum += number;
//			}
//		}
    int num1;
    String str1;
    num1= 10;
    str1="helloworld";
    System.out.println(num1);
	}
	
	public static void mains(String[] args) {
	    // printDataメソッドを呼び出してください
	   printData();
	    
	  }
	  
	  // printDataメソッドを定義してください
	  public static void printData(){
	    System.out.println("私の名前はKate Jonesです");
	  }
	  
	  
}
