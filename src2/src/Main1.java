import java.util.HashMap;
import java.util.Map;

public class Main1 {
 public static void main(String[] args) {
	 Map<String,Integer>prefs = new HashMap<String,Integer>();
	 prefs.put("京都府", 255);
	 prefs.put("東京都", 365);
	 prefs.put("神奈川県", 288);
	 int tokyo = prefs.get("東京都");
	 System.out.println(tokyo);
	 for (String key : prefs.keySet()) {
		 int value = prefs.get(key);
		 System.out.println(key+value);
	 }

 }
}
