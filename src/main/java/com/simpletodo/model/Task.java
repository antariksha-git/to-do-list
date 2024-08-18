package com.simpletodo.model;

public class Task {
	private int taskId;
	private String taskTitle;
	private String taskDescription;

	public Task(int taskId, String taskTitle, String taskDescription) {
		this.taskId = taskId;
		this.taskTitle = taskTitle;
		this.taskDescription = taskDescription;
	}
	
	public Task() {
		
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	@Override
	public String toString() {
		return String.format("Task [taskId=%s, taskTitle=%s, taskDescription=%s]", taskId, taskTitle, taskDescription);
	}
}
