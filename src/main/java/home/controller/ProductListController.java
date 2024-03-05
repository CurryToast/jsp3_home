package home.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.ProductDao;
import home.dto.CategoryDto;
import home.dto.ProductDto;

public class ProductListController implements Controller {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String column = request.getParameter("column");
		
		Map<String, Object> map = new HashMap<>();
		if (category != null && category.isEmpty() == false) {
			map.put("category", category);
			request.setAttribute("category", category);
		}
		if (keyword != null && keyword.isEmpty() == false) {
			map.put("keyword", keyword);
			request.setAttribute("keyword", keyword);
		}
		if (
			from != null && from.isEmpty() == false &&
			to != null && !to.isEmpty()
		) {
			map.put("from", from);
			map.put("to", to);
		}
		if (column != null && column.isEmpty() == false) {
			map.put("column", column);

			String desc = request.getParameter("desc");
			if (desc != null && desc.equals("true")) {
				map.put("desc", desc);
				request.setAttribute("desc", desc);
			}
		}

		ProductDao dao = new ProductDao();
		List<ProductDto> list = dao.search(map);
		request.setAttribute("list", list);
		
		List<CategoryDto> categoryList = dao.selectCategory();
		request.setAttribute("categoryList", categoryList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);
	}
}
