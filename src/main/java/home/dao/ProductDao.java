package home.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import home.dto.CategoryDto;
import home.dto.ProductDto;
import mybatis.SqlSessionBean;

public class ProductDao {
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public List<ProductDto> selectAll() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproducts.selectAll");
		sqlSession.close();
		return list;
	}

	public List<ProductDto> search(Map<String, Object> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproducts.search", map);
		sqlSession.close();
		return list;
	}

	public List<CategoryDto> selectCategory() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CategoryDto> categoryList = sqlSession.selectList("tblproducts.selectCategory");
		sqlSession.close();
		return categoryList;
	}

	public int insert(ProductDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblproducts.insert", dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
