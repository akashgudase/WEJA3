package com.jspiders.studentmanagementsystem.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.studentmanagementsystem.jdbc.StudentJDBC;
import com.jspiders.studentmanagementsystem.object.Student;

@WebServlet("/edit_student")
public class EditStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	StudentJDBC studentJDBC = new StudentJDBC();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student student = studentJDBC.getStudentById(id);
		req.setAttribute("student", student);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("update_student.jsp");
		requestDispatcher.forward(req, resp);
	}

}
