//10以下の素数の和は 2 + 3 + 5 + 7 = 17 である.
//200万以下の全ての素数の和を求めよ.
public class Pro10 {
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

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i < 2000000; i++)
			if (isPrime(i))
				sum += i;
		System.out.println(sum);
	}
}
