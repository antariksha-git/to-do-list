package com.simpletodo.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simpletodo.dao.TaskDao;

@WebServlet("/delete-task")
public class DeleteTask extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int taskId = Integer.parseInt(req.getParameter("taskId"));
		TaskDao.removeTask(taskId);
		
		resp.sendRedirect("show-task");
		
	}

}
