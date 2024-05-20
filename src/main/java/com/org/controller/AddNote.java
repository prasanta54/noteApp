package com.org.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.dto.Note;
import com.org.dto.User;

public class AddNote extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		String description=req.getParameter("descriptio");
		
		
		Note note=new Note();
		note.setTitle(title);
		note.setDescription(description);
		
		HttpSession session=req.getSession();
		User user=(User) session.getAttribute("userobj");
		
		
		List<Note> list=new ArrayList<>();
		User.add(note);
		
		User.setNoteList(list);
		note.setUser(user);
		
		UserDao dao=new UserDao();
	   dao.saveAndUpdateUser(user);
		
		
	}

}
