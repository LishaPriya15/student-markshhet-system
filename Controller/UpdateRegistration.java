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


@WebServlet("/updateReg")
public class UpdateRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateRegistration() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String subject1 = request.getParameter("subject1");
		String subject2 = request.getParameter("subject2");
		String subject3 = request.getParameter("subject3");
		String subject4 = request.getParameter("subject4");
		String subject5 = request.getParameter("subject5");
		
		request.setAttribute("id", id);
		request.setAttribute("subject1", subject1);
		request.setAttribute("subject2", subject2);
		request.setAttribute("subject3", subject3);
		request.setAttribute("subject4", subject4);
		request.setAttribute("subject5", subject5);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/updateReg.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String subject1 = request.getParameter("subject1");
		String subject2 = request.getParameter("subject2");
		String subject3 = request.getParameter("subject3");
		String subject4 = request.getParameter("subject4");
		String subject5 = request.getParameter("subject5");
		
		ClassDAO dao=new ClassDAOImpl();
		dao.connectDB();
		
		dao.UpdateRegistration(id, subject1,subject2,subject3,subject4,subject5);
		
		ResultSet result = dao.readAllReg();
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/displayRegistration.jsp");
		rd.forward(request, response);
	}

}
