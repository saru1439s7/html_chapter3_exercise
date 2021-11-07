//2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
//では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
public class Pro5 {
	   public static void main(String[] args) {

	        int number = -1;

	        for (int i = 20; i < Integer.MAX_VALUE; i++) {
	            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0
	                    && i % 16 == 0 && i % 14 == 0 && i % 13 == 0
	                    && i % 11 == 0) {
	                number = i;//w w  w.ja v  a2  s  .  c  om
	                break;
	            }
	        }

	        System.out.println(number);

	    }
}
