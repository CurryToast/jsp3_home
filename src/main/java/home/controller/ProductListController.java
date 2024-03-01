package home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.CustomerDao;
import home.dao.ProductDao;
import home.dto.CustomerDto;
import home.dto.ProductDto;

public class ProductListController implements Controller {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		List<ProductDto> list = dao.selectAll();
		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);
	}
}
