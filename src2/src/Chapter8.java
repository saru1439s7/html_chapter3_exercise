
public class Chapter8 {
	public static void main(String[] args) {

		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("" + number);
		}
		int number2 = 1;
		do {
			number2 *= 2;
			System.out.println(number2);
		} while (number2 < 50);

		int[] array = { 1, 2, 3, 4, 5 };
		for (int number3 : array) {
			System.out.println("number3" + number3);
		}

		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				// countが2の場合、for文を終了
				break;
			}
			System.out.println("Break01 = " + count);
		}
		//		　1.「while」文
		//		　・1以上5未満の数の2乗を出力
		//		　2. 通常「for」文
		//		　・要素数が4の「int」配列を初期化
		//		　・配列のサイズ分ループして、要素を出力
		//		　　※ 配列のサイズは「変数名.length」で取得が可能
		//		　3. 拡張「for」文
		//		　・「2.」の配列をループ
		//		　・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		int number5 = 1;
		while (number5 < 5) {
			System.out.println("１の答え"+number5*number5);
		}
		
	}

}
