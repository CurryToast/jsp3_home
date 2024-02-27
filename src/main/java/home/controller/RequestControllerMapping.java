package home.controller;

import java.util.HashMap;
import java.util.Map;


public class RequestControllerMapping {
	// Key는 url, method로 구성된 RequestMap 객체, value는 Controller
	private static final Map<RequestMap, Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/customer", "GET"), null);
	}
	
	public static Controller getController(RequestMap key) {
		return mapping.get(key);
	}
}
