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


@WebServlet("/newReg")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String subject1 = request.getParameter("subject1");
		String subject2 = request.getParameter("subject2");
		String subject3 = request.getParameter("subject3");
		String subject4 = request.getParameter("subject4");
		String subject5 = request.getParameter("subject5");
		
		ClassDAO dao=new ClassDAOImpl();
		dao.connectDB();
		
		dao.saveReg(id,name,subject1,subject2,subject3,subject4,subject5);
		
		request.setAttribute("msg", "record is saved");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/newReg.jsp");
		rd.include(request, response);
	}

}
