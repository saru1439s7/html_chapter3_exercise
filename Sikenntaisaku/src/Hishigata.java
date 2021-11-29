//1    *
//2   * *
//3  *   *
//4 *     *
//5*       *
//6 *     *
//7  *   *
//8   * *
//9    *
public class Hishigata {
	public static void main(String[] args) {
		int a = 7;
		//Integer.parseInt(args[0]);
		for (int i = 0; i < a; i++) {
			for (int x = 0; x < a - (i + 1); x++) {
				System.out.print(" ");
			}
			for (int y = 0; y < (i + 1) * 2 - 1; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < a - 1; i++) {

			for (int x = 0; x < i + 1; x++) {
				System.out.print(" ");
			}
			for (int y = 0; y < (a - i - 1) * 2 - 1; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("中身あきの菱形");
		for (int i = 0; i < a; i++) {
			for (int x = 0; x < a - (i + 1); x++) {
				System.out.print(" ");
			}
			//最初のy=0と一番最後の数字だけ*にする
			for (int y = 0; y < (i + 1) * 2 - 1; y++) {
				String s = " ";
				if (y == 0 || y == (i + 1) * 2 - 2) {
					s = "*";
				}
				System.out.print(s);
			}
			System.out.print("\n");
		}
		for (int i = 0; i < a - 1; i++) {

			for (int x = 0; x < i + 1; x++) {
				System.out.print(" ");
			}
			for (int y = 0; y < (a - i - 1) * 2 - 1; y++) {
				String s = " ";
				if (y == 0 || y == (a - i - 1) * 2 - 2) {
					s = "*";
				}
				System.out.print(s);
			}
			System.out.print("\n");
		}
		System.out.print("中心を(0,0として考え流方法)");
		System.out.print("\n");


		//別解
		//7×7の正方形で中心を(0.0)
		//たて,横
		//http://www.javaroad.jp/bbs/answer.jsp?q_id=20080407110225731

		int n=5;
		for (int i =  - n; i <= n; i++) {
			for (int j =  - n; j <= n; j++)
				System.out.print(
						Math.abs(i + j) == n  || Math.abs(i - j) == n  ? '*' : ' ');
			System.out.println();
		}
	}
}
