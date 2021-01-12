package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
       
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set a hard cod username and password
		String username="Zulu";
		String password="password";
		
		String ur=request.getParameter("username");
		String pw=request.getParameter("password");
		
		/*
		 * commpair the hard code user name and password with the user entery
		and if they put the correct username and password redirect them to the successful page
		if they enter the wrong entry show the message that they enter wrong user name or password and redirect the to the login page
		so they can log in again.
		*/
		if (username.equals(ur) && password.equals(pw)){
			response.sendRedirect("success");
		}else {
			response.sendRedirect("error");
		}

	}

}
