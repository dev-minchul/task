package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostDAO;
import com.app.post.Action;
import com.app.post.Result;
import com.app.vo.PostVO;

public class PostListController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO(); 
		
		req.setAttribute("posts", postDAO.selectAll());
		result.setPath("list.jsp");
		return result;
	}

}
