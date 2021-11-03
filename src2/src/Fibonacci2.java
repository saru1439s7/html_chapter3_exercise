import java.util.HashMap;
import java.util.Map;

public class Fibonacci2 {

	// n に対するフィボナッチ数Fnを格納するためのマップ
	private static final Map<Integer, Long> FIB_MAP = new HashMap<>();
	static {
		FIB_MAP.put(0, 0L);
		FIB_MAP.put(1, 1L);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int n = 5;
		long sum = fib(n);

		long end = System.currentTimeMillis();
		System.out.printf("Fibonacci2 fib: (%d) -> %d \ntime: %d(ms)\n", n, sum, (end - start));

	}

	private static long fib(int num) {
		return FIB_MAP.computeIfAbsent(num, i -> fib(num - 1) + fib(num - 2));
	}

}
