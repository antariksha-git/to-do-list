package com.simpletodo.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simpletodo.dao.TaskDao;
import com.simpletodo.model.Task;

@WebServlet("/add-task")
public class AddTask extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int taskId = Integer.parseInt(req.getParameter("taskId"));
		String taskTitle = req.getParameter("taskTitle");
		String taskDescription = req.getParameter("taskDescription");
		
		Task task = new Task(taskId, taskTitle, taskDescription);
		TaskDao.addTask(task);
		
		resp.sendRedirect("index.jsp");
		
	}
}
