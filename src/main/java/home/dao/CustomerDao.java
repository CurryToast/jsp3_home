package home.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import home.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class CustomerDao {
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public List<CustomerDto> selectAll() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.selectAll");
		sqlSession.close();
		return list;
	}
	
	public List<CustomerDto> search(Map<String, Object> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.search", map);
		sqlSession.close();
		return list;
	}

	public int join(CustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustomer.join", dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int modify(CustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		CustomerDto temp = sqlSession.selectOne("tblcustomer.selectById", dto.getCustom_id());
		int result = sqlSession.update("tblcustomer.modify", new CustomerDto(
				dto.getCustom_id(),
				dto.getName() == null ? temp.getName() : dto.getName(),
				dto.getEmail() == null ? temp.getEmail() : dto.getEmail(),
				dto.getAge() == 0 ? temp.getAge() : dto.getAge(),
				null
		));
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int delete(String id) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustomer.delete", id);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
