package com.exeter.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exeter.model.ClassDAO;
import com.exeter.model.ClassDAOImpl;


@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ClassDAO dao=new ClassDAOImpl();
		dao.connectDB();
		
		boolean resultStatus = dao.verifyLogin(email, password);

		if (resultStatus == true) {
			request.setAttribute("LoginError", "invalid uername/password");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/newReg.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("LoginError", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}

	
	}

}
