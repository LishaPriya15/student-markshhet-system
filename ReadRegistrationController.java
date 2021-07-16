package com.exeter.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exeter.model.ClassDAO;
import com.exeter.model.ClassDAOImpl;


@WebServlet("/readReg")
public class ReadRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadRegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassDAO dao=new ClassDAOImpl();
		dao.connectDB();
		
		ResultSet result = dao.readAllReg();
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/displayRegistration.jsp");
		rd.forward(request, response);
		}
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
