package mybatis;

import java.util.List;

import home.dao.CustomerDao;
import home.dao.ProductDao;
import home.dto.CustomerDto;
import home.dto.ProductDto;

public class MybatisSessionTest {
	public static void main(String[] args) {
		playCustomerDao();
		playProductDao();
//		playBuyDao();
	}
	
	private static void playCustomerDao() {
		CustomerDao dao = new CustomerDao();
		List<CustomerDto> list = dao.selectAll();
		
		System.out.println("===== select 테스트 =====");
		System.out.println("@@@@@ list : " + list);
	}
	
	private static void playProductDao() {
		ProductDao dao = new ProductDao();
		List<ProductDto> list = dao.selectAll();
		
		System.out.println("===== select 테스트 =====");
		System.out.println("@@@@@ list : " + list);
	}
	
	private static void playBuyDao() {
	}
}
