//
//a = m² - n² または n² - m²
//b = 2mn
//c = m² + n²
//上記条件を満たす値(a, b, c) がピタゴラス数
public class Pitagora {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		int count = 0;

		for (int i = 1; i < 100; i = i + 2) {
			for (int j = 2; j < 100; j = j + 2) {
				//a=m2-n2
				double m = Math.pow(i, 2);
				double n = Math.pow(j, 2);
				if (m < n) {
					a = n - m;
				} else {
					a = m - n;
				}
				//b=2mn
				b = 2 * i + j;
				//c=m+n
				c = m + n;

				if (Math.pow(c, 2) <= 6000) {
					count++;
				}
				System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			}
		}
		System.out.println("c²が6000以下のピタゴラスの定理は[" + count + "]件ありました");
	}
}
