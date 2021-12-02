public class rebsyuu5 {
	// int型配列を受け取り、
	// 配列内の要素すべてに1を加えるメソッド
	//public static void incArray(int[] array) {
	//	public static int[] makeArray(int size) {
	//	    int[] newArray = new int[size];
	//	    for (int i = 0; i < newArray.length; i++ ) {
	//	      newArray[i] = i;
	//	    }
	//	    return newArray;
	//	  }
	//	  public static void main(String[] args) {
	//	    int[] array = makeArray(3);
	//	    for (int i : array) {
	//	      System.out.println(i);
	//	    }
	//	  }

	public static void main(String[] args) {
		String adress = "p＠p";
		String text = "こんにちは";
		email(adress, text);
	}

	public static void email(String adress, String text) {
		System.out.println(adress + "から以下ないよう" + text);
	}
}
