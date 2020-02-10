package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String F_name = request.getParameter("first_name");
		String L_name = request.getParameter("last_name");
		String C_name = request.getParameter("Dropdown");
		String[] language = request.getParameterValues("lang");
		String gender = request.getParameter("gender");

		PrintWriter out = response.getWriter();
		out.println("Welcome" + F_name);

		if (F_name.isEmpty() == false && L_name.isEmpty() == false && C_name.isEmpty() == false && language.length != 0
				&& gender.isEmpty() == false)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Success");
			dispatcher.forward(request, response);
			
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error");
			dispatcher.forward(request, response);
		}
		out.println("That's All");
	}

}
