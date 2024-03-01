package home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.CustomerDao;
import home.dto.CategoryDto;
import home.dto.CustomerDto;

public class CustomerJoinController implements Controller {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		CustomerDao dao = new CustomerDao();

		switch (request.getMethod()) {
			case "GET":
				RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
				dispatcher.forward(request, response);
				break;
			case "POST":
				request.setCharacterEncoding("UTF-8");
				String customId = request.getParameter("custom_id");
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				int age = Integer.parseInt(request.getParameter("age"));

				int result = dao.join(new CustomerDto(
					customId, name, email, age, null
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
