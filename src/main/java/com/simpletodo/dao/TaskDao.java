package com.simpletodo.dao;

import java.util.List;

import com.simpletodo.model.Task;
import com.simpletodo.util.DBConnection;

public class TaskDao {
	public static void addTask(Task task) {
		DBConnection.addTask(task);

	}

	public static void removeTask(int taskId) {
		DBConnection.removeTask(taskId);
	}

	public static List<Task> getAllTasks() {
		return DBConnection.getAllTasks();
	}
}
