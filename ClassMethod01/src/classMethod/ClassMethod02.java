package classMethod;

// インポート文
import classMethod.human.Human02;

public class ClassMethod02 {
    public static void main(String[] args) {
        Human02 sakamoto = new Human02();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sakamoto.name + "で、年齢は" + sakamoto.age + "です。");

        Human02 sato = new Human02("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}