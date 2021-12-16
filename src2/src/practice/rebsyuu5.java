
package practice;

class rebsyuu5 {
	public static void main(String[] args) {
		int[] ages = { 20, 30, 51 };
		for (int age : ages) {
			System.out.println(age);
		}
	}
}
//public static void main(String[] args) {
//	int[] ages = { 10, 20, 51 };
//	System.out.println(Arrays.toString(ages));
//}
//for (int i = 1; i <= 9; i++) {
//  for (int j = 1; j <= 9; j++) {
//      System.out.print(i + "×" + j + "=" + i * j + "\t"); //最後のタブは見やすさのため
//  }
//  System.out.println(""); //改行のため
//}
//class rebsyuu5 {
//	public static void main(String[] args) {
//		char c ='y';
//		String result;
//		result = (c=='y')?"YES":"NO";
//		System.out.println(result);
//		
//	}
//}
////	//.２次元配列
////	public static void main(String[] args) {
////	 int[] []scores  ={
////			 {100, 80, 903, 901},
////	         {90, 90, 90, 90},
////	         {60, 90, 80, 70}
////	 };
////	 System.out.println(scores[0][3]);
////	 System.out.println(scores[0][2]);
//////	 System.out.println("以下");
//////	 for(int[] score: scores) {
//////		 for(int i :score) {
//////			 System.out.println(i);
////		 }
////	 }
////	 }
////}
//////	public static void main(String[] args) {
//////		 double fuelCost = 12.5;
//////	        // 残量（L）
////	        double fuelAmount = 55.0;
////
////	        Car car = new Car(fuelCost, fuelAmount);
////
////	        car.move(20);
////	        System.out.println("残量は、" + car.getFuelAmount() + "です");
////	    }
////	}
////}
//////class Car extends Vehicle {
////	  // インスタンスフィールドfuelを定義してください
////	  private int fuel = 50;
////	  
////	  // fuelフィールドのゲッターを定義してください
////	  public int getFuel(){
////	    return this.fuel;
////	  }
////	  
////	  // インスタンスメソッドchargeを定義してください
////	  
////	  
////	  public void charge(int litre) {
////	    System.out.println(litre + "L給油します");
////	    if (litre <= 0) {
////	      System.out.println("給油できません");
////	    } else if (litre + this.fuel >= 100) {
////	      System.out.println("満タンまで給油します");
////	      this.fuel = 100;
////	    } else {
////	      this.fuel += litre;
////	    }
////	    System.out.println("ガソリン量：" + this.fuel + "L");
////	  }
////	}
////
//////	public static void main(String[] args) {
//////
//////		double triangleArea = calcTriangleArea(10.0, 5.0);
//////		System.out.println(triangleArea);
//////		double CircleArea = clacCircleArea(4.0);
//////		System.out.println(CircleArea);
//////	}
//////	
//////
//////	public static double calcTriangleArea(double bottom, double height) {
//////		double area = (bottom * height) / 2;
//////		return area;
//////	}
//////
//////	public static double clacCircleArea(double radius) {
//////		double area = radius * radius * 3.14;
//////		return area;
//////
//////	}
//////}
//////	public static void main(String args[]) {
//////		int number =12;
//////		switch(number%3){
//////	      case 0 :
//////	        System.out.println("3で割り切れます");
////	        break;
////	        case 1 :
////	        System.out.println("3で割ると1余ります");
////	        break;
////	        case 2:
////	        System.out.println("3で割ると2余ります");
////	        break;
////	    }
////		while(number>0){
////		      System.out.println(number);
////		      number -=1;
////		    }
////
////		for(int i = 1;i<=10;i++){
////		      System.out.println(i+"回目のループです");
////		    }
////	  }
////
////	}
//////	public static void main(String args[]) {
//////		Television tv1 = new Television();
//////		Television tv2 = new Television();
//////
//////		tv1.setPlace("居間");
//////		tv2.setPlace("寝室");
//////
//////		tv1.setChannel(1);
//////		tv2.setChannel(8);
//////
////		tv1.dispChannel();
////		tv2.dispChannel();
////	}
////}
////
////class Television {
////	int channelNo;
////	String place;
////
////	void setChannel(int newChannelNo) {
////		channelNo = newChannelNo;
////	}
////
////	void setPlace(String newPlace) {
////		place = newPlace;
////	}
////
////	void dispChannel() {
////		System.out.println(place + "にあるテレビの現在のチャンネルは " + channelNo + " です");
////	}
//
////	public static void main(String[] args) {
////		//よくわからん。。。あとでもう一度
////		// フラグ用変数 flag に false を代入します
////		boolean flag = false;
////		// 1 から 10 まで繰り返します
////		for (int i = 1; i <= 10; i++) {
////
////			// フラグが立っているか判定します
////			if (!flag) {
////
////				//表示
////				System.out.print(i);
////
////				// フラグを立てます
////				flag = true;
////
////				//条件に当てはまらない場合
////			} else {
////				//表示
////
////				System.out.print("," + i);
////			}
////		}
////	}
////}
////	//	1～20までの偶数の合計値を求め、その時に何回計算を行ったか計算回数を表示するプログラムを作成しなさい。
////	public static void main(String[] args) {
////		int sum = 0;
////		int count = 0;
////		for (int i = 1; i < 21; i++) {
////			if (i % 2 == 0) {
////				sum += i;
////				count++;
////			}
////		}
////		System.out.println("1～20までの偶数の合計値" + sum + "その時に" + count + "回計算を行った");
////
////	}
////}
////public static void main(String[] args) {
////	int count = 0;
////	for (int i = 1; i < 11; i++) {
////		if (i % 2 == 0) {
////			count ++;
////		}
////	}
////	System.out.println(count);
////}
////	//0～1まで『10,9,8(途中省略）,1』と表示させるプログラムを作成しなさい。
////	public static void main(String[] args) {
////		for (int i=10;i>0;i--) {
////			if(i==1) {
////				System.out.print(i);
////				break;
////			}
////			System.out.print(i+",");
////		}
////	}
////}
////	public static void main(String[] args) {
////		double triangleArea = calcTriangleArea(10.0, 5.0);
////	    System.out.println("三角形の面積：" + triangleArea + "平方cm");
////	    double circleArea = calcCircleArea(5.0);
////	    System.out.println("円の面積：" + circleArea + "平方cm");
////
////	}
////	public static double calcTriangleArea(double bottom,double height) {
////		double area = 	(bottom*height)/2;
////		return area;
////	}
////	public static double calcCircleArea(double radius) {
////		double area = radius*radius*3.14;
////		return area;
////	}
////}
//// int型配列を受け取り、
//// 配列内の要素すべてに1を加えるメソッド
////public static void incArray(int[] array) {
////	public static int[] makeArray(int size) {
////	    int[] newArray = new int[size];
////	    for (int i = 0; i < newArray.length; i++ ) {
////	      newArray[i] = i;
////	    }
////	    return newArray;
////	  }
////	  public static void main(String[] args) {
////	    int[] array = makeArray(3);
////	    for (int i : array) {
////	      System.out.println(i);
////	    }
////	  }
////
////	public static void main(String[] args) {
////		String adress = "p＠p";
////		String text = "こんにちは";
////		email(adress, text);
////	}
////
////	public static void email(String adress, String text) {
////		System.out.println(adress + "から以下ないよう:" + text);
////	}
