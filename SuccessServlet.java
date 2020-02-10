package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String F_name = request.getParameter("first_name");
		String L_name = request.getParameter("last_name");
		String C_name = request.getParameter("Dropdown");
		String[] language = request.getParameterValues("lang");
		
		String gender = request.getParameter("gender");
		PrintWriter out = response.getWriter();
		out.println("  "+F_name);
		out.println("  "+L_name);
		out.println("  "+C_name);
		for(String i: language)
		{
			out.println(i);
		}
		out.println("  "+language);
		out.println("  "+gender);
	}

}
