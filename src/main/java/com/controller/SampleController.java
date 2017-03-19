package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String show(Model model) {

		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from sample");

		model.addAttribute("data", list.get(0).get("name"));

		return "index";
	}

}
