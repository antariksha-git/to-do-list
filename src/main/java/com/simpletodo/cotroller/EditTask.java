package com.simpletodo.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simpletodo.dao.TaskDao;
import com.simpletodo.model.Task;

@WebServlet("/edit-task")
public class EditTask extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int taskId = Integer.parseInt(req.getParameter("taskId"));
		Task task = TaskDao.findTaskById(taskId);
		
		req.setAttribute("task", task);
		
		
		req.getRequestDispatcher("editTask.jsp").forward(req, resp);
		
	}
}
