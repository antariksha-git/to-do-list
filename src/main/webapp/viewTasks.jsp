<%@page import="com.simpletodo.model.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 100%;
	border-collapse: collapse;
	margin: 20px 0;
	font-size: 18px;
	text-align: left;
}

th, td {
	padding: 12px;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #f2f2f2;
	color: #333;
}

tr:hover {
	background-color: #f5f5f5;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

tr:nth-child(odd) {
	background-color: #ffffff;
}

th:first-child, td:first-child {
	border-right: 1px solid #ddd;
}

th:last-child, td:last-child {
	border-left: 1px solid #ddd;
}

caption {
	caption-side: bottom;
	padding-top: 10px;
	font-style: italic;
}
</style>

</head>
<body>

	<%
	List<Task> tasks = (List<Task>) request.getAttribute("tasks");
	%>
	<h2>List of tasks</h2>

	<%
	if (tasks != null && !tasks.isEmpty()) {
	%>

	<table>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>Description</th>
			<th>completed</th>
			<th>delete</th>
		</tr>

		<%
		for (Task task : tasks) {
		%>

		<tr>
			<td><%=task.getTaskId()%></td>
			<td><%=task.getTaskTitle()%></td>
			<td><%=task.getTaskDescription()%></td>
			<!-- Have not written code for completed. If someone can help, do let me know... while I think.. -->
			<td><a href="#">completed</a></td>
			<td><a href="delete-task?taskId=<%=task.getTaskId()%>">delete</a></td>
		</tr>

		<%}%>

	</table>

	<%} else {%>
	<p>Currently, you have no task added</p>
	<%
	}
	%>
</body>
</html>