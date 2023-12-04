package com.jspiders.studentmanagementsystem.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.studentmanagementsystem.jdbc.StudentJDBC;
import com.jspiders.studentmanagementsystem.object.Student;

@WebServlet("/update_student")
public class UpdateStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	StudentJDBC studentJDBC = new StudentJDBC();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		studentJDBC.updateStudent(id, name, email, mobile);
		List<Student> students = studentJDBC.getAllStudents();
		req.setAttribute("students", students);
		req.setAttribute("message", "Student updated.");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("get_students.jsp");
		requestDispatcher.forward(req, resp);
	}

}
