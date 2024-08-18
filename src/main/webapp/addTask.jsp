<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add task</title>
</head>
<body>

	<h2>Add task</h2>

	<form action="add-task" method="post">

		Enter task id: <input type="text" placeholder="Enter the id"
			name="taskId"> <br>
		<br> Enter task title : <input type="text"
			placeholder="Enter the title" name="taskTitle"> <br>
		<br>Enter task description: <input type="text"
			placeholder="Enter the descripiton" name="taskDescription"> <br>
		<br>
			<input type="submit" value="Add">

	</form>

</body>
</html>