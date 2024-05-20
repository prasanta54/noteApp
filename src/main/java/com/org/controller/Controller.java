package com.org.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.dto.User;
@WebServlet("/")

public class Controller {
	protected void dopost(HttpServletRequest req,HttpServletResponse resp) {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long mobile=Long.parseLong(req.getParameter("mobile"));
		
		
		User user=new User();
		user.setName(name);
		user.setAge(age);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile(mobile);
		
		
		UserDao dao=new UserDao();
		dao.saveAndUpdateUser(user);
		
		
		HttpSession session=req.getSession();
		session.setAttribute("success", "Registration successfyly");
		
		req.sendRedirect("register.jsp");
		
		
		
		

	}

}
