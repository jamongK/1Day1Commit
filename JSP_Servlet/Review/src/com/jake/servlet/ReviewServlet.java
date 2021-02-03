package com.jake.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/ReviewServlet")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReviewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO doGet
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		
		response.setContentType("text/html; charset=utf-8");
		
		RequestDispatcher rqd = request.getRequestDispatcher("jsp/reviewResult1.jsp");
		rqd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO doPost
		request.setCharacterEncoding("utf-8");
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		
		RequestDispatcher rqd = request.getRequestDispatcher("/jsp/reviewResult1.jsp");
		rqd.forward(request, response);
	}

}
