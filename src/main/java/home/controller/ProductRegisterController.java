package home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.ProductDao;
import home.dto.CategoryDto;
import home.dto.ProductDto;

public class ProductRegisterController implements Controller {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDao();

		switch (request.getMethod()) {
			case "GET":
				List<CategoryDto> categoryList = dao.selectCategory();
				request.setAttribute("categoryList", categoryList);

				RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
				dispatcher.forward(request, response);
				break;
			case "POST":
				request.setCharacterEncoding("UTF-8");
				String pcode = request.getParameter("pcode");
				String category = request.getParameter("category");
				String pname = request.getParameter("pname");
				int price = Integer.parseInt(request.getParameter("price"));
	
				int result = dao.insert(new ProductDto(
					pcode, category, pname, price
				));
				
				if (result == 1) {
					response.sendRedirect("list");
				}
				break;
			default:
				break;
		}
	}
}
