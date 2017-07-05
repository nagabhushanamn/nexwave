package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_Colln_Demo {

	public static void main(String[] args) {

		// Map<String, String> map = new TreeMap<>((key1, key2) -> {
		// return key2.compareTo(key1);
		// });
		// Map<String, String> map = new HashMap<>();
		Map<String, String> map = new LinkedHashMap<>();

		map.put("123", "Java");
		map.put("127", "JEE");
		map.put("126", "Spring");
		map.put("124", "JEE");

		// -----------------------------------------------

		// System.out.println(map.get("126"));

		// ----------------------------------------------
		//
		// Set<String> keys = map.keySet();
		//
		// for (String key : keys) {
		// System.out.println(key + "->" + map.get(key));
		// }

		String sub = map.get("126");

	}

}
