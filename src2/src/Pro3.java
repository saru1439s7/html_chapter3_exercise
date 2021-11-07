
public class Pro3 {
	public static void main(String[] args) {
        int palindromicNumber = 0;
        for (int i = 999; i > 900; i--) {
            for (int j = 999 - (999 - i); j > 900; j--) {
                int n = i * j;
                if (checkPalindromicity(n) && palindromicNumber < n) {
                    palindromicNumber = n;
                }
            }
        }
        System.out.println(palindromicNumber);
        
    }

    private static boolean checkPalindromicity(int n) {
        return Integer.valueOf((new StringBuilder(String.valueOf(n)).reverse().toString())) == n;
    }
}
