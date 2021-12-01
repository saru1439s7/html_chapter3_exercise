
public class rebsyuu5 {
	public static void main(String[] args) {
		introduceOneself();
		String adress = "d@dddd";
		String title = "こんにちは";
		String body = "内容"+ "";

		mail(adress,title,body);
	}

	public static void mail(String adress,String title,String body) {
		System.out.println(adress);
		System.out.println("タイトル"+title+"内容"+body);
	}

}