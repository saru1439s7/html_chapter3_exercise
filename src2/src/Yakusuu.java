import java.util.Scanner;

public class Yakusuu {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;
		int sum2 =0;
		System.out.print("調べたい数：");
		int a = stdIn.nextInt();

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i < 30000000) {
				sum++;
				sum2+= i;
				System.out.println(i);
				System.out.println(sum2);
			}
		}

		System.out.println("約数の総数は" + sum + "個です");
	}

}