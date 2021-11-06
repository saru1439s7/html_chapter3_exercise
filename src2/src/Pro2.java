
public class Pro2 {
	public static void main(String arg[]) {
		int a;
		int b =1;
		int term =2;
		int sum = 2;
		while(term <4000000) {
			a=b;
			b=term;
			term = a+b;
			if(term%2==0) {
				sum += term;
			}
		}
		System.out.println(sum);
	}
}
