//最初の10個の自然数について, その二乗の和は,
//12 + 22 + ... + 102 =(1+4+9+16+)= 385
//最初の10個の自然数について, その和の二乗は,
//(1 + 2 + ... + 10)2 = 3025
//これらの数の差は 3025 - 385 = 2640 となる.
//同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.
public class Pro6 {
	public static void main(String args[]) {
		int sum_of_squares = 0; //二乗の和--(1)
		int square_of_sum = 0; //和の二乗--(2)
		int Sum = 0;

		for (int i = 1; i < 101; i++) {
			//二乗の和を求める--(1)
			int square = (int) Math.pow(i, 2);
			sum_of_squares += square;
			//和を求める--(2)
			Sum += i;
		}
		//和の二乗を求める--(2)
		square_of_sum = (int) Math.pow(Sum, 2);

		int Difference = square_of_sum - sum_of_squares; //二乗の和と和の二乗の差
		System.out.println("sum_of_squares　二乗の和 = " + sum_of_squares);
		System.out.println("square_of_sum 和の二乗= " + square_of_sum);
		System.out.println("100個の自然数について二乗の和と和の二乗の差　Difference is = " + Difference);
	}
}
