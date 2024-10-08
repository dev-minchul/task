<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>게시글번호</th>
			<th>게시글제목</th>
			<th>게시글내용</th>
		</tr>
		<%
			List<PostVO> posts = (List<PostVO>)request.getAttribute("posts");
				for(PostVO post : posts){
		%>
			<tr>
				<td><%=post.getId() %></td>
				<td><a href="read.post?id=<%=post.getId() %>"><%=post.getPostTitle() %></a></td>
				<td><%=post.getPostContent() %></td>
			</tr>
				
		<%	
				}
		%>
	</table>

</body>
</html>