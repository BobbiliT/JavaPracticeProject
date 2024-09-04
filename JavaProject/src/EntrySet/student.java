package EntrySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class student {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(10, "tejesh");
		mp.put(20, "kamesh");
		mp.put(30, "naresh");
		mp.put(40, "ramesh");
		Set<Entry<Integer, String>> s = mp.entrySet();
		for (Entry<Integer, String> e : s) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.println("{" + key + "=" + value + "}");
		}
	}
}
