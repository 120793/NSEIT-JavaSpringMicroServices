package corejavaexamples.collections;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> states1 = new HashMap();
		states1.put("MH", "Maharashtra");
		states1.put("KA", "Karnaktaka");
		states1.put("TS", "Telengana");
		states1.put("TN", "Tamilnadu");
		System.out.println(states1);

		Map<String, String> states2 = new HashMap();
		states1.put("DL", "Delhi");
		states1.put("KL", "Kerala");
		states1.put("WB", "WestBengal");
		states1.put("OR", "Orrisa");

		states1.putAll(states2);
		System.out.println(states1);

		states1.remove("OR", "Orrisa");
		System.out.println(states1);

		System.out.println("The kyes are:" + states1.keySet());
		System.out.println("The values are:" + states1.values());

		if (states1.containsKey("KA")) {
			System.out.println("KA is available");
		} else {
			System.out.println("not available");
		}
		if (states1.containsValue("Telengana")) {
			System.out.println("Telengana is available");
		} else {
			System.out.println("not available");
		}
		System.out.println("The value for given key TS is:" + states1.get("TS"));
		System.out.println(states1.size());

	}

}
