//Fibonacci数列の各行は前の2項を足すことで生成される。1と2で出発し、最初の10項は次のようになる：
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …
//そのFibonacci数列で4百万を超えない項を考え、偶数値の合計を求
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
