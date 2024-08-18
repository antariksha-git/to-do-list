package com.simpletodo.cotroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simpletodo.dao.TaskDao;
import com.simpletodo.model.Task;

@WebServlet("/show-task")
public class ShowTask extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Task> tasks = TaskDao.getAllTasks();
		req.setAttribute("tasks", tasks);
		
		req.getRequestDispatcher("viewTasks.jsp").forward(req, resp);
		
	}
	
}
