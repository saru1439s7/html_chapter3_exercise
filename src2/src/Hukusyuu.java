//package practice;
//20個数の配列で初項はa0,初項0,5の等差数列数列
//a1-a10の項数が奇数である項の数と、合計値　a11-a20項数が偶数である項の数と、合計値

public class Hukusyuu {
	public static void main(String[] args) {
		int[] a = new int[20];

		for (int i = 0; i <= a.length; i++) {
			
			a[i] = i * 5;
			
						if (i % 2 == 0) {
							if (i <= 10) {
								System.out.print("奇数"+a[i]);
								System.out.println("");
							}
						} else {
							if (i > 10) {
							System.out.print("偶数"+a[i]);
						}
						}
		}

	}
}
