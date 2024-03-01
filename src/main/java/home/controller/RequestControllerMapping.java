package home.controller;

import java.util.HashMap;
import java.util.Map;


public class RequestControllerMapping {
	// Key는 url, method로 구성된 RequestMap 객체, value는 Controller
	private static final Map<RequestMap, Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/customer/list", "GET"), new CustomerListController());
		mapping.put(new RequestMap("/customer/join", "GET"), new CustomerJoinController());
		mapping.put(new RequestMap("/customer/join", "POST"), new CustomerJoinController());
		mapping.put(new RequestMap("/product/list", "GET"), new ProductListController());
		mapping.put(new RequestMap("/product/register", "GET"), new ProductRegisterController());
		mapping.put(new RequestMap("/product/register", "POST"), new ProductRegisterController());
	}
	
	public static Controller getController(RequestMap key) {
		return mapping.get(key);
	}
}
