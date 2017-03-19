package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.TodoDao;

@Controller
public class TodoController {

	@Autowired
	private TodoDao todoDao;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public String index() {
		return "todo/index";
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public String findTodoById(Model model, @PathVariable int id) {

		String title = todoDao.findTodo(id);

		model.addAttribute("title", title);

		return "todo/showTitle";
	}



}
