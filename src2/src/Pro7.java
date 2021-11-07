
public class Pro7 {
	//	素数を小さい方から6つ並べると 2, 3, 5, 7, 11, 13 であり, 6番目の素数は 13 である.
	//	10 001 番目の素数を求めよ.
	public static void main(String arg[]) {
		  System.out.println(nthPrime(10001));
	}
	 // * n番目の素数を返します* /
	public static long nthPrime(long n) {
		int numberOfPrimes = 0;
		long prime = 1;

		while (numberOfPrimes < n) {
			prime++;
			if (isPrime(prime)) {
				numberOfPrimes++;
			}
		}
		return prime;
	}
//	  / *パラメータnが素数の場合はtrueを返し、合成数の場合はfalseを返します。* /
	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		else if (n == 2)
			return true;
		for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
			if (n % i == 0)
				return false;
		return true;

	}
}
