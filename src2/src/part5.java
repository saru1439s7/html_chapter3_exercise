
public class part5 {
	public static void main(String[] args) {
		introduceOneself();

		String title = "情報";
		String address = "v6@vom";
		String text = "リリース";
		email(title, address, text);

		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(triangleArea);
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

	

	public static void introduceOneself() {
		String name = "Masayuki";
		int age = 50;
		double height = 180.7;
		System.out.println(name);

	}

	public static void email(String title, String adress, String text) {
		System.out.println(title);
		System.out.println(adress);
		System.out.println(text);
	}
}
