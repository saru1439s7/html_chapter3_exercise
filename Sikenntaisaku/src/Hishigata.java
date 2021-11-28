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
		for(int i =0 ;i<a;i++) {
			for(int x= 0;x<i;x++) {
				System.out.print(" ");
			}
			for( int y=0;y<(a-i)*2-1;y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
