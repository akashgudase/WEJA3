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

@WebServlet("/delete_student")
public class DeleteStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	StudentJDBC studentJDBC = new StudentJDBC();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		studentJDBC.deleteStudent(id);
		req.setAttribute("message", "Student deleted.");
		List<Student> students = studentJDBC.getAllStudents();
		req.setAttribute("students", students);
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("get_students.jsp");
		requestDispatcher.forward(req, resp);

	}

}
