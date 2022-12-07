package com.carpet.utils;

import java.util.HashMap;
import java.util.Map;

public class Utils {

	
	public static Map<String, String> getDirectoryMap() {
		Map<String,String> directorMap = new HashMap<>();
		directorMap.put("hand_knotted", "hand_knotted");
		directorMap.put("natural_hand_knotted", "natural_hand_notted");
		directorMap.put("pet_loom_durry", "pet_loom_durry");
		directorMap.put("fur_polyester", "fur_ployester");
		directorMap.put("kilim_durry", "kilim_durry");
		return directorMap;
	}
	
	
	
}
