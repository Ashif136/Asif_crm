package com.student_app1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_app1.model.DAOService;
import com.student_app1.model.DAOServiceImpl;

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
	
			DAOService service = new DAOServiceImpl();
			service.connectDB();
			
			boolean status = service.verifyCredentials(email , password);
			
			if(status==true) {
				
				RequestDispatcher rd = request.getRequestDispatcher("new_registration.jsp");
				rd.forward(request, response);
				
			} else {
				request.setAttribute("error", "invalid username/password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
	}

}
