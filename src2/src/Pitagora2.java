/*ピタゴラス数(ピタゴラスの定理を満たす自然数)とは a < b < c で以下の式を満たす数の組である.
a2 + b2 = c2
例えば, 32 + 42 = 9 + 16 = 25 = 52 である.
a + b + c = 1000 となるピタゴラスの三つ組が一つだけ存在する.
これらの積 abc を計算 */
public class Pitagora2 {
	public static void main(String arg[]) {
		for (int a = 1; a <= 332; a++) {
			for (int b = a + 1; b <= 777 - a; b++) {
				for (int c = b + 1; a + b + c <= 1000; c++) {
					if (a + b + c == 1000) {
						if (a * a + b * b == c * c) {
							System.out.println("a=" + a);
							System.out.println("b=" + b);
							System.out.println("c=" + c);
							System.out.println("a * b * c=" + a * b * c);

						}
					}
				}
			}
		}
	}
}
