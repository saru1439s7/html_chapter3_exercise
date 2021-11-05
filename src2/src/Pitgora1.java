import java.util.Scanner;

//　直角三角形の組み合わせ
public class Pitgora1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
//a、b、c の各個について総当たりで、a2 = b2 + c2 が成立するか調べ、成立したときに
				//a、b、c の値を表示す
		int a;
		int b;
		int c;
		
		System.out.print("dn入力");
		int d = stdIn.nextInt();
		int n = stdIn.nextInt();
		for (a = 1; a <= n; a++) {
			for (b = 1; b <= n; b++) {
				for (c = 1; c <= n; c++) {
					if (a * a == b * b + c * c) {
						System.out.print("a" + a);
						System.out.print("b" + b);
						System.out.print("c" + c);
					}
				}
			}
		}
		return;
	}
}
