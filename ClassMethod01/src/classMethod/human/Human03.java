package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "さかもと";
		this.age = 50;
		this.profession = "ダンサー";
	}

	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) { //String型の値はnullの可能性があるのでチェック
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
