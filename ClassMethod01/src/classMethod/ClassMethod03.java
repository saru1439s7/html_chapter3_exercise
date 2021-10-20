package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
    public static void main(String[] args) {
        Human03 sakamoto = new Human03();

        System.out.println("私の名前は、" + sakamoto.name + "です。");
        String profile = sakamoto.getProfile();
        System.out.println(profile + "です。");

        sakamoto.greet("田辺");
        sakamoto.greet(null);
    }
}