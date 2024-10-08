package com.app.post;

import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public com.app.post.Result execute(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException;

}
