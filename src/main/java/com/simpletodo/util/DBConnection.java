package com.simpletodo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.simpletodo.model.Task;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/task_db";
	private static final String USER = "root";
	private static final String PASS = "password";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void addTask(Task task) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement ps = con.prepareStatement("INSERT INTO task VALUES (?, ?, ?)")) {

			ps.setInt(1, task.getTaskId());
			ps.setString(2, task.getTaskTitle());
			ps.setString(3, task.getTaskDescription());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void removeTask(int taskId) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement ps = con.prepareStatement("DELETE FROM task WHERE id=?")) {

			ps.setInt(1, taskId);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Task> getAllTasks() {

		List<Task> tasks = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL, USER, PASS); 
				Statement st = con.createStatement()) {

			ResultSet rs = st.executeQuery("SELECT * FROM task");

			while (rs.next()) {

				int taskId = rs.getInt(1);
				String taskTitle = rs.getString(2);
				String taskDescription = rs.getString(3);
				Task task = new Task(taskId, taskTitle, taskDescription);

				tasks.add(task);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tasks;
	}
}
