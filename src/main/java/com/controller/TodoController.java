package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.TodoDao;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TodoController {

	@Autowired
	private TodoDao todoDao;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("todo/index");
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public ModelAndView findTodoById(HttpServletRequest request, HttpServletResponse response, @PathVariable int id) {

		String title = todoDao.findTodo(id);

		Map<String, Object> model = new HashMap<>();
		model.put("title", title);

		return new ModelAndView("todo/showTitle", "model", model);
	}



}
