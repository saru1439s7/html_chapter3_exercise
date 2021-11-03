import java.util.Scanner;

//正の整数 NN が与えられます。
//NN の正の約数の個数
//
//正の整数 NN が与えられます。
//N = A \times BN=A×B
//を満たすような正の整数 A, BA,B のうち、A + BA+B の最小値
public class Yakusu_kosu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long res = 0;
		for (int i = 1; i < Math.sqrt(n); ++i) {
			if (n % i == 0) {
				res += 2;
			}
		}
		if (n % Math.sqrt(n) == 0)
			++res;
		System.out.println(res);
		sc.close();
////////////////////////////////////////
		Scanner sc1 = new Scanner(System.in);
		long n1 = sc1.nextLong();
		for (long i = (long) Math.sqrt(n1);; --i) {
			if (n1 % 1 == 0) {
				long res1 = i + n1 / i;
				System.out.println(res1);
				break;
			}
		}
		sc1.close();
	}
}
