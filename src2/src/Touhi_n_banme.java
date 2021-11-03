import java.util.Scanner;

//等比数列n番目の数
public class Touhi_n_banme {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double result2; //等比数列の合計値

		System.out.println("等比数列のn番目の数を求めます。");
		System.out.print("初項a：");
		int a = stdIn.nextInt();
		System.out.print("公比r：");
		int r = stdIn.nextInt();
		System.out.print("何番目の数を求めますか：");
		int n = stdIn.nextInt();

		double result = a * Math.pow(r, n - 1); // n番目の数を求める
		System.out.println("「n番目は" + Math.round(result) + "」です。");

		if (r != 1) {
			result2 = a * (Math.pow(r, n) - 1) / (r - 1);
		} else {
			result2 = n * a;
		}
		System.out.println("「和は" + Math.round(result2) + "」です。");

	}
}
