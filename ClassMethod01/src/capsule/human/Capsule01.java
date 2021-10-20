package capsule.human;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");
		HumanCapsule human2 =new HumanCapsule("さかもと",50);
		System.out.println("名前は"+human2.getName()+human2.getName());
		human2.setName("長野");
		System.out.println("変更した名前は"+human2.getName());
	}
	
}
