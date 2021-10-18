
public class part2 {
	public static void main(String[] args) {
		//		System.out.println("ようこそ　名前入力してください");
		//		String name = new java.util.Scanner(System.in).nextLine();
		//		System.out.println("年齢入力してください");
		//		String ageString = new java.util.Scanner(System.in).nextLine();
		//		int age = Integer.parseInt(ageString);
		//		int fortune = new java.util.Random().nextInt(4);
		//		fortune++;
		//		System.out.println(age+"さいno"+name+"さんの運気は"+fortune);
		//		;
//		int isHungry = 1;
//		String food = "魚";
//		System.out.println("こんにちは");
//
//		System.out.println(isHungry == 0 ? "お腹いっぱい" : "はらぺこ");
//		System.out.println(isHungry == 1 ? (food + "をいただきます") : "ご馳走さま");
//		//			System.out.println("お腹いっぱい");
//		//		} else {
//		//			System.out.println("はらぺこ");
//		System.out.println("［メニュー］1：検索 2：登録 3：削除 4：変更>");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch (selected) {
//		case 1:
//			System.out.println("1：検索 ");
//			break;
//		case 2:
//			System.out.println(" 2：登録");
//			break;
//		case 3:
//			System.out.println(" 3：削除>");
//			break;
//		case 4:
//			System.out.println(" 4：変更>");
//			break;
//		}

		System.out.print("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 9; i++) {
			System.out.print("数字をいれてください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(ans==num) {
				System.out.print("あたり");
				break;
			}else {
				System.out.print("ハズレ");
			}
		}
		System.out.print("終わり");
	}
}
