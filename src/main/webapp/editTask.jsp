<%@page import="com.simpletodo.model.Task"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Task task = (Task)request.getAttribute("task"); %>

<h2>Update task</h2>

	<form action="update-task" method="post">

		Enter task id: <input type="text" placeholder="Enter the id"
			name="taskId" value="<%=task.getTaskId()%>" readonly> <br>
		<br> Enter task title : <input type="text"
			placeholder="Enter the title" name="taskTitle" value="<%=task.getTaskTitle()%>" > <br>
		<br>Enter task description: <input type="text"
			placeholder="Enter the descripiton" name="taskDescription" value="<%=task.getTaskDescription()%>" > <br>
		<br>
			<input type="submit" value="Update">

	</form>

</body>
</html>