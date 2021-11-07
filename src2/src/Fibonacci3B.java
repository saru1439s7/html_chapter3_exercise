import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fibonacci3B {
//大きいフィボナッチ数
    private static final BigInteger ZERO = BigInteger.ZERO;
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = ONE.add(ONE);

    private static final Map<BigInteger, BigInteger> FIB_MAP = new HashMap<>();
    static {
        FIB_MAP.put(ZERO, ZERO);
        FIB_MAP.put(ONE, ONE);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int n = 32;
        IntStream.range(1, n)
                .forEach(i -> fib(BigInteger.valueOf(i)));

        BigInteger sum = fib(BigInteger.valueOf(n));

        long end = System.currentTimeMillis();
        System.out.printf("Fibonacci3 fib(%d) -> %d\ntime: %d(ms)\n", n, sum, (end - start));

    }

    private static BigInteger fib(BigInteger num) {
        return FIB_MAP.computeIfAbsent(num, key -> fib(num.subtract(ONE)).add(fib(num.subtract(TWO))));
    }
    
}