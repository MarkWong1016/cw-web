package com.cw.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController extends BaseController {
	
	@RequestMapping("/error")
	public String customError(HttpServletRequest request, HttpServletResponse response, Model model) {
		return PAGE_ERROR;
	}
}
