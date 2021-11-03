import java.util.Scanner;

public class Tousa {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int result;
		int result22;

		System.out.print("初項a：");
		int a = stdIn.nextInt();
		System.out.print("公差d：");
		int d = stdIn.nextInt();
		System.out.print("何番目のわ数を求めますか：");
		int n = stdIn.nextInt();

		if (n == 0) {
			result= 1;
		}else {
			result = a*n+ (n*(n-1)*d)/2;
		}
		int result221 = a+(n-1)*d;
		System.out.print("和"+result);
		System.out.print(",,,項の数字"+result221);
	}

}
