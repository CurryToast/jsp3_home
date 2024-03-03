package home.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.CustomerDao;
import home.dto.CustomerDto;

public class CustomerListController implements Controller {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("customerId");
		String name = request.getParameter("name");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String column = request.getParameter("column");
		
		Map<String, Object> map = new HashMap<String, Object>();
		if (id != null && id.isEmpty() == false) {
			map.put("customerId", id);
			request.setAttribute("id", id);
		}
		if (name != null && name.isEmpty() == false) {
			map.put("name", name);
			request.setAttribute("name", name);
		}
		if (
			from != null && from.isEmpty() == false &&
			to != null && to.isEmpty() == false
		) {
			map.put("from", from);
			map.put("to", to);
			request.setAttribute("from", from);
			request.setAttribute("to", to);
		}
		if (column != null && column.isEmpty() == false) {
			map.put("column", column);
			request.setAttribute("column", column);
			
			String desc = request.getParameter("desc");
			if (desc != null && desc.equals("true")) {
				map.put("desc", desc);
				request.setAttribute("desc", desc);
			}
		}
		
		CustomerDao dao = new CustomerDao();
		List<CustomerDto> list = dao.search(map);
		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);
	}
}
