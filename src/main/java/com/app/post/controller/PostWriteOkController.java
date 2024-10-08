package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostDAO;
import com.app.post.Action;
import com.app.post.Result;
import com.app.vo.PostVO;

public class PostWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		Result result = new Result();
		
		
		postVO.setPostTitle(req.getParameter("postTitle"));
		postVO.setPostContent(req.getParameter("postContent"));
		
		postDAO.insert(postVO);
		
		System.out.println(req.getParameter("postTitle"));
		System.out.println(req.getParameter("postContent"));
		
		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/list.post?id=" + postDAO.selectId());
		
	
		
		return result;
	}

}
