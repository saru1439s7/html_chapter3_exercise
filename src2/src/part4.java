
public class part4 {
	public static void main(String[] args) {
		int[] scores = { 20, 30, 50, 60, 90 };
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 50) {
				count++;
			}
		}
		System.out.println(count + "けん");
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("平均:" + avg);
		System.out.println("合計:" + sum);
		
		
//		
//		// 塩基配列をランダムに生成
//		for (int i = 0; i < seq.length; i++) {
//		seq[i] = new java.util.Random().nextInt(4);
//	}
//	// 生成した塩基配列の記号を表示
//	for (int i = 0; i < seq.length; i++) {
//		char[] base = { 'a','t','g','c'};
//		System.out.println(base[seq[i]],"");
		
		int[] moneyList= {1111,2222,4444};
		for(int i =0;i<moneyList.length;i++) {
			System.out.println(moneyList[i]);
		}
		for(int m: moneyList) {
			System.out.println(m);
		}
		
	}
}
