<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	<form action="update-ok.post" method="post">
		<div>
			<input name="id" type="hidden" value="<%=post.getId()  %>"/>
		</div>
		<div>
			<span>게시물제목</span><input name="postTitle" type="text" value="<%=post.getPostTitle() %>" />
		</div>
		<div>
			<span>게시물내용</span><input name="postContent" type="text" value="<%=post.getPostContent() %>" />
		</div>
		<button>게시물 수정</button>
	</form>

</body>
</html>