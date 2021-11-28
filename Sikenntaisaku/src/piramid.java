//*********
// *******
//  *****
//   ***
//    *
//を作る
//(条件1)そこから両端が消える→じゃなくて左端にスペース" "が5段-(段数-1)入る
//(条件2)一段目は9個スタートして２個ずつ減ずる (段数*2)-1
//
//(1)(2)で一つの行が作成され、これを繰り返す→この場合5行
public class piramid {
	public static void main(String[] args) {
		//5回繰り返す
		for (int i = 0; i<5; i++) {
			//スペースをあける[0]0,[1]1,[2]2,[3]3...
			for (int x = 0; x < i ; x++) {
				System.out.print(" ");
			}
			//9-2iずつ減ずる
			for (int l = 0; l <(5-i)*2-1; l++) {
				System.out.print("＊");
			}
			System.out.print("\n");
		}
//prinlnすると文字列の表示後に改行される

	}
}
