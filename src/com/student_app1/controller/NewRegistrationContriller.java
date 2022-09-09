package com.student_app1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_app1.model.DAOService;
import com.student_app1.model.DAOServiceImpl;

@WebServlet("/newreg")
public class NewRegistrationContriller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewRegistrationContriller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		
		service.createRegistration(name,city,email,mobile);
	
	}

}
